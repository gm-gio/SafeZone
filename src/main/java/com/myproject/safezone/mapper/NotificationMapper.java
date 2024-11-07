package com.myproject.safezone.mapper;

import com.myproject.safezone.dto.NotificationDto;
import com.myproject.safezone.dto.NotificationRequestDto;
import com.myproject.safezone.entity.Notification;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    NotificationDto toDto(Notification notification);

    Notification toEntity(NotificationDto notificationDto);

    NotificationRequestDto toRequestDto(Notification notification);

    Notification toEntityFromRequestDto(NotificationRequestDto notificationRequestDto);
}
