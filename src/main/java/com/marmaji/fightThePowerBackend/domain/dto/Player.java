package com.marmaji.fightThePowerBackend.domain.dto;

import com.marmaji.fightThePowerBackend.domain.utils.Position;
import com.marmaji.fightThePowerBackend.domain.utils.Size;

public class Player {
    private String id;
    private Position position;
    private Size size;
    private Size arenaSize;
    private Integer speed;
    private Integer angle;
    private Size boundingBox;

    public Player() {}

    public Player(String id, Position position, Size size, Size arenaSize) {
        this.id = id;
        this.position = position;
        this.size = size;
        this.arenaSize = arenaSize;
        this.speed = 2;
        this.angle = 0;
        this.boundingBox = size;
    }

    public Player(String id, Position position, Size size, Size arenaSize, Integer speed, Integer angle) {
        this.id = id;
        this.position = position;
        this.size = size;
        this.arenaSize = arenaSize;
        this.speed = speed;
        this.angle = angle;
        this.boundingBox = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getArenaSize() {
        return arenaSize;
    }

    public void setArenaSize(Size arenaSize) {
        this.arenaSize = arenaSize;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public Size getBoundingBox() {
        return boundingBox;
    }

    public void setBoundingBox(Size boundingBox) {
        this.boundingBox = boundingBox;
    }
}
