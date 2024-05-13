package com.example.workoutdiarybe.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.workoutdiarybe.exception.UserNotFoundException;
import com.example.workoutdiarybe.model.Exercise;
import com.example.workoutdiarybe.repo.ExerciseRepo;

import jakarta.transaction.Transactional;

@Service
public class ExerciseService {

    private final ExerciseRepo exerciseRepo;
    
    public ExerciseService(ExerciseRepo exerciseRepo){
        this.exerciseRepo = exerciseRepo;
    }
    
    public Exercise addExercise(Exercise exercise) {
        return exerciseRepo.save(exercise);
    }

    public List<Exercise> findAllExercises() {
        return exerciseRepo.findAll();
    }

    public Exercise findExerciseById(Long id){
        return exerciseRepo.findExerciseById(id).orElseThrow(() -> new UserNotFoundException("Exercise by id " + id + "was not found"));
    }

    public Exercise updateExercise(Exercise exercise) {
        return exerciseRepo.save(exercise);
    }

    @Transactional
    public void deleteExercise(Long id) {
        exerciseRepo.deleteExerciseById(id);
    }
}
