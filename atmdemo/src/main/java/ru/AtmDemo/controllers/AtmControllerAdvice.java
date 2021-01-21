package ru.AtmDemo.controllers;
import ru.AtmDemo.exceptions.AtmSystemException;
import ru.AtmDemo.models.ErrorResponse;


public class AtmControllerAdvice extends ResponseEntityExceptionHandler {

    protected Object handleAccountNotFoundException(AtmSystemException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage());
        return new ErrorResponse(errorResponse,HttpStatus.NOT_FOUND);
    }
}

