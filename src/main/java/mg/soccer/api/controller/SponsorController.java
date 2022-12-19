package mg.soccer.api.controller;

import lombok.AllArgsConstructor;
import mg.soccer.api.model.Sponsor;
import mg.soccer.api.service.SponsorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private final SponsorService service;

    @GetMapping("/sponsors")
    public List<Sponsor> getSponsors() {
        return service.getSponsors();
    }
}
