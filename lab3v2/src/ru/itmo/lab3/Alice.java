package ru.itmo.lab3;

public class Alice extends Things{
    public Alice(String name){
        super(name);
        this.howisit = HowIsIt.FORTUNATELY;
        this.howisit = HowIsIt.ELEGANT;
        this.direction = Direction.UNDER_TREES;
    }

    public void tryToTiltHead(){
        System.out.print(name + " пыталась наклонить голову ");
    }
    public void didIt(){
        System.out.println(name + " сделала это");
    }
    public void toBend(Neck neck){
        System.out.print(name + " изогнула " + neck.getName());

    }
    public void gonnaDiveInGreenSea(){
        System.out.println(name + " собиралась нырнуть в зелёное море");
    }
    public void understood(String var1){
        System.out.println(name + " поняла " + var1);

    }
    public void didWalk(){
        System.out.print(name +  " гуляла");

    }
}
