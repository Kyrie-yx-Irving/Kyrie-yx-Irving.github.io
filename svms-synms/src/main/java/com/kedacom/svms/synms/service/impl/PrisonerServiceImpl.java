package com.kedacom.svms.synms.service.impl;

import com.kedacom.svms.synms.entity.PrisonerEntity;
import com.kedacom.svms.synms.repository.PrisonerRepository;
import com.kedacom.svms.synms.service.PrisonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Do some things
 * @author  yanxun
 * 2019.12.19
 */


@Service
@Transactional
public class PrisonerServiceImpl implements PrisonerService {

    @Autowired
    private PrisonerRepository prisonerRepository;

    @Override
    public PrisonerEntity save(PrisonerEntity entity) {
        return prisonerRepository.save(entity);
    }

    @Override
    public Integer selectAutoIncrement() {
        return prisonerRepository.selectAutoIncrement();
    }

    @Override
    public List<PrisonerEntity> findAll() {
        return prisonerRepository.findAll();
    }
}
