package pl.pjatk.game.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.game.model.Player;
import pl.pjatk.game.service.PlayerService;
import pl.pjatk.game.service.DamageService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/player")

public class PlayerController {

    private PlayerService playerService;
    private DamageService damageService;

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

    @DeleteMapping("/del/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        playerService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Player> update(@RequestBody Player player, @PathVariable long id) {
        return ResponseEntity.ok(playerService.update(id, player));
    }

/*    @PutMapping("/{off}/{def}")
    public ResponseEntity<Player> attack(@PathVariable long off, @PathVariable long def, @RequestBody Player player) {
        return ResponseEntity.ok(damageService.attack(off, def, player));
    }*/

    //@PutMapping("/{id}/{id2}")
    //public ResponseEntity<Player> damage(@PathVariable Long id, @PathVariable Long id2) {
    //    return ResponseEntity.ok(damageService.damage(id, id2));
    //}


}
