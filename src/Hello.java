//this is like the reverse print but with say hello


public class Hello {
    public static void main(String[] args) {
        sayHello(8);
    }
    private static void sayHello(int count) {
        System.out.println("Hello World");
        if (count <= 1) {
            return;
        }
        sayHello(count - 1);
    }
}
