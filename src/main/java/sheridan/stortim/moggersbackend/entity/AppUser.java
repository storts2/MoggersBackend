package sheridan.stortim.moggersbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long user_id;

    @Column(nullable = false, unique = true)
    private String userUsername;

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false)
    private String userRole;

}
