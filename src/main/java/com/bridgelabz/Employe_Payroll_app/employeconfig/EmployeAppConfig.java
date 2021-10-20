package com.bridgelabz.Employe_Payroll_app.employeconfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class EmployeAppConfig {


    @Bean
   public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
