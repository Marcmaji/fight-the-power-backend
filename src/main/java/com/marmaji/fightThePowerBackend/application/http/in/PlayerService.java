package com.marmaji.fightThePowerBackend.application.http.in;

import com.marmaji.fightThePowerBackend.domain.dto.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService implements PlayerPort{

    private List<Player> activePlayers = new ArrayList<>();

    @Override
    public void addPlayer(Player player) {
        activePlayers.add(player);
    }

    @Override
    public void removePlayerById(String id) {
        activePlayers = activePlayers.stream().filter((player -> !player.getId().equals(id))).toList();
    }
}
