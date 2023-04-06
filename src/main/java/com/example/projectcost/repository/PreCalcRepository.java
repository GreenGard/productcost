package com.example.projectcost.repository;

import com.example.projectcost.entity.PreCalcEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreCalcRepository extends CrudRepository<PreCalcEntity, Integer> {
}
