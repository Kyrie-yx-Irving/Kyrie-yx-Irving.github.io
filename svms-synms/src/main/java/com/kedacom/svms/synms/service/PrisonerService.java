package com.kedacom.svms.synms.service;

import com.kedacom.svms.synms.entity.PrisonerEntity;

import java.util.List;

/**
 * Do some things
 * @author  yanxun
 * 2019.12.19
 */


public interface PrisonerService {
    PrisonerEntity save(PrisonerEntity entity);

    Integer selectAutoIncrement();

    List<PrisonerEntity> findAll();
}
