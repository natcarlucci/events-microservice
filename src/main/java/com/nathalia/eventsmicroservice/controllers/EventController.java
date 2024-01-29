package com.nathalia.eventsmicroservice.controllers;

import com.nathalia.eventsmicroservice.domain.Event;
import com.nathalia.eventsmicroservice.domain.Subscription;
import com.nathalia.eventsmicroservice.dtos.EventRequestDTO;
import com.nathalia.eventsmicroservice.dtos.SubscriptionRequestDTO;
import com.nathalia.eventsmicroservice.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/upcoming")
    public List<Event> getUpcomingEvents() {
        return eventService.getUpcomingEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody EventRequestDTO event) {
        return eventService.createEvent(event);
    }

    @PostMapping("/{eventId}/register")
    public void registerParticipant(@PathVariable String eventId, @RequestBody SubscriptionRequestDTO subscriptionRequestDTO) {
        eventService.registerParticipant(eventId, subscriptionRequestDTO.participantEmail());
    }
}