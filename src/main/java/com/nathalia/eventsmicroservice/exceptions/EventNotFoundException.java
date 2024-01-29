package com.nathalia.eventsmicroservice.exceptions;

public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException() {
        super("Event not found");
    }

    public EventNotFoundException(String message){
        super(message);
    }
}
