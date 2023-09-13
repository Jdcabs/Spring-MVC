package com.mvc.demo.controller;

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
        modelAndView.addObject("clubs", clubService.findAllClub());
        modelAndView.addObject("dateNow", dateNow);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
