public class Super {
    static void show() {
        System.out.println("super class show method");
    }

    static class StaticMethods {
        void show() {
            System.out.println("sub class show method");
        }
    }

    public static void main(String[] args) {
        Super.show(); // Calls outer class static method
        new Super.StaticMethods().show(); // Calls nested class instance method
    }
}
