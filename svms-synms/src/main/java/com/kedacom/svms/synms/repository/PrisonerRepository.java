package com.kedacom.svms.synms.repository;

import com.kedacom.svms.synms.entity.PrisonerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Do some things
 * @author  yanxun
 * 2019.12.19
 */

@Repository
public interface PrisonerRepository extends JpaRepository<PrisonerEntity, Integer>, JpaSpecificationExecutor<PrisonerEntity> {

    @Query(nativeQuery = true, value = "SELECT AUTO_INCREMENT FROM information_schema.tables WHERE " +
            "TABLE_NAME = 'sv_prisoner' AND TABLE_SCHEMA = 'kss'")
    Integer selectAutoIncrement();
}
