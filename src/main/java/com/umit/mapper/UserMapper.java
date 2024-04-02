package com.umit.mapper;

import com.umit.dto.request.RegisterRequestDto;
import com.umit.dto.request.UserUpdateRequestDto;
import com.umit.dto.response.LoginResponseDto;
import com.umit.dto.response.RegisterResponseDto;
import com.umit.entity.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    LoginResponseDto fromUserToLoginResponseDto(final User user);

    User fromRegisterRequestDtoToUser(final RegisterRequestDto dto);

    RegisterResponseDto fromUserToRegisterResponseDto(final User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromDto(UserUpdateRequestDto dto, @MappingTarget User user);
}
