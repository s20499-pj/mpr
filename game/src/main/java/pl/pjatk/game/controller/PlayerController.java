package pl.pjatk.game.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.game.model.Player;
import pl.pjatk.game.service.PlayerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/player")

public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<List<Player>> findAll(){
        return ResponseEntity.ok(playerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Player>> findById(@PathVariable int id){
        Optional<Player> byId = playerService.findById(id);
        if (byId.isPresent()) return ResponseEntity.ok(byId);
        else return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Player> save(@RequestBody Player player){
        return ResponseEntity.ok(playerService.save(player));
    }
}
