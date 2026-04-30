package sheridan.stortim.moggersbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sheridan.stortim.moggersbackend.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
