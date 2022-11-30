package ru.itmo.lab3;

public interface GetInfo {
    public String executeGetName(Things things);
    public Direction executeGetDirection(Things things);
    public Characteristic executeGetCharacteristic(Things things);
    public HowIsIt executeGetHowIsIt(Things things);
}
