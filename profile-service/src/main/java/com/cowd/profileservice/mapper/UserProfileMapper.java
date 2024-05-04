package com.cowd.profileservice.mapper;

import com.cowd.profileservice.dto.request.ProfileCreationRequest;
import com.cowd.profileservice.dto.response.UserProfileResponse;
import com.cowd.profileservice.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);
    UserProfileResponse toUserProfileResponse(UserProfile entity);
}
