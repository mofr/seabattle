package ru.dasha.seabattle.protocol;

public class PlaceShipsCommand {

    public Ship[] ships;

    public static class Ship {
        public int x;
        public int y;
        public boolean vertical;
        public int size;
    }
}