package com.APIsProject.core.RestClint;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Component
public class RestServiceClient {

    private List<Object> data = new ArrayList<>();

    public List<Object> getdata(String url) {
       // String url = "https://gorest.co.in/public/v2/users";
        RestTemplate rt = new RestTemplate();
        Object[] test = rt.getForObject(url,Object[].class);
        data = Arrays.asList(test);
        return data;
    }

    public List<Object> getRetrievedData() {
        return data;
    }

}
