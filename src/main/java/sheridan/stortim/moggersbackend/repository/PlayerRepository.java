package sheridan.stortim.moggersbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sheridan.stortim.moggersbackend.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
