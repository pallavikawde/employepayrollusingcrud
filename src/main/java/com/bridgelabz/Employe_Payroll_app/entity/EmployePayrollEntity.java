package com.bridgelabz.Employe_Payroll_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor

public class EmployePayrollEntity {
    @Id
    private int id;
    private String name;
    private double salary;
    private String dept;
    private String startdate;
    private String  notes;

}
