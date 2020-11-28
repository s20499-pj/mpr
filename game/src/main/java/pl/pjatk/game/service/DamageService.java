package pl.pjatk.game.service;

import org.springframework.stereotype.Service;
import pl.pjatk.game.model.Player;

import java.util.Optional;

@Service
public class DamageService {

    private PlayerService playerService;

    public DamageService(PlayerService playerService) {
        this.playerService = playerService;
    }

    public Player damage(Long attackerId, Long defenderId) {
        Optional<Player> optionalAttacker = playerService.findById(attackerId);
        Optional<Player> optionalDefender = playerService.findById(defenderId);

        if (optionalAttacker.isPresent() && optionalDefender.isPresent()) {
            int attack = optionalAttacker.get().getAttack();
            Player defender = optionalDefender.get();
            int health = defender.getHealth();

            defender.setHealth(health - attack);

            return playerService.save(defender);
        } else {
            return null;
        }
    }
}