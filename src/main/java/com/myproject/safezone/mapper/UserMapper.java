package com.myproject.safezone.mapper;

import com.myproject.safezone.dto.UserDto;
import com.myproject.safezone.dto.UserRequestDto;
import com.myproject.safezone.entity.User;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);

    UserRequestDto toRequestDto(User user);

    User toEntityFromRequestDto(UserRequestDto userRequestDto);
}
