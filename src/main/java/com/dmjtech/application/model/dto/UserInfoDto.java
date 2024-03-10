package com.dmjtech.application.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoDto {
    @Schema(description = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer id;

    @Schema(description = "user name", example = "Dilan Jayaneththi", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;

    @Schema(description = "email", example = "d@gmail.com", requiredMode = Schema.RequiredMode.REQUIRED)
    private String email;
}
