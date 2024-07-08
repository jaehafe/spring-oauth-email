package com.example.oauth.controller;

import com.example.oauth.dto.request.auth.CheckCertificationRequestDto;
import com.example.oauth.dto.request.auth.EmailCertificationRequestDto;
import com.example.oauth.dto.request.auth.IdCheckRequestDto;
import com.example.oauth.dto.request.auth.SignInRequestDto;
import com.example.oauth.dto.request.auth.SignUpRequestDto;
import com.example.oauth.dto.response.auth.CheckCertificationResponseDto;
import com.example.oauth.dto.response.auth.EmailCertificationResponseDto;
import com.example.oauth.dto.response.auth.IdCheckResponseDto;
import com.example.oauth.dto.response.auth.SignInResponseDto;
import com.example.oauth.dto.response.auth.SignUpResponseDto;
import com.example.oauth.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/id-check")
    public ResponseEntity<? super IdCheckResponseDto> idCheck(
            @RequestBody @Valid IdCheckRequestDto requestBody) {
        return authService.idCheck(requestBody);
    }

    @PostMapping("/email-certification")
    public ResponseEntity<? super EmailCertificationResponseDto> emailCertification(
            @RequestBody @Valid EmailCertificationRequestDto requestBody) {
        return authService.emailCertification(requestBody);
    }

    @PostMapping("/check-certification")
    public ResponseEntity<? super CheckCertificationResponseDto> checkCertification(
            @RequestBody @Valid CheckCertificationRequestDto requestBody) {
        return authService.checkCertification(requestBody);
    }

    @PostMapping("/sign-up")
    public ResponseEntity<? super SignUpResponseDto> signup(
            @RequestBody @Valid SignUpRequestDto requestBody) {
        return authService.signUp(requestBody);
    }

    @PostMapping("/sign-in")
    public ResponseEntity<? super SignInResponseDto> signIn(
            @RequestBody @Valid SignInRequestDto requestBody) {
        return authService.signIn(requestBody);
    }
}
