package com.marmaji.fightThePowerBackend.infrastructure.http.adapters;

import com.marmaji.fightThePowerBackend.application.http.in.PlayerPort;
import com.marmaji.fightThePowerBackend.domain.dto.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerAdapter {

    @Autowired
    private PlayerPort playerPort;

    @PostMapping(path = "/player")
    public List<Player> addPlayer(@RequestBody Player player){
        return playerPort.addPlayer(player);
    }

    @DeleteMapping("/player/{id}")
    public List<Player> removePlayerById(@PathVariable(name = "id") String id){
        return playerPort.removePlayerById(id);
    }
}
