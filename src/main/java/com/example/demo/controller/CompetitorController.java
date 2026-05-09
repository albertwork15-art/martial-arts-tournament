package com.example.demo.controller;

import com.example.demo.model.Competitor;
import com.example.demo.service.CompetitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/competitors")
public class CompetitorController {

    private final CompetitorService competitorService;

    @Autowired
    public CompetitorController(CompetitorService competitorService) {
        this.competitorService = competitorService;
    }

    @GetMapping
    public List<Competitor> getAllCompetitors() {
        return competitorService.getAllCompetitors();
    }

    @PostMapping
    public Competitor createCompetitor(@RequestBody Competitor competitor) {
        return competitorService.saveCompetitor(competitor);
    }
}
