package com.catalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalog.entity.CategoryEntity;

/**
 * 
 * @author Kuldeep.Jha
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {

}