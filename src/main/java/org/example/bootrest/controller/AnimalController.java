package org.example.bootrest.controller;

import org.example.bootrest.model.domain.Animal;
import org.example.bootrest.model.dto.AnimalRequestDTO;
import org.example.bootrest.service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> all() {
        return animalService.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody AnimalRequestDTO dto) {
        String story = "";
        animalService.create(dto.toAnimal(story));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
