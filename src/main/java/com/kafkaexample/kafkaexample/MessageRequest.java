package com.kafkaexample.kafkaexample;

public class MessageRequest {

    private String message;

    public MessageRequest() {
        // Default constructor
    }

    public MessageRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
