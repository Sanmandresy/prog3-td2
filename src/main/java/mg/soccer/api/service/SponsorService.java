package mg.soccer.api.service;

import lombok.AllArgsConstructor;
import mg.soccer.api.model.Sponsor;
import mg.soccer.api.repository.SponsorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository repository;

    public List<Sponsor> getSponsors() {
        return repository.findAll();
    }
}
