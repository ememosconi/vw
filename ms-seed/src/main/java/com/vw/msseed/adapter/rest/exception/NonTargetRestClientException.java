package com.vw.msseed.adapter.rest.exception;


import com.vw.msseed.config.ErrorCode;
import com.vw.msseed.config.GenericException;

public final class NonTargetRestClientException extends GenericException {

    public NonTargetRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }

}
