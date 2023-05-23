package org.tech_pod.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech_pod.model.Event;
import org.tech_pod.repositories.EventRepository;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public List<Event> getAllEvents() {return eventRepository.findAll();}

    public Event createEvent(Event event) {
        eventRepository.save(event);
    return event; }
}
