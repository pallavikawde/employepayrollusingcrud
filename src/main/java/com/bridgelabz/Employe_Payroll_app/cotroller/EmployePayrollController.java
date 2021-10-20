package com.bridgelabz.Employe_Payroll_app.cotroller;

import com.bridgelabz.Employe_Payroll_app.dto.EmployeDto;
import com.bridgelabz.Employe_Payroll_app.entity.EmployePayrollEntity;
import com.bridgelabz.Employe_Payroll_app.service.EmployePyrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployePayrollController {
    @Autowired
 private EmployePyrollService employePyrollService;

    @GetMapping(value= "/getting_name")
    public EmployePayrollEntity getname(String name){
        return employePyrollService.getname(name);
    }
    @PostMapping(value="/add_employe")
    public EmployePayrollEntity addEmployee(@RequestBody EmployeDto employeDto){
        return employePyrollService.addEmploye(employeDto);
    }
    @PutMapping( value ="/edit id")
    public EmployePayrollEntity editId(@RequestBody EmployeDto employeDto){
        return employePyrollService.editId(employeDto);
    }
    @DeleteMapping(value="/delet_name")
    public String deletname(@RequestBody EmployeDto employeDto){
        return employePyrollService.deletName(employeDto);
    }

}
