package com.example.workoutdiarybe.ApiResponse;

public class ApiResponse {
    private String status;
    private String message;
    private String contentType;

    public ApiResponse(String status, String message, String contentType){
        this.status = status;
        this.message = message;
        this.contentType = contentType;
    }
}
