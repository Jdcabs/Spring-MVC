package com.mvc.demo.service;

import com.mvc.demo.dto.ClubDto;
import com.mvc.demo.model.Club;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClubService{

    Club createClub(Club club);

    List<ClubDto> findAllClub();
}
