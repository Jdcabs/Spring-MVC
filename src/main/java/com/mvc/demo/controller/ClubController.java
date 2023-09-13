package com.mvc.demo.controller;

import com.mvc.demo.model.Club;
import com.mvc.demo.service.ClubService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class ClubController {

    private final ClubService clubService;

    public ClubController(ClubService clubService){
        this.clubService = clubService;
    }

    @GetMapping("/findAll")
    public ModelAndView listClub(){
        ModelAndView modelAndView = new ModelAndView();

        var dateNow = LocalDateTime.now();
        var formatter = DateTimeFormatter.ISO_DATE_TIME;
        var localDateFormatter =formatter.format(dateNow);
        System.out.println("Date Now " + dateNow);

        Club club = new Club();
        club.setTitle("Random Image");
        club.setContent("Image I Get From the Internet");
        club.setPhotoUrl("https://img.freepik.com/free-photo/view-room-interior-with-furniture-copy-space_23-2150680538.jpg?w=740&t=st=1694575281~exp=1694575881~hmac=697d0be8aed2110f3149a5a80cd07841f91eb0b0087594c513e13eff8e94a970");

        clubService.createClub(club);

        modelAndView.addObject("clubs", clubService.findAllClub());
        modelAndView.addObject("dateNow", dateNow);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
