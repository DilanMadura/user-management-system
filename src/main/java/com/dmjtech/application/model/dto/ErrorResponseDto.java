package com.dmjtech.application.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Project mobile-house-manage-system
 * @Version 1.0.0
 * @Author Dilan Madura Jayaneththi , ddmdilan@gmail.com
 * @Date 04, January 2023, 8:38 PM
 * @Countory Sri Lanka
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponseDto {
    private String errorCode;
    private String errorMessage;
}
