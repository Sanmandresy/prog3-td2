package mg.soccer.api.repository;

import mg.soccer.api.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorRepository extends JpaRepository<Sponsor,Integer> {
}
