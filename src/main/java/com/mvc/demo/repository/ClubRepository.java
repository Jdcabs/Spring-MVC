package com.mvc.demo.repository;

import com.mvc.demo.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    @Override
    Optional<Club> findById(Long aLong);
}