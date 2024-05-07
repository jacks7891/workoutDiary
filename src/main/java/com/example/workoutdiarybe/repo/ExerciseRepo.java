package com.example.workoutdiarybe.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workoutdiarybe.model.Exercise;

public interface ExerciseRepo extends JpaRepository<Exercise, Long> {
    void deleteExerciseById(Long Id);

    Optional<Exercise> findExerciseById(Long id);
}
