package com.example.workoutdiarybe.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.workoutdiarybe.exception.UserNotFoundException;
import com.example.workoutdiarybe.model.Training;
import com.example.workoutdiarybe.repo.TrainingRepo;

import jakarta.transaction.Transactional;
@Service
public class TrainingService {
    private final TrainingRepo trainingRepo;

    public TrainingService(TrainingRepo trainingRepo){
        this.trainingRepo = trainingRepo;
    }
    
    public Training addTraining(Training training) {
        return trainingRepo.save(training);
    }

    public List<Training> findAllTraining() {
        return trainingRepo.findAll();
    }

    public Training findTrainingById(Long id){
        return trainingRepo.findTrainingById(id).orElseThrow(() -> new UserNotFoundException("Training by id " + id + "was not found"));
    }

    public Training updateTraining(Training training) {
        return trainingRepo.save(training);
    }

    @Transactional
    public void deleteTraining(Long id) {
        trainingRepo.deleteTrainingById(id);
    }
}
