package com.vw.msseed.application.exception;


import com.vw.msseed.config.ErrorCode;
import com.vw.msseed.config.GenericException;

public class BusinessException extends GenericException {

    public BusinessException(ErrorCode errorCode){
        super(errorCode);
    }
}
