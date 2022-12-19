package mg.soccer.api.controller;

import lombok.AllArgsConstructor;
import mg.soccer.api.model.Team;
import mg.soccer.api.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;

    @GetMapping("/teams")
    public List<Team> getTeams() {
        return service.getTeams();
    }
}
