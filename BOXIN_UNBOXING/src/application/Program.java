package application;

public class Program {
    public static void main(String[] args) {

        System.out.println("boxing unboxing:");
        //boxing unboxing without wrapper classes
        int x = 20;
        Object obj = x;
        System.out.println(obj);
        int y = (int) obj;
        System.out.println(y);

        System.out.println("wrapper classes:");
        //wrapper classes
        int a = 20;
        Integer obj2 = a;
        System.out.println(obj);
        int b = obj2 * 2;
        System.out.println(b);

    }
}