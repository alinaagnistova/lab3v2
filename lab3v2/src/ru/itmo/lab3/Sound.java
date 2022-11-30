package ru.itmo.lab3;


public class Sound extends Things{
    public Sound(String name){
        super(name);
        this.characteristic = Characteristic.LOUD_AND_WHISTLING;
        this.howisit = HowIsIt.SUDDENLY;
    }
    public void forcedToRecoil(Alice alice){
        System.out.println(name + " заставил опрянуть " + alice.getName());
    }
}
