package mg.soccer.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "sponsor")
@Builder
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sponsor_id")
    private int sponsorId;

    @Column(name = "sponsor_name")
    private String sponsorName;
    @ManyToMany
    @JsonIgnoreProperties("sponsors")
    private List<Team> teams;
}
