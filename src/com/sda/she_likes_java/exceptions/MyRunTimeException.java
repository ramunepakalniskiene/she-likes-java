package com.sda.she_likes_java.exceptions;

public class MyRunTimeException extends RuntimeException {
    public MyRunTimeException() {
    }

    public MyRunTimeException(String message) {
        super(message);
    }

    public MyRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyRunTimeException(Throwable cause) {
        super(cause);
    }

    public MyRunTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
