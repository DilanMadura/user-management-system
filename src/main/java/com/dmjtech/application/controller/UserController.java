package com.dmjtech.application.controller;

import com.dmjtech.application.model.dto.ErrorResponseDto;
import com.dmjtech.application.model.dto.UserInfoDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Project mobile-house-manage-system
 * @Version 1.0.0
 * @Author Dilan Madura Jayaneththi , ddmdilan@gmail.com
 * @Date 15, January 2023, 12:05 AM
 * @Countory Sri Lanka
 */

@RestController
@RequestMapping("${base-url.context}/user")
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "USER", description = "USER")
public class UserController {

    @Operation(summary = "get user details", description = "get user details", tags = "USER")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "SUCCESS_RESPONSE_OK", content = @Content(schema = @Schema(implementation = UserInfoDto.class))),
            @ApiResponse(responseCode = "400", description = "ERROR_RESPONSE_BAD_REQUEST", content = @Content(schema = @Schema(implementation = ErrorResponseDto.class))),
            @ApiResponse(responseCode = "404", description = "ERROR_RESPONSE_NOT_FOUND", content = @Content(schema = @Schema(implementation = ErrorResponseDto.class))),
            @ApiResponse(responseCode = "500", description = "ERROR_RESPONSE_INTERNAL_SERVER_ERROR", content = @Content(schema = @Schema(implementation = ErrorResponseDto.class)))})
    @GetMapping(path = "info", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserInfoDto> userDetails(HttpServletRequest request) {
        return new ResponseEntity<>(new UserInfoDto(1L, "Dilan Jayaneththi"), HttpStatus.OK);
    }
}
