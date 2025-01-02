public class Classobjects {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.settipsize(8);
        p1.setcolot("Red");
        System.out.println(p1.getcolor());
        System.out.println(p1.gettipsize());
        System.out.println("hIIIIII");
    }
}

class Pen {

    private String color;
    private int tipsize;

    String getcolor() {
        return this.color;
    }

int gettipsize(){
    return this.tipsize;
}

    void setcolot(String newcolor) {

        color = newcolor;

    }

    void settipsize(int newsize) {
        tipsize = newsize;

    }

}
