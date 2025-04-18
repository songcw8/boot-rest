package org.example.bootrest.service;

import org.example.bootrest.model.dto.AnimalRequestDTO;

public interface GeminiService {

    String makeStory(AnimalRequestDTO dto); //dto를 넣었을 때 데이터 변형이 쉬워진다
}
