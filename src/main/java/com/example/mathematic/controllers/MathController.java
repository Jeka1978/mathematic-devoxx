package com.example.mathematic.controllers;

import com.example.mathematic.model.Exercise;
import com.example.mathematic.services.MathExerciseGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequiredArgsConstructor
public class MathController {

    private final MathExerciseGenerator generator;

    @GetMapping("/exercises/{amount}")
    public List<Exercise> getExercises(@PathVariable int amount) {
        return generator.getExercises(amount);
    }
}











