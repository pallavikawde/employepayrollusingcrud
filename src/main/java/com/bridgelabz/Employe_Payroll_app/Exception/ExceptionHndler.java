package com.bridgelabz.Employe_Payroll_app.Exception;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHndler {
@ExceptionHandler(value ={ErrorDetails.class})
public ResponseEntity<Object>handleapiexception(ErrorDetails e) {
//create payload containing exception detail
    HttpStatus badrequest = new HttpStatus.BAD_REQUEST;
    new ApiExceptions(
            e.getMessage(),
            e,
            badrequest,
            Timestamp.

    )


    //Return response entity

}
}
