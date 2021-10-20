package com.bridgelabz.Employe_Payroll_app.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
@AllArgsConstructor
public class ApiExceptions {
    private Date Timestamp;
    private String message;
    private String details;

    }






