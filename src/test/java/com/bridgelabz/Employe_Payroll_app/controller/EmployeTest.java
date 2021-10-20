package com.bridgelabz.Employe_Payroll_app.controller;

import com.bridgelabz.Employe_Payroll_app.cotroller.EmployePayrollController;
import com.bridgelabz.Employe_Payroll_app.dto.EmployeDto;
import com.bridgelabz.Employe_Payroll_app.entity.EmployePayrollEntity;
import com.bridgelabz.Employe_Payroll_app.service.EmployePyrollService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
       import java.util.List;

public class EmployeTest {

    @InjectMocks
    private EmployePayrollController employePayrollController;
    @Mock
    private EmployePyrollService employePyrollService;

//    @BeforeEach
//      public void employeDetails() {
//        List<EmployePayrollEntity> employePayrollEntities = new ArrayList<EmployePayrollEntity>();
//        employePayrollEntities.add(1,"pallavi",2300,"notes","Electrical","22-4-2020");
//
//
//    }

        @Test
     public void Addemployee() {
        EmployePayrollEntity employePayrollEntity = new EmployePayrollEntity();
        employePayrollEntity.setId(1);
        employePayrollEntity.setName("pallavi");
        employePayrollEntity.setSalary(2300);
        EmployePayrollEntity employePayrollEntity2 = new EmployePayrollEntity();
        employePayrollEntity.setId(1);
        employePayrollEntity.setName("kirti");
        employePayrollEntity.setSalary(2300);
        List<EmployePayrollEntity>employePayrollEntities = new ArrayList<>();
        employePayrollEntities.add(employePayrollEntity);
        employePayrollEntities.add(employePayrollEntity2);
        Mockito.when(employePyrollService.addEmploye(EmployeDto)).thenReturn(EmployePayrollEntity);

    }
}
