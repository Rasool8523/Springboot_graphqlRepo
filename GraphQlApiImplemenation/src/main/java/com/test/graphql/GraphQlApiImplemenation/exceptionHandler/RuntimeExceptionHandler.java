package com.test.graphql.GraphQlApiImplemenation.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.test.graphql.GraphQlApiImplemenation.model.ErrorResponse;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class RuntimeExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ErrorResponse> handleRuntime(RuntimeException ex,HttpServletRequest req) {
	  ErrorResponse response = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),HttpStatus.BAD_REQUEST.getReasonPhrase(),ex.getMessage(),req.getPathInfo());
	  return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}
}
