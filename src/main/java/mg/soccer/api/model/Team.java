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
@Table(name = "team")
@Builder
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private int teamId;

    @Column(name = "team_name")
    private String teamName;

    @JsonIgnoreProperties("teams")
    @ManyToMany
    @JoinTable(
            name = "have",
            joinColumns = @JoinColumn(name = "team_id_sponsored", referencedColumnName = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "sponsor_id", referencedColumnName = "sponsor_id")
    )
    private List<Sponsor> sponsors;

    @OneToOne
    @JoinTable(
            name = "play_against",
            joinColumns = {
                    @JoinColumn(name = "team_one", referencedColumnName = "team_id"),
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "team_two", referencedColumnName = "team_id"),
            }
    )
    private Team opponent;
}
