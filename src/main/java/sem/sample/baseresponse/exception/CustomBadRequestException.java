package sem.sample.baseresponse.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class CustomBadRequestException extends CustomException {
    public CustomBadRequestException(ErrorCode errorCode) {
        super(errorCode);
    }
}
