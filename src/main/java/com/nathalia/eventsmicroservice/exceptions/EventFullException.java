package com.nathalia.eventsmicroservice.exceptions;

public class EventFullException extends RuntimeException {

    public EventFullException() {
        super("Event is crowded");
    }

    public EventFullException(String message){
        super(message);
    }
}

