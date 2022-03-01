package com.ifa.askop.core.utilities.results;

public abstract class IResult {
    private boolean success;
    private String message;

    public IResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public IResult(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
