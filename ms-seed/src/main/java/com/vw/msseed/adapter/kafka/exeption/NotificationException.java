package com.vw.msseed.adapter.kafka.exeption;


import com.vw.msseed.config.ErrorCode;
import com.vw.msseed.config.GenericException;

public class NotificationException extends GenericException {

    public NotificationException(ErrorCode ec){
        super(ec);
    }
}
