package sheridan.stortim.moggersbackend.DTO;

import lombok.Getter;

@Getter
public class TeamStats {
    private int wins;
    private int losses;
    private int ties;
    private int pts;
    private int goalsFor;
    private int goalsAgainst;
    private int goalDifferential;
    private double winPercentage;
    private int matchesPlayed;

    public TeamStats(int wins, int losses, int ties, int pts, int goalsFor, int goalsAgainst, int goalDifferential,
                     double winPercentage, int matchesPlayed) {
        this.wins = wins;
        this.losses = losses;
        this.ties = ties;
        this.pts = pts;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalDifferential = goalDifferential;
        this.winPercentage = winPercentage;
        this.matchesPlayed = matchesPlayed;
    }
}
