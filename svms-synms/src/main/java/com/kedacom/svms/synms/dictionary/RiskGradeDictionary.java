package com.kedacom.svms.synms.dictionary;

import com.kedacom.svms.synms.client.SdmsClient;
import com.kedacom.svms.synms.entity.SvDictItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RiskGradeDictionary {

    private final SdmsClient sdmsClient;

    //
    private Map<String,String> riskGradeMap = new HashMap<>();

    @Autowired
    public RiskGradeDictionary(SdmsClient sdmsClient) {
        this.sdmsClient = sdmsClient;
        initialize();
    }


    public String getRiskGradeCode(String riskGrade) {
        return riskGradeMap.get(riskGrade);
    }

    private void initialize() {
        for (SvDictItem svDictItem : sdmsClient.findAllRiskGrade()) {
            riskGradeMap.put(svDictItem.getName(), svDictItem.getCode());
        }
    }
}
