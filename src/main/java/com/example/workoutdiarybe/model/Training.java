package com.example.workoutdiarybe.model;


import java.time.Duration;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Training {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private List<String> exercieses;//diventerà lista di oggetti esercizio
    private Duration duration;//base no recorded data, calcolata sulla media del tempo delle sessioni svolte
    private String level;//livello raggiunto dall'utente per quell'allenamento(forse in percentuale) o numerico o ...
    private int points;
    private int target;//obbiettivo da raggiungere nell'allenamento

    public Training(Long id, String name, List<String> exercieses, Duration duration, String level, int target) {
        this.id = id;
        this.name = name;
        this.exercieses = exercieses;
        this.duration = duration;
        this.level = level;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getExercieses() {
        return exercieses;
    }

    public void setExercieses(List<String> exercieses) {
        this.exercieses = exercieses;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }
    

}
