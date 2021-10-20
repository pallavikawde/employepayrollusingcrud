package com.bridgelabz.Employe_Payroll_app.repository;

import com.bridgelabz.Employe_Payroll_app.entity.EmployePayrollEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeRepository extends JpaRepository<EmployePayrollEntity,Integer> {

    Optional<EmployePayrollEntity> findByName(String name);
}
