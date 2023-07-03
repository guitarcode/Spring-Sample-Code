package sem.sample.baseresponse.exception;

import lombok.Getter;

@Getter
public class CustomInternalServerErrorException extends CustomException {
    public CustomInternalServerErrorException(ErrorCode errorCode) {
        super(errorCode);
    }
}
