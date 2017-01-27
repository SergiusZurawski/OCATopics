package oca.bildbloks.FlowControl;

public class While {

    public void eatCheese(int bitesOfCheese) {
        int  roomInBelly = 5;
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }

    public void loopWithourBraces(int bitesOfCheese) {
        int  roomInBelly = 5;
        while (bitesOfCheese > 0)
            bitesOfCheese--;
            roomInBelly--;   // it is outside loop
        System.out.println(roomInBelly);
    }

    public void doWhileLoop(){
        int x = 0;
        do {
            x++;
        } while(false);
        System.out.println(x); // Outputs 1
    }
}
