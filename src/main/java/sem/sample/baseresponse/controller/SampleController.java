package sem.sample.baseresponse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sem.sample.baseresponse.base.BaseResponse;
import sem.sample.baseresponse.dto.SampleDto;
import sem.sample.baseresponse.exception.CustomNotFoundException;
import sem.sample.baseresponse.exception.ErrorCode;

import java.util.Optional;

@RequestMapping("/sample")
@RestController
public class SampleController {

    @GetMapping("/success")
    public BaseResponse<SampleDto> successSample() {
        SampleDto sampleDto = SampleDto.builder()
                .id(1L)
                .title("제목")
                .content("내용")
                .build();

        return BaseResponse.ok(sampleDto);
    }

    @GetMapping("/fail")
    public BaseResponse<SampleDto> failSample() {

        Optional<SampleDto> emptySampleDto = Optional.empty();

        SampleDto sampleDto = emptySampleDto.orElseThrow(() -> {
            throw new CustomNotFoundException(ErrorCode.NOT_FOUND_SAMPLE);
        });

        return BaseResponse.ok(sampleDto);
    }
}
