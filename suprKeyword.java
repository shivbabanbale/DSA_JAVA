public class suprKeyword {
    public static void main(String[] args) {
        dog dg = new dog();
        System.out.println(dg.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("i am Animal Wala");
    }

}

class dog extends Animal {
    dog() {
        // super();
        super.color = "Red";
        System.out.println("i am dog Wala Constructor'");
    }
}
