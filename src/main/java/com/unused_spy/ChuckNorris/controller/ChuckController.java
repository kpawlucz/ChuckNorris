package com.unused_spy.ChuckNorris.controller;
import com.unused_spy.ChuckNorris.model.ChuckDtoInput;
import com.unused_spy.ChuckNorris.service.ChuckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@AllArgsConstructor
@RequestMapping(value = "chuck-norris/")
public class ChuckController {
    private final ChuckService chuckService;
    @GetMapping
    public void saveChuckEntity(@RequestBody ChuckDtoInput chuckDtoInput) {
        chuckService.saveChuckEntity(chuckDtoInput);

    }

}
