package com.nathalia.eventsmicroservice.services;

import com.nathalia.eventsmicroservice.domain.Event;
import com.nathalia.eventsmicroservice.domain.Subscription;
import com.nathalia.eventsmicroservice.dtos.EmailRequestDTO;
import com.nathalia.eventsmicroservice.dtos.EventRequestDTO;
import com.nathalia.eventsmicroservice.repositores.EventRepository;
import com.nathalia.eventsmicroservice.repositores.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private EmailServiceClient emailServiceClient;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public List<Event> getUpcomingEvents() {
        return eventRepository.findUpcomingEvents(LocalDateTime.now());
    }

    public Event createEvent(EventRequestDTO eventRequest) {
        Event newEvent = new Event(eventRequest);
        return eventRepository.save(newEvent);
    }

    public void registerParticipant(String eventId, String participantEmail) {
        Event event = eventRepository.findById(eventId).orElseThrow(EventNotFoundException::new);

        Subscription subscription = new Subscription((event, partipant))
        subscriptionRepository.save(subscription);

        EmailRequestDTO emailRequest = new EmailRequestDTO(partici)

        emailServiceClient.sendEmail(emailRequest);


    }
}


















