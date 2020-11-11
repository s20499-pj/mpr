package pl.pjatk.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.game.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
