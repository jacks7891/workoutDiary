package com.example.workoutdiarybe.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workoutdiarybe.model.Training;
import com.example.workoutdiarybe.services.TrainingService;
@RestController
@RequestMapping("/trainings")
public class TrainingResource {
    private final TrainingService trainingService;

    public TrainingResource(TrainingService trainingService){
        this.trainingService = trainingService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Training>> getAllTraining() {
        List<Training> training = trainingService.findAllTraining();
        return new ResponseEntity<>(training, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Training> getTrainingById(@PathVariable("id") Long id) {
        Training training = trainingService.findTrainingById(id);
        return new ResponseEntity<>(training, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Training> addTraining(@RequestBody Training training) {
        Training newTraining = trainingService.addTraining(training);
        return new ResponseEntity<>(newTraining, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Training> updateTraining(@RequestBody Training training) {
        Training updateTraining = trainingService.updateTraining(training);
            return new ResponseEntity<>(updateTraining, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTraining(@PathVariable("id") Long id){
        trainingService.deleteTraining(id);
        String message = "Entity Training eliminated";
        return new ResponseEntity<>(message, HttpStatus.OK);
        
    }
}
