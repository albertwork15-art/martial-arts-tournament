package com.example.demo.service;

import com.example.demo.model.Competitor;
import com.example.demo.repository.CompetitorRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CompetitorService {

    private final CompetitorRepository competitorRepository;

    @Autowired
    public CompetitorService(CompetitorRepository competitorRepository) {
        this.competitorRepository = competitorRepository;
    }

    public List<Competitor> getAllCompetitors() {
        return competitorRepository.findAll();
    }

    public Competitor saveCompetitor(Competitor competitor) {
        return competitorRepository.save(competitor);
    }

    @PostConstruct
    public void seedDatabase() {
        if (competitorRepository.count() == 0) {
            competitorRepository.saveAll(Arrays.asList(
                new Competitor("Alex Johnson", "Blue Belt", "76kg", "Gracie Barra"),
                new Competitor("Sarah Smith", "Purple Belt", "64kg", "Alliance"),
                new Competitor("Mike Davis", "White Belt", "82kg", "10th Planet"),
                new Competitor("Laura Garcia", "Brown Belt", "58kg", "Checkmat"),
                new Competitor("James Wilson", "Black Belt", "88kg", "Atos")
            ));
        }
    }
}
