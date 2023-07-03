package sem.sample.baseresponse.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sem.sample.baseresponse.base.BaseResponse;
import sem.sample.baseresponse.exception.CustomBadRequestException;
import sem.sample.baseresponse.exception.CustomException;
import sem.sample.baseresponse.exception.CustomNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public BaseResponse customNotFoundHandler(CustomNotFoundException e) {
        return BaseResponse.fail(e.getErrorCode());
    }

    @ExceptionHandler(CustomBadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BaseResponse customBadRequestHandler(CustomBadRequestException e) {
        return BaseResponse.fail(e.getErrorCode());
    }
}
