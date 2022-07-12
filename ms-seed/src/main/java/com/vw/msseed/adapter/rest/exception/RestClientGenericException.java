package com.vw.msseed.adapter.rest.exception;


import com.vw.msseed.config.ErrorCode;
import com.vw.msseed.config.GenericException;

public final class RestClientGenericException extends GenericException {

    public RestClientGenericException(ErrorCode errorCode) {
        super(errorCode);
    }

}
