package com.vw.msseed.adapter.rest.exception;


import com.vw.msseed.config.ErrorCode;
import com.vw.msseed.config.GenericException;

public class ConflictRestClientException extends GenericException {
    public ConflictRestClientException(ErrorCode ec) {
        super(ec);
    }
}
