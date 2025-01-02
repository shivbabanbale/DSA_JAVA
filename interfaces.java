public class interfaces {
    public static void main(String[] args) {
        Horse hh = new Horse();
        System.out.println(hh.character);
        System.out.println(hh.character1);
        hh.move();
        hh.Shot();
    }
}

interface Animal {
    String character = "speechless";

    void move();
}

interface Man {

    String character1 = "Tharki";

    void Shot();

}

class Horse implements Animal, Man {
    public void move() {
        System.out.println("move to karana padega na meri jan");
    }

    public void Shot() {
        System.out.println("Shot to marna Padega na bhai");
    }
}
