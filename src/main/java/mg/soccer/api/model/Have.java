package mg.soccer.api.model;


import jakarta.persistence.*;

@Entity
public class Have {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Team sponsoredTeam;
    @OneToOne
    private Sponsor sponsor;
}
