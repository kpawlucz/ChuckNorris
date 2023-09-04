package com.unused_spy.ChuckNorris.mapper;

import com.unused_spy.ChuckNorris.model.ChuckDtoInput;
import com.unused_spy.ChuckNorris.model.ChuckEntity;

public class ChuckMapper {

    public ChuckEntity dtoInputToEntity(ChuckDtoInput chuckdtoinput) {
        ChuckEntity chuckEntity = new ChuckEntity();
        chuckEntity.setJoke(chuckdtoinput.getValue());
        return chuckEntity;
    }
}
