
import java.util.ArrayList;

class Array {
    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(12);
        a1.add(53);
        a1.add(77);

        System.out.println(a1);
        System.out.println(a1.indexOf(53));
        System.out.println(a1.set(1, 78));
        System.out.println(a1.get(1));
        System.out.println(a1.isEmpty());
        System.out.println(a1.contains(77));
        System.out.println(a1.toString());
        System.out.println(a1);
        System.out.println(a1.remove(0));
        System.out.println(a1);
    }
}