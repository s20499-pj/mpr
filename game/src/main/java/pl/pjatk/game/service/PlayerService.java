package pl.pjatk.game.service;

import org.springframework.stereotype.Service;
import pl.pjatk.game.model.Player;
import pl.pjatk.game.repository.PlayerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public Optional<Player> findById(int id) {
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "Tank", 15, 5, 5));
        players.add(new Player(2, "Mag", 10, 10, 5));
        players.add(new Player(3, "DPS", 10, 5, 10));

        return players.stream().filter(player -> player.getId() == id).findFirst();
    }

    public Player save(Player player){
        return playerRepository.save(player);
    }
}

