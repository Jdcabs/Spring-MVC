package com.mvc.demo.service;

import com.mvc.demo.dto.ClubDto;
import com.mvc.demo.model.Club;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClubService{

    void createClub(Club club);

    List<ClubDto> findAllClub();
}
