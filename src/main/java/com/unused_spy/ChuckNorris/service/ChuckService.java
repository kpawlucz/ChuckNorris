package com.unused_spy.ChuckNorris.service;

import com.unused_spy.ChuckNorris.mapper.ChuckMapper;
import com.unused_spy.ChuckNorris.model.ChuckDtoInput;
import com.unused_spy.ChuckNorris.model.ChuckEntity;
import com.unused_spy.ChuckNorris.repository.ChuckRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChuckService {
    private final ChuckRepository chuckRepository;
    private final ChuckMapper chuckMapper;

    public void saveChuckEntity(ChuckDtoInput chuckDtoInput) {
        ChuckEntity chuckEntity = chuckMapper.dtoInputToEntity(chuckDtoInput);
        chuckRepository.save(chuckEntity);
    }

}
