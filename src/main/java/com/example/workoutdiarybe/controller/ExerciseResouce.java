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

import com.example.workoutdiarybe.model.Exercise;

import com.example.workoutdiarybe.services.ExerciseService;

@RestController
@RequestMapping("/exercises")
public class ExerciseResouce {
    private final ExerciseService exerciseService;

    public ExerciseResouce(ExerciseService exerciseService){
        this.exerciseService = exerciseService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Exercise>> getAllExercises() {
        List<Exercise> exercises = exerciseService.findAllExercises();
        return new ResponseEntity<>(exercises, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Exercise> getExerciseById(@PathVariable("id") Long id) {
        Exercise exercise = exerciseService.findExerciseById(id);
        return new ResponseEntity<>(exercise, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Exercise> addExercise(@RequestBody Exercise exercise) {
        Exercise newExercise = exerciseService.addExercise(exercise);
        return new ResponseEntity<>(newExercise, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Exercise> updateExercise(@RequestBody Exercise exercise) {
        Exercise updateExercise = exerciseService.updateExercise(exercise);
            return new ResponseEntity<>(updateExercise, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExercise(@PathVariable("id") Long id){
        exerciseService.deleteExercise(id);
        String message = "Entity Exercise eliminated";
        return new ResponseEntity<>(message, HttpStatus.OK);
        
    }
}
