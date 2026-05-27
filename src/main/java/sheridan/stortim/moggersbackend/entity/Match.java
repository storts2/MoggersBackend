package sheridan.stortim.moggersbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "league_match")
@Getter
@Setter
public class Match {

    @Id
    private Long match_id;
    private String home_name;
    private String away_name;
    private Long home_score;
    private Long away_score;
    private Character status;
    private String match_date;
    private String address;

}
