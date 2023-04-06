package com.example.projectcost.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.projectcost.entity.LaborCostEntity;

@Repository
public interface LaborCostRepository extends CrudRepository<LaborCostEntity, Integer> {
}
