package org.andrew.fileHandler.helper;

import lombok.Data;


@Data
public class GlobalException extends RuntimeException{

    private String errCode = ErrorCode.GENERALFAIL.getErrorCode();


    private String message;

    public GlobalException(ErrorCode errorCode) {
        this.errCode = errorCode.getErrorCode();
        this.message = errorCode.getErrorMessage();
    }

    public GlobalException(ErrorCode errorCode, String message){
        this.errCode = errorCode.getErrorCode();
        this.message = errorCode.getErrorMessage();
    }

    public GlobalException(String message, String code) {
        this.message = message;
        this.errCode = code;
    }


}
