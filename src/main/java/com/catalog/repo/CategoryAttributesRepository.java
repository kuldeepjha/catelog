package com.catalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalog.entity.CategoryAttributesEntity;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Repository
public interface CategoryAttributesRepository extends JpaRepository<CategoryAttributesEntity, Integer> {

}