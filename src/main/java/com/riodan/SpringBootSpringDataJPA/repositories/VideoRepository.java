package com.riodan.SpringBootSpringDataJPA.repositories;

import com.riodan.SpringBootSpringDataJPA.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
