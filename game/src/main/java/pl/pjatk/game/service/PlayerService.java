package pl.pjatk.game.service;

import org.springframework.stereotype.Service;
import pl.pjatk.game.model.Player;

import java.util.List;

@Service
public class PlayerService {
    public List<Player> findAll(){
        return List.of(new Player(-1, "NoName", 10, 5, 5));
    }
}
