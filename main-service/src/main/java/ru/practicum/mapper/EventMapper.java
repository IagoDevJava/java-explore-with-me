package ru.practicum.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.practicum.dto.EventFullDto;
import ru.practicum.dto.EventShortDto;
import ru.practicum.dto.NewEventDto;
import ru.practicum.enums.State;
import ru.practicum.model.Event;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static ru.practicum.mapper.CategoryMapper.toCategoryDto;
import static ru.practicum.mapper.DateTimeMapper.toLocalDateTime;
import static ru.practicum.mapper.DateTimeMapper.toStringDateTime;
import static ru.practicum.mapper.UserMapper.toUserShortDto;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class EventMapper {
    public static Event toEvent(NewEventDto newEventDto) {
        Event event = new Event();
        event.setAnnotation(newEventDto.getAnnotation());
        event.setCreatedOn(LocalDateTime.now());
        event.setDescription(newEventDto.getDescription());
        event.setEventDate(toLocalDateTime(newEventDto.getEventDate()));
        event.setLocation(newEventDto.getLocation());
        event.setPaid(newEventDto.getPaid());
        event.setParticipantLimit(newEventDto.getParticipantLimit());
        event.setPublishedOn(toLocalDateTime(toStringDateTime(LocalDateTime.now())));
        event.setRequestModeration(newEventDto.getRequestModeration());
        event.setRequestModeration(newEventDto.getRequestModeration());
        event.setState(State.PENDING);
        event.setTitle(newEventDto.getTitle());
        return event;
    }

    public static EventFullDto toEventFullDto(Event event) {
        return new EventFullDto(
                event.getId(),
                event.getAnnotation(),
                toCategoryDto(event.getCategory()),
                event.getConfirmedRequests(),
                toStringDateTime(event.getCreatedOn()),
                event.getDescription(),
                toStringDateTime(event.getEventDate()),
                toUserShortDto(event.getInitiator()),
                event.getLocation(),
                event.getPaid(),
                event.getParticipantLimit(),
                toStringDateTime(event.getPublishedOn()),
                event.getRequestModeration(),
                event.getState(),
                event.getTitle(),
                event.getViews());
    }

    public static List<EventFullDto> toEventFullDtoList(List<Event> events) {
        return events.stream().map(EventMapper::toEventFullDto).collect(Collectors.toList());
    }

    public static EventShortDto toEventShortDto(Event event) {
        return new EventShortDto(
                event.getId(),
                event.getAnnotation(),
                toCategoryDto(event.getCategory()),
                event.getConfirmedRequests(),
                toStringDateTime(event.getEventDate()),
                toUserShortDto(event.getInitiator()),
                event.getPaid(),
                event.getTitle(),
                event.getViews());
    }

    public static List<EventShortDto> toEventShortDtoList(List<Event> events) {
        return events.stream().map(EventMapper::toEventShortDto).collect(Collectors.toList());
    }
}