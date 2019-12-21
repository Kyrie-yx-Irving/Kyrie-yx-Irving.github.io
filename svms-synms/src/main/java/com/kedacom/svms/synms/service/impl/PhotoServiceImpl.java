package com.kedacom.svms.synms.service.impl;

import com.kedacom.svms.synms.entity.PhotoEntity;
import com.kedacom.svms.synms.repository.PhotoRepository;
import com.kedacom.svms.synms.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Do some things
 * @author  yanxun
 * 2019.12.19
 */


@Service
@Transactional
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    @Override
    public PhotoEntity savePhone(PhotoEntity entity) {
        return photoRepository.save(entity);
    }
}
