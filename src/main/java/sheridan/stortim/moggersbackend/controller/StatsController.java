package sheridan.stortim.moggersbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sheridan.stortim.moggersbackend.DTO.TeamStats;
import sheridan.stortim.moggersbackend.service.StatsService;

import java.util.List;

@RestController
public class StatsController {

    private final StatsService _service;

    public StatsController(StatsService service) {
        _service = service;
    }

    @GetMapping("/api/public/getTeamStats")
    public TeamStats getTeamStats() {
        int wins = _service.getWins();
        int losses = _service.getLosses();
        int ties = _service.getTies();
        int pts = _service.getPts();
        int goalsFor = _service.getGoalsFor();
        int goalsAgainst = _service.getGoalsAgainst();
        int goalDifferential = _service.getGoalDifferential();
        double winPercentage = _service.getWinPercentage();
        int matchesPlayed = _service.getMatchesPlayed();

        TeamStats teamStats = new TeamStats(wins, losses, ties, pts, goalsFor, goalsAgainst,
                goalDifferential, winPercentage, matchesPlayed);

        return teamStats;
    }

    @GetMapping("/api/public/getForm")
    public List<Character> teamForm() {
        return _service.getForm();
    }
}
