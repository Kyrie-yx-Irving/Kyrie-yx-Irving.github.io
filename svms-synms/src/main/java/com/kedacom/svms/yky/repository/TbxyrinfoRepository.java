package com.kedacom.svms.yky.repository;

import com.kedacom.svms.yky.entity.TbxyrinfoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Do some things
 * @author  yanxun
 * 2019.12.19
 */

@Repository
public interface TbxyrinfoRepository extends JpaRepository<TbxyrinfoEntity, Integer>, JpaSpecificationExecutor<TbxyrinfoEntity> {

    @Query(nativeQuery = true, value = "SELECT AUTO_INCREMENT FROM information_schema.tables WHERE " +
            "TABLE_NAME = 'tbxyrinfo' AND TABLE_SCHEMA = 'yky'")
    Integer selectAutoIncrement();


    @Query(nativeQuery = true, value = "select * from tbxyrinfo where zid >= ?1 and zid < ?2")
    List<TbxyrinfoEntity> selectFromIdRange(Integer min, Integer max);
}
