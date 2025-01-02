public class statics {
    public static void main(String[] args) {
        Staticwali st = new Staticwali();
        st.clg = "VISHWASHANTI VIDHYALAY BHENDALA";
        Staticwali st1 = new Staticwali();

        System.out.println(st1.clg);
        st1.clg = "pompom clg ";
        System.out.println(st1.clg);

        st1.setitems("papalu");
        System.out.println(st1.getitems());
    }
}

class Staticwali {

    String name;
    int num;
    static String clg;

    void setitems(String name) {
        this.name = name;
    }

    String getitems() {
        return this.name;
    }

}
