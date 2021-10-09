package com.bridgelabz.Employe_Payroll_app.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class EmployePayrollEntity {
    @Id
    private int id;
    private String name;
    private int salary;

}
