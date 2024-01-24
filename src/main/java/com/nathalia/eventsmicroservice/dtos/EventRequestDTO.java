package com.nathalia.eventsmicroservice.dtos;

public record EventRequestDTO(int maxParticipants, int registeredPartipants, String date, String title, String description) {
}
