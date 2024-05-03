package com.example.workoutdiarybe.model;

import java.time.Duration;

import jakarta.persistence.Entity;
@Entity
public class Exercise {
    private String name;
    private Duration duration;
    private int set;
    private int reps;//come modello il fatto che può essere a tempo?
    private int points;
    private int target;

}
