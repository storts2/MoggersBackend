package sheridan.stortim.moggersbackend.controller;

import org.springframework.web.bind.annotation.*;
import sheridan.stortim.moggersbackend.entity.Player;
import sheridan.stortim.moggersbackend.repository.PlayerRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class PlayerController {

    private final PlayerRepository _repository;

    public PlayerController(PlayerRepository repository) {
        _repository = repository;
    }

    @GetMapping("/api/players")
    public List<Player> getAll() {
        return _repository.findAll();
    }

    @GetMapping("/api/topScorers")
    public List<Player> getTopFiveScorers() {
        return _repository.findTopFiveScorer();
    }

    @GetMapping("/api/topAssisters")
    public List<Player> getTopFiveAssisters() {
        return _repository.findTopFiveAssister();
    }

    @GetMapping("/api/topCleanSheets")
    public List<Player> getTopFiveCleanSheets() {
        return _repository.findTopFiveCleanSheets();
    }

    @GetMapping("/api/player/{id}")
    public Optional<Player> getPlayerById(
            @PathVariable Long id
    )
    {
        return _repository.findById(id);
    }

    @PutMapping("/api/updatePlayer")
    public void updatePlayer(
            @RequestBody Player player
    ) {
        _repository.save(player);
    }

    @DeleteMapping("/api/deletePlayer/{id}")
    public void deletePlayer(
            @PathVariable Long id
    ) {
        _repository.deleteById(id);
    }
}
