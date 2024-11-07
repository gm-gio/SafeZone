package com.myproject.safezone.dto;

import com.myproject.safezone.entity.UserRole;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserRole role;
    private Set<Long> groupIds;
    private Set<Long> notificationIds;
}
