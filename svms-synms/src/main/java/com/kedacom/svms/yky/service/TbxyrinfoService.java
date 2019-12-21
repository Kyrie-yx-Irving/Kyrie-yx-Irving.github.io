package com.kedacom.svms.yky.service;

import com.kedacom.svms.yky.entity.TbxyrinfoEntity;

import java.util.List;

/**
 * Do some things
 * @author  yanxun
 * 2019.12.19
 */


public interface TbxyrinfoService {
    List<TbxyrinfoEntity> findAll();

    Integer selectIncrement();

    List<TbxyrinfoEntity> selectFromIdRange(int min, int max);
}
