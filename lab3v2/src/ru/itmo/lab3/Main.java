package ru.itmo.lab3;

import java.util.List;

public class Main implements GetInfo, AliceActions {
    public static void main(String[] args) {
        Alice alice = new Alice("Алиса");
        Neck neck = new Neck("Шея");
        Sound sound = new Sound("Звук");
        Awe awe = new Awe("Трепет");
        Hands hands = new Hands("руки");
        String whatsheunderstood = "это просто листва на верхушках деревьев";
        Main main = new Main();
        if (main.executeGetDirection(awe).equals(Direction.SOMEWHERE_OUT_THERE_FAR_BELOW)) {
            System.out.print("Только где-то там, далеко внизу, ");
            if (main.executeGetCharacteristic(awe).equals(Characteristic.LIGHTWEIGHT)) {
                System.out.print("лёгкий ");
            }
        }
        awe.Passed();
        if (main.executeGetHowIsIt(hands).equals(HowIsIt.IMPOSSIBLE)) {
            System.out.print("невозможно ");
        }
        hands.raiseHands();
        main.executeTryToTiltHead(alice);
        System.out.println("к " + main.executeGetName(hands));
        main.executeDidIt(alice);
        if (main.executeGetHowIsIt(alice).equals(HowIsIt.FORTUNATELY)) {
            System.out.print("к счастью ");
        }
        if (main.executeGetCharacteristic(neck).hashCode() == Characteristic.NEW.hashCode()) {
            System.out.print("новая ");
        }
        neck.Buckle();
        if (main.executeGetHowIsIt(neck).toString() == HowIsIt.PERFECTLY.toString()) {
            System.out.print(" великолепно");
        }
        if (main.executeGetDirection(neck).equals(Direction.ANY)) {
            System.out.println(" в любом направлении");
        }
        main.executeToBend(alice, neck);
        if (main.executeGetHowIsIt(alice).equals(HowIsIt.ELEGANT)) {
            System.out.print(" изящно");
        }
        if (main.executeGetHowIsIt(neck).equals(HowIsIt.SMOOTH_ZIGZAG)) {
            System.out.println(" плавным зигзагом");
        }
        main.executeGonnaDiveInGreenSea(alice);
        main.executeUnderstood(alice, whatsheunderstood);
        main.executeDidWalk(alice);
        if (main.executeGetDirection(alice).equals(Direction.UNDER_TREES)) {
            System.out.println(" под этими деревьями");
        }
        if (main.executeGetHowIsIt(sound).equals(HowIsIt.SUDDENLY)) {
            System.out.print("вдруг ");
        }
        if (main.executeGetCharacteristic(sound).equals(Characteristic.LOUD_AND_WHISTLING)) {
            System.out.print("Громкий свистящий ");
        }
        sound.forcedToRecoil(alice);

    }

    @Override
    public Characteristic executeGetCharacteristic(Things things) {
        return things.getCharacteristic();
    }

    @Override
    public Direction executeGetDirection(Things things) {
        return things.getDirection();
    }

    @Override
    public HowIsIt executeGetHowIsIt(Things things) {
        return things.getHowIsIt();
    }

    @Override
    public String executeGetName(Things things) {
        return things.getName();
    }

    @Override
    public void executeTryToTiltHead(Alice alice){
         alice.tryToTiltHead();
    }
    @Override
    public void executeDidIt(Alice alice){
        alice.didIt();
    }
    @Override
    public void executeToBend(Alice alice, Neck neck){
        alice.toBend(neck);
    }
    @Override
    public void executeGonnaDiveInGreenSea(Alice alice){
        alice.gonnaDiveInGreenSea();
    }
    @Override
    public void executeUnderstood(Alice alice, String whatsheunderstood){
        alice.understood(whatsheunderstood);
    }
    @Override
    public void executeDidWalk(Alice alice){
        alice.didWalk();
    }

}