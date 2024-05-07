package com.example.workoutdiarybe.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workoutdiarybe.model.Training;

public interface TrainingRepo extends JpaRepository<Training, Long> {
    void deleteTrainingById(Long Id);

    Optional<Training> findTrainingById(Long id);
}
