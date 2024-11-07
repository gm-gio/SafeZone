package com.myproject.safezone.dto;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GroupDto {
    private Long groupId;
    private String groupName;
    private String groupDescription;
    private Set<Long> userIds;
}
