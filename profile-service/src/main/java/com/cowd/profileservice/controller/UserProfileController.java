package com.cowd.profileservice.controller;

import com.cowd.profileservice.dto.response.UserProfileResponse;
import com.cowd.profileservice.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @GetMapping("/{profileId}")
    UserProfileResponse getProfile(@PathVariable("profileId") String id) {
        return userProfileService.getProfile(id);
    }

    @GetMapping
    List<UserProfileResponse> getAllProfiles() {
        return userProfileService.getAllProfiles();
    }

}
