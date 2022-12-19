package mg.soccer.api.service;

import lombok.AllArgsConstructor;
import mg.soccer.api.model.Team;
import mg.soccer.api.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<Team> getTeams() {
        return repository.findAll();
    }
}
