package ru.practicum.chart_private.service;

import ru.practicum.dto.CommentDto;
import ru.practicum.dto.NewCommentDto;

public interface PrivateCommentService {
    /**
     * Сохранить комментарий
     */
    CommentDto save(Long userId, Long eventId, NewCommentDto newCommentDto);

    /**
     * Редактировать комментарий
     */
    void delete(Long commentId, Long userId);

    /**
     * Удалить комментарий
     */
    CommentDto update(Long commentId, Long userId, NewCommentDto newCommentDto);
}
