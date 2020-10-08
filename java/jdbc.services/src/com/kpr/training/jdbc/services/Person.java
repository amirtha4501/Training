package com.kpr.training.jdbc.services;

import com.kpr.training.jdbc.exception.AppException;
import com.kpr.training.jdbc.exception.ExceptionCode;

class Person {
	public static void main(String[] args) throws AppException {
        // Test
        int no = 2;
        
        try {			
            if(no == 2) {
                throw new AppException(ExceptionCode.NOT_FOUND, "Invalid");
            }
        } catch(AppException e) {
            System.out.println(e.getErrorCode());
            System.out.println(e.getErrorMessage());			
        }
    }
}