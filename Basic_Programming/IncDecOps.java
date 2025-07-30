public class IncDecOps {
    public static void main(String[] args) {
        int a;

        a = 5;
        System.out.println("a++: " + (a++));
        System.out.println("After a++: " + a);

        a = 5;
        System.out.println("++a: " + (++a));
        System.out.println("After ++a: " + a);

        a = 5;
        System.out.println("a--: " + (a--));
        System.out.println("After a--: " + a);

        a = 5;
        System.out.println("--a: " + (--a));
        System.out.println("After --a: " + a);
    }
}
