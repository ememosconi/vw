package com.vw.msseed.adapter.rest.exception;


import com.vw.msseed.config.ErrorCode;
import com.vw.msseed.config.GenericException;

public final class TimeoutRestClientException extends GenericException {

    public TimeoutRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }

}
