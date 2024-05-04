package com.cowd.profileservice.controller;

import com.cowd.profileservice.dto.request.ProfileCreationRequest;
import com.cowd.profileservice.dto.response.UserProfileResponse;
import com.cowd.profileservice.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @PostMapping()
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest request) {
        return userProfileService.createProfile(request);
    }

    @GetMapping("/{profileId}")
    UserProfileResponse getProfile(@PathVariable("profileId") String id) {
        return userProfileService.getProfile(id);
    }

}
