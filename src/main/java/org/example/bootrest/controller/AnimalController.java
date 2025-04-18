package org.example.bootrest.controller;

import org.example.bootrest.model.domain.Animal;
import org.example.bootrest.model.dto.AnimalRequestDTO;
import org.example.bootrest.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animal")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/hello")
    public List<Animal> all() {
        return animalService.findAll();
    }

    @PostMapping
    public Animal create(@RequestBody AnimalRequestDTO dto) {
        String story = "";
        return animalService.save(dto.toAnimal(story));
    }

}
