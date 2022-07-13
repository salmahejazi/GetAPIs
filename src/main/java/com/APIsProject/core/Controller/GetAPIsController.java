package com.APIsProject.core.Controller;

import com.APIsProject.core.service.GetAPIsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(GetAPIsController.REQUEST_MAPPING_URL)
@RequiredArgsConstructor
@Slf4j
@RestController
public class GetAPIsController {

    public static final String REQUEST_MAPPING_URL = "/GetAPIs/v1";
    private final GetAPIsService getAPIsService;

    @Operation(security = {@SecurityRequirement(name = "basicAuth")})
    @GetMapping(value = "/users", produces = "application/json")
    public List<Object> getAllUsers() {
        return getAPIsService.getAllUsers();
    }

    @Operation(security = {@SecurityRequirement(name = "basicAuth")})
    @GetMapping(value = "/posts", produces = "application/json")
    public List<Object> getAllPosts() {
        return getAPIsService.getAllPosts();
    }

    @Operation(security = {@SecurityRequirement(name = "basicAuth")})
    @GetMapping(value = "/comments", produces = "application/json")
    public List<Object> getAllComments() {
        return getAPIsService.getAllComments();
    }
}
