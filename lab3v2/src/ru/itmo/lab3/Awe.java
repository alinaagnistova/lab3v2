package ru.itmo.lab3;

public class Awe extends Things{
    public Awe(String name){
        super(name);
        this.characteristic = Characteristic.LIGHTWEIGHT;
        this.direction = Direction.SOMEWHERE_OUT_THERE_FAR_BELOW;
    }
    public void Passed(){
        System.out.println(name + " прошёл по зелени");
    }
}
