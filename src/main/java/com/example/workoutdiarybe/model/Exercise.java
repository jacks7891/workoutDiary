package com.example.workoutdiarybe.model;

import java.time.Duration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private Duration duration;
    private int serie;
    private int reps;//come modello il fatto che può essere a tempo?
    private int points;
    private int target;

    public Exercise(String name, Duration duration, int set, int reps, int points, int target) {
        this.name = name;
        this.duration = duration;
        this.serie = set;
        this.reps = reps;
        this.points = points;
        this.target = target;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Duration getDuration() {
        return duration;
    }
    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    public int getSet() {
        return serie;
    }
    public void setSet(int set) {
        this.serie = set;
    }
    public int getReps() {
        return reps;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getTarget() {
        return target;
    }
    public void setTarget(int target) {
        this.target = target;
    }
    
}
