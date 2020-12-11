package pl.pjatk.game.service;

import org.springframework.stereotype.Service;
import pl.pjatk.game.model.Player;

@Service
public class DamageService {
    public Player heal(Player player, int points){ ;

        player.setHealth(player.getHealth() + points);
        return player;
    }

    public Player manaRegen(Player player, int points){ ;

        player.setMana(player.getMana() + points);
        return player;
    }

    public Player boost(Player player){ ;

        player.setAttack(player.getAttack() + 5);
        return player;
    }

    public Player poison(Player player){ ;

        player.setHealth(player.getHealth() - 5);
        return player;
    }

    public Player curse(Player player){ ;

        player.setAttack(player.getAttack() - 10);
        return player;
    }

}