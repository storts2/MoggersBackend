package sheridan.stortim.moggersbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sheridan.stortim.moggersbackend.entity.Player;
import sheridan.stortim.moggersbackend.repository.PlayerRepository;

import java.util.List;

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
}
