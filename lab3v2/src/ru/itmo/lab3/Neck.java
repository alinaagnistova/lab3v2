package ru.itmo.lab3;

public class Neck extends Things {
    public Neck(String name){
        super(name);
        this.characteristic = Characteristic.NEW;
        this.howisit = HowIsIt.PERFECTLY;
        this.direction = Direction.ANY;
        this.howisit = HowIsIt.SMOOTH_ZIGZAG;
    }
    public void Buckle(){
        System.out.print(name + " гнётся");

    }

}
