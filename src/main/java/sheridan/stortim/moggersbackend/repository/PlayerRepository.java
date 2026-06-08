package sheridan.stortim.moggersbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sheridan.stortim.moggersbackend.entity.Player;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query("SELECT p FROM Player p ORDER BY p.goals DESC LIMIT 5")
    List<Player> findTopFiveScorer();

    @Query("SELECT p FROM Player p ORDER BY p.assists DESC LIMIT 5")
    List<Player> findTopFiveAssister();

    @Query("SELECT p FROM Player p ORDER BY p.cleanSheets DESC LIMIT 5")
    List<Player> findTopFiveCleanSheets();

    @Query("SELECT p FROM Player p WHERE p.playerOfWeek = true")
    Player findPlayerOfWeek();
}
