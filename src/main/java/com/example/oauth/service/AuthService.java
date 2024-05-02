package com.example.oauth.service;

import com.example.oauth.dto.request.auth.IdCheckRequestDto;
import com.example.oauth.dto.response.auth.IdCheckResponseDto;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto);
}
