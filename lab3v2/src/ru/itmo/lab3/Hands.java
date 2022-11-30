package ru.itmo.lab3;

public class Hands extends Things{
    public Hands(String name){
        super(name);
        this.howisit = HowIsIt.IMPOSSIBLE;
    }
    public void raiseHands(){
        System.out.println("поднять " + name + " к голове");
    }
}
