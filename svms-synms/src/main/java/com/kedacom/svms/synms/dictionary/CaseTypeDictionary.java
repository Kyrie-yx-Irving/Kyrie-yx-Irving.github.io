package com.kedacom.svms.synms.dictionary;

import com.kedacom.svms.synms.client.SdmsClient;
import com.kedacom.svms.synms.entity.SvDictItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CaseTypeDictionary {

    private SdmsClient sdmsClient;

    private Map<String, String> caseTypeMap = new HashMap<>();

    @Autowired
    public CaseTypeDictionary(SdmsClient sdmsClient) {
        this.sdmsClient = sdmsClient;
        initialize();
    }

    public String getCaseTypeCode(String caseType) {
        return caseTypeMap.get(caseType);
    }

    private void initialize() {
        for (SvDictItem svDictItem : sdmsClient.findAllCharges())
            caseTypeMap.put(svDictItem.getName(), svDictItem.getCode());
    }
}
