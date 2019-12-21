package com.kedacom.svms.synms.dictionary;


import com.kedacom.svms.synms.client.SdmsClient;
import com.kedacom.svms.synms.entity.SvDictItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SexDictionary {


    private final SdmsClient sdmsClient;

    // 其中key为性别的中文字符串,value为性别的编码
    private Map<String, String> sexMap = new HashMap<>();


    @Autowired
    public SexDictionary(SdmsClient sdmsClient) {
        this.sdmsClient = sdmsClient;
        initialize();
    }

    public String getSexCode(String sex) {
        return sexMap.get(sex);
    }

    private void initialize() {
        for (SvDictItem svDictItem : sdmsClient.findAllSexType())
            sexMap.put(svDictItem.getName(), svDictItem.getCode());
        sexMap.put("男", "1");
        sexMap.put("女", "2");
    }

}
