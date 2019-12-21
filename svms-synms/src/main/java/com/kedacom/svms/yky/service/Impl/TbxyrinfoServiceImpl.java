package com.kedacom.svms.yky.service.Impl;

import com.kedacom.svms.yky.entity.TbxyrinfoEntity;
import com.kedacom.svms.yky.repository.TbxyrinfoRepository;
import com.kedacom.svms.yky.service.TbxyrinfoService;
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
public class TbxyrinfoServiceImpl implements TbxyrinfoService {

    @Autowired
    private TbxyrinfoRepository tbxyrinfoRepository;

    @Override
    public List<TbxyrinfoEntity> findAll() {
        return tbxyrinfoRepository.findAll();
    }

    @Override
    public Integer selectIncrement() {
        return tbxyrinfoRepository.selectAutoIncrement();
    }

    @Override
    public List<TbxyrinfoEntity> selectFromIdRange(int min, int max) {
        return tbxyrinfoRepository.selectFromIdRange(min, max);
    }
}
