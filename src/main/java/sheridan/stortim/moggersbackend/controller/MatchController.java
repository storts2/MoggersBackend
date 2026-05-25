package sheridan.stortim.moggersbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sheridan.stortim.moggersbackend.entity.Match;
import sheridan.stortim.moggersbackend.repository.MatchRepository;

import java.util.List;

@RestController
public class MatchController {

    private final MatchRepository _repository;

    public MatchController(MatchRepository repository) {
        _repository = repository;
    }

    @GetMapping("/api/public/playedMatches")
    public List<Match> playedMatches() {
        return _repository.findPlayedMatches();
    }

    @GetMapping("/api/public/upcomingMatches")
    public List<Match> upcomingMatches() {
        return _repository.findUpcomingMatches();
    }
}
