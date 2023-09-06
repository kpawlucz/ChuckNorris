package com.unused_spy.ChuckNorris.controller;

import com.unused_spy.ChuckNorris.model.ChuckDtoInput;
import com.unused_spy.ChuckNorris.service.ChuckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "chuck-norris/")
public class ChuckController {
    private final ChuckService chuckService;

    @PostMapping
    public void saveChuckEntity(@RequestBody ChuckDtoInput chuckDtoInput) {
        chuckService.saveChuckEntity(chuckDtoInput);
    }

    @GetMapping(value = "random")
    public void saveChuckRandom() {
        chuckService.saveChuckRandomEntity();
    }
}
