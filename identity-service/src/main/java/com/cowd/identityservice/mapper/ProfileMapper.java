package com.cowd.identityservice.mapper;

import com.cowd.identityservice.dto.request.ProfileCreationRequest;
import com.cowd.identityservice.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}
