package com.vw.msseed.adapter.rest.exception;


import com.vw.msseed.config.ErrorCode;
import com.vw.msseed.config.GenericException;

public final class BadRequestRestClientException extends GenericException {

    public BadRequestRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }
}
