package sheridan.stortim.moggersbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sheridan.stortim.moggersbackend.entity.Match;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {

    @Query("SELECT m FROM Match m WHERE m.status = 'W' or m.status = 'L'")
    List<Match> findPlayedMatches();

    @Query("SELECT m FROM Match m WHERE m.status = 'U'")
    List<Match> findUpcomingMatches();

    @Query("SELECT m FROM Match m WHERE m.status = 'L' OR m.status = 'W' LIMIT 5")
    List<Match> findLastFiveMatches();
}
