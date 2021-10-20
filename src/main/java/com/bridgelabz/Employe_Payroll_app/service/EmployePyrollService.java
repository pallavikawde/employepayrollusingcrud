package com.bridgelabz.Employe_Payroll_app.service;

import com.bridgelabz.Employe_Payroll_app.dto.EmployeDto;
import com.bridgelabz.Employe_Payroll_app.entity.EmployePayrollEntity;
import com.bridgelabz.Employe_Payroll_app.repository.EmployeRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;
@Slf4j
@Service
public class EmployePyrollService {

    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private ModelMapper modelMapper;



    public EmployePayrollEntity getname(String name) {
        Optional<EmployePayrollEntity> employePayrollEntity = employeRepository.findByName(name);
        if (employePayrollEntity.isPresent()) {
            log.info("getting name");
            return employePayrollEntity.get();

        }
        return null;
    }

    public EmployePayrollEntity addEmploye(EmployeDto employeDto) {
        EmployePayrollEntity employePayrollEntity = new EmployePayrollEntity();
        modelMapper.map(employeDto, employePayrollEntity);
       return employeRepository.save(employePayrollEntity);


//        public EmployePayrollEntity addEmploye(EmployePayrollEntity employe)
//        EmployePayrollEntity employePayrollEntity =new EmployePayrollEntity();
//        employePayrollEntity.setName(employeDto.getName());
//        employePayrollEntity.setSalary(employeDto.getSalary());
//    }



    }

    public EmployePayrollEntity editId(EmployeDto employeDto) {
        Optional<EmployePayrollEntity> employePayrollEntity = employeRepository.findById(id);
        if (employePayrollEntity.isPresent()) {
            employePayrollEntity.setname(employeDto.getName());
            employePayrollEntity.setId(employeDto.getId());
            return employeRepository.save(employePayrollEntity.get());
        }
        return null;

}

    public String deletName(EmployeDto employeDto) {
         Optional<EmployePayrollEntity> employePayrollEntity = employeRepository.delete(name);
         if(employePayrollEntity.isPresent()){
             return employeRepository.delete(employePayrollEntity.get());
             return "record is deleted";
         }
         return "record not exists";

    }
    }
