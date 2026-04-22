package sheridan.stortim.moggersbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Players")
@Getter
@Setter
public class Player {

    @Id
    private Long playerId;
    private String firstName;
    private String lastName;
    private Long goals;
    private Long assists;
    private Long playerNumber;
    private Long matchesPlayed;
    private String playerPosition;
    private Long cleanSheets;

}
