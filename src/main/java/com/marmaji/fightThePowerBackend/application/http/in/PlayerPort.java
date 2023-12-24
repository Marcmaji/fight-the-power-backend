package com.marmaji.fightThePowerBackend.application.http.in;

import com.marmaji.fightThePowerBackend.domain.dto.Player;

public interface PlayerPort {
    void addPlayer(Player player);
    void removePlayerById(String id);
}
