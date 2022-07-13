package com.APIsProject.core.service;

import com.APIsProject.core.RestClint.RestServiceClient;
import com.APIsProject.errors.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAPIsServiceImpl implements GetAPIsService {

    private final RestServiceClient restServiceClient;

    private final static String GET_USERS_URL = "https://gorest.co.in/public/v2/users";
    private final static String GET_POSTS_URL = "https://gorest.co.in/public/v2/posts";
    private final static String GET_COMMENTS_URL = "https://gorest.co.in/public/v2/comments";

    @Override
    public List<Object> getAllUsers() {
        try {
            List<Object> objectList = restServiceClient.getdata(GET_USERS_URL);
            return objectList;
        } catch (EntityNotFoundException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public List<Object> getAllPosts() {
        try {
            List<Object> objectList = restServiceClient.getdata(GET_POSTS_URL);
            return objectList;
        } catch (EntityNotFoundException ex) {
            throw new RuntimeException(ex.getMessage());
        }

    }

    @Override
    public List<Object> getAllComments() {
        try {
            List<Object> objectList = restServiceClient.getdata(GET_COMMENTS_URL);
            return objectList;
        } catch (EntityNotFoundException ex) {
            throw new RuntimeException(ex.getMessage());
        }

    }
}
