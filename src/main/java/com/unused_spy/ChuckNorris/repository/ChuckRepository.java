package com.unused_spy.ChuckNorris.repository;

import com.unused_spy.ChuckNorris.model.ChuckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChuckRepository extends JpaRepository<ChuckEntity, Integer> {
}
