package com.kpr.training.jdbc.exceptions;

public enum ExceptionCode implements ErrorCodeConstant {

    INVALID_INPUT(INVALID_INPUT_CODE, "Invalid input"),
    UPDATE_FAILED(UPDATE_FAILED_CODE, "Updation failed"),
    DELETE_FAILED(DELETE_FAILED_CODE, "Deletion failed"),
    NOT_FOUND(NOT_FOUND_CODE, "Request not found"),
    READ_FAILED(READ_FAILED_CODE, "Read failed"),
    CREATE_FAILED(CREATE_FAILED_CODE, "Read failed");

    private final int id;
    private final String errorMessage;

    ExceptionCode(int id, String errorMessage) {
        this.id = id;
        this.errorMessage = errorMessage;
    }

    public int getId() {
        return this.id;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
