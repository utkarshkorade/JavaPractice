interface Swimmer {
    void swimming();
}

interface Cricketer {
    void playingcricket();
}

class Player implements Swimmer, Cricketer {
    
    public void swimming() {
        System.out.println("Player is swimming");
    }

    public void playingcricket() {
        System.out.println("Player is playing cricket");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.swimming();
        p1.playingcricket();
    }
}
