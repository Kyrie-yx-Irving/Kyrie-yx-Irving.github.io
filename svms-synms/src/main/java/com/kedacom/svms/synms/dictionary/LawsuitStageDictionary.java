package com.kedacom.svms.synms.dictionary;

import com.kedacom.svms.synms.client.SdmsClient;
import com.kedacom.svms.synms.entity.SvDictItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class LawsuitStageDictionary {
    private final SdmsClient sdmsClient;

    private Map<String,String> lawsuitStageMap = new HashMap<>();

    @Autowired
    public LawsuitStageDictionary(SdmsClient sdmsClient) {
        this.sdmsClient = sdmsClient;
        initialize();
    }

    public String getLawsuitStageCode(String lawsuitStage) {
        return lawsuitStageMap.get(lawsuitStage);
    }


    private void initialize() {
        for (SvDictItem svDictItem : sdmsClient.findAllLawsuitStage()) {
            lawsuitStageMap.put(svDictItem.getName(), svDictItem.getCode());
        }
    }


}
