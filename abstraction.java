public class abstraction {
    public static void main(String[] args) {

        Cat cc = new Cat();
        cc.run();
        cc.eat();

    }
}

abstract class Animal {
    void eat() {

        System.out.println("i am eat bhai");

    }

    abstract void run();

}

class doggy extends Animal {

    void run() {
        System.out.println("i am a fast runner");
    }

    void fun() {
        System.out.println("funnnn");
    }

}

class Cat extends Animal {

    void run() {

        System.out.println("i am catty na bhai");

    }

}
