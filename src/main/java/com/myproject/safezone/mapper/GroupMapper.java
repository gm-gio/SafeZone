package com.myproject.safezone.mapper;


import com.myproject.safezone.dto.GroupDto;
import com.myproject.safezone.dto.GroupRequestDto;
import com.myproject.safezone.entity.Group;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GroupMapper {

    GroupDto toDto(Group group);
    Group toEntity(GroupDto groupDto);

    GroupRequestDto toRequestDto(Group group);
    Group tpEntityFromRequestDto(GroupRequestDto groupRequestDto);
}
