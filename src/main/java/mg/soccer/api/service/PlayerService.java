package mg.soccer.api.service;

import lombok.AllArgsConstructor;
import mg.soccer.api.model.Player;
import mg.soccer.api.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    public List<Player> getPlayers() {
        return repository.findAll();
    }

    public List<Player> addPlayers(List<Player> players) {
        return repository.saveAll(players);
    }
}
