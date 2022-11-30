package ru.itmo.lab3;

abstract class Things {
    protected String name;
    protected Characteristic characteristic;
    protected Direction direction;
    protected HowIsIt howisit;
    public Things(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public Direction getDirection(){
        return direction;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }
    public HowIsIt getHowIsIt(){
        return howisit;
    }

}

