package com.example.mathematic.services;

import com.example.mathematic.model.Exercise;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
@Service
public class MathExerciseGeneratorImpl implements MathExerciseGenerator {
    @Value("${math.max}")
    private int max;

    private DataFactory dataFactory = new DataFactory();

    @Override
    public List<Exercise> getExercises(int amount) {
        return Stream.generate(this::generate).limit(amount).collect(toList());
    }

    private Exercise generate() {
        int a = dataFactory.getNumberBetween(0, max);
        int b = dataFactory.getNumberBetween(0, max);
        int answer = a+b;
        return Exercise.builder().question(a + " + " + b + " = ?").answer(String.valueOf(answer)).build();
    }

}









