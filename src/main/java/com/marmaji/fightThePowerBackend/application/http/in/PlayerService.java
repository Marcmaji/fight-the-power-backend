package com.marmaji.fightThePowerBackend.application.http.in;

import com.marmaji.fightThePowerBackend.domain.dto.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService implements PlayerPort{

    private List<Player> activePlayers = new ArrayList<>();

    @Override
    public List<Player> addPlayer(Player player) {
        activePlayers.add(player);
        return activePlayers;
    }

    @Override
    public List<Player> removePlayerById(String id) {
        activePlayers = activePlayers.stream().filter((player -> !player.getId().equals(id))).collect(Collectors.toList());
        return activePlayers;
    }
}
