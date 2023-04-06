package com.example.projectcost.entity;

import javax.persistence.*;
@Entity
public class LaborCostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer minutes;
    private Integer hourlyRate;

}
