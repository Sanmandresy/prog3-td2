package mg.soccer.api.controller;

import lombok.AllArgsConstructor;
import mg.soccer.api.model.Player;
import mg.soccer.api.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return service.getPlayers();
    }

    @PostMapping("/players")
    public List<Player> addPlayers(@RequestBody List<Player> players) {
        return service.addPlayers(players);
    }
}
