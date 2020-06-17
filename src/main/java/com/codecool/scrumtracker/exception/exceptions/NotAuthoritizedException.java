package com.codecool.scrumtracker.exception.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NotAuthoritizedException extends Exception {
    public NotAuthoritizedException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }


}
