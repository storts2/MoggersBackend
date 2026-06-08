package sheridan.stortim.moggersbackend.service;

import org.springframework.stereotype.Service;
import sheridan.stortim.moggersbackend.entity.Match;
import sheridan.stortim.moggersbackend.repository.MatchRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatsService {

    private final MatchRepository _repository;

    public StatsService(MatchRepository repository) {
        _repository = repository;
    }

    public int getWins () {
        int count = 0;
        List<Match> playedMatches = _repository.findPlayedMatches();

        for (int iMatch = 0; iMatch < playedMatches.size(); iMatch++) {
            if (playedMatches.get(iMatch).getStatus() == 'W') {
                count++;
            }
        }

        return count;
    }

    public int getLosses () {
        int count = 0;
        List<Match> playedMatches = _repository.findPlayedMatches();

        for (int iMatch = 0; iMatch < playedMatches.size(); iMatch++) {
            if (playedMatches.get(iMatch).getStatus() == 'L') {
                count++;
            }
        }

        return count;
    }

    public int getTies() {
        int count = 0;
        List<Match> playedMatches = _repository.findPlayedMatches();

        for (int iMatch = 0; iMatch < playedMatches.size(); iMatch++) {
            if (playedMatches.get(iMatch).getStatus() == 'T') {
                count++;
            }
        }

        return count;
    }

    public int getPts() {
        int pts = 0;
        List<Match> playedMatches = _repository.findPlayedMatches();

        for (int iMatch = 0; iMatch < playedMatches.size(); iMatch++) {
            if (playedMatches.get(iMatch).getStatus() == 'W') {
               pts += 3;
            }
            else if (playedMatches.get(iMatch).getStatus() == 'T') {
                pts += 1;
            }
        }

        return pts;
    }

    public int getGoalsFor() {
        int gf = 0;
        List<Match> playedMatches = _repository.findPlayedMatches();

        for (int iMatch = 0; iMatch < playedMatches.size(); iMatch++) {
            gf += playedMatches.get(iMatch).getHome_score();
        }

        return gf;
    }

    public int getGoalsAgainst() {
        int ga = 0;
        List<Match> playedMatches = _repository.findPlayedMatches();

        for (int iMatch = 0; iMatch < playedMatches.size(); iMatch++) {
            ga += playedMatches.get(iMatch).getAway_score();
        }

        return ga;
    }

    public int getGoalDifferential() {
        return getGoalsFor() - getGoalsAgainst();
    }

    public int getMatchesPlayed() {
        List<Match> playedMatches = _repository.findPlayedMatches();

        return playedMatches.size();
    }

    public double getWinPercentage() {
        return (double) getWins() / getMatchesPlayed();
    }

    public List<Character> getForm() {
        List<Match> playedMatches = _repository.findPlayedMatches();
        List<Character> form = new ArrayList<>();

        int matchesToShow = Math.min(5, playedMatches.size());

        for (int i = 0; i < matchesToShow; i++) {
            form.add(playedMatches.get(i).getStatus());
        }

        while (form.size() < 5) {
            form.add('-');
        }

        return form;
    }
}
