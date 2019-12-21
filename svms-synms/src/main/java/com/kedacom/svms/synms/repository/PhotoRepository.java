package com.kedacom.svms.synms.repository;

import com.kedacom.svms.synms.entity.PhotoEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Do some things
 * @author  yanxun
 * 2019.12.19
 */

@Repository
public interface PhotoRepository extends JpaRepository<PhotoEntity, Integer>, JpaSpecificationExecutor<PhotoEntity> {


}
