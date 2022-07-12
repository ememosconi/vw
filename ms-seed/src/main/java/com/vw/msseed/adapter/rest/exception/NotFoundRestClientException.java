package com.vw.msseed.adapter.rest.exception;


import com.vw.msseed.config.ErrorCode;
import com.vw.msseed.config.GenericException;

public final class NotFoundRestClientException extends GenericException {

    public NotFoundRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }
}
