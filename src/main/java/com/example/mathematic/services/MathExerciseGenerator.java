package com.example.mathematic.services;

import com.example.mathematic.model.Exercise;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface MathExerciseGenerator {
    List<Exercise> getExercises(int amount);
}
