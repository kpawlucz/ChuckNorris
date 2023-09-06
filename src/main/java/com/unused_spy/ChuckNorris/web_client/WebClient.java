package com.unused_spy.ChuckNorris.web_client;

import com.unused_spy.ChuckNorris.model.ChuckDtoInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
@RequiredArgsConstructor
public class WebClient {

    private final RestTemplate restTemplate;
    private final static String CHUCK_NORRIS_URL = "https://api.chucknorris.io/jokes/random";
    public ChuckDtoInput getChuckNorrisJoke(){
        return restTemplate.getForObject(CHUCK_NORRIS_URL, ChuckDtoInput.class);    }
}
