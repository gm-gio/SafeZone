package com.myproject.safezone.dto;

;
import com.myproject.safezone.entity.NotificationType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotificationDto {
    private Long notificationId;
    private String title;
    private String message;
    private LocalDateTime timestamp;
    private NotificationType type;
    private String status;
    private Set<Long> userIds;
    private Set<Long> groupIds;
}
