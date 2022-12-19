package mg.soccer.api.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "play_against")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    @OneToOne
    @JoinColumn(name = "team_one")
    private Team teamOne;
    @OneToOne
    @JoinColumn(name = "team_two")
    private Team teamTwo;
    private LocalDateTime datetime;
    private String stadium;
}
