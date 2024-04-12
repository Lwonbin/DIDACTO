package com.didacto.dto.enrollment;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(title = "Enrollemnt : 등록요청 취소")
public class EnrollmentCancelRequest {

    @NotBlank(message = "등록요청 기록의 ID가 입력되지 않았습니다.")
    @Schema(example = "1")
    private Long enrollmentId;

}
