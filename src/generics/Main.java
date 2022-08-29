package generics;

public class Main {

    public static void main(String[] args) {

        MagicBox<Integer> magicBox1 = new MagicBox<>(5);
        MagicBox<String> magicBox2 = new MagicBox<>(6);

        magicBox1.add(1);
        magicBox1.add(2);
        magicBox1.add(9);
        magicBox1.add(4);
        magicBox1.add(8);
        magicBox1.add(100);

        magicBox1.pick();

        magicBox2.add("Hello");
        magicBox2.add("Magic");
        magicBox2.add("Box");
        magicBox2.add("Generics");
        magicBox2.add("Java");

        magicBox2.pick();
    }
}
