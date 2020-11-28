package pl.pjatk.game.service;

import org.springframework.stereotype.Service;
import pl.pjatk.game.model.Player;
import pl.pjatk.game.repository.PlayerRepository;

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

    public Optional<Player> findById(long id) {
        return playerRepository.findById(id);
    }

    public void delete(long id){
        playerRepository.deleteById(id);
    }

    public Player update(long id, Player playerWithUpdatedProperties){
        playerWithUpdatedProperties.setId(id);
        return playerRepository.save(playerWithUpdatedProperties);
    }

    public Player save(Player player){
        return playerRepository.save(player);
    }
}

