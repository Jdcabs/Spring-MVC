package com.mvc.demo.service;

import com.mvc.demo.dto.ClubDto;
import com.mvc.demo.model.Club;
import com.mvc.demo.repository.ClubRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


public class ClubServiceImpl implements ClubService{

    private final ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository){
        this.clubRepository = clubRepository;
    }

    @Override
    public Club createClub(Club club) {
        return null;
    }

    @Override
    public List<ClubDto> findAllClub() {
        List<Club> allClubs = clubRepository.findAll();
        return allClubs.stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club clubs) {
        ClubDto clubDto = ClubDto.builder()
                .id(clubs.getId())
                .title(clubs.getTitle())
                .updatedAt(clubs.getUpdatedAt())
                .photoUrl(clubs.getPhotoUrl())
                .content(clubs.getContent())
                .createdOn(clubs.getCreatedOn())
                .build();
        return clubDto;
    }
}
