package com.marmaji.fightThePowerBackend.application.http.in;

import com.marmaji.fightThePowerBackend.domain.dto.Player;

import java.util.List;

public interface PlayerPort {
    List<Player> addPlayer(Player player);
    List<Player> removePlayerById(String id);
}
