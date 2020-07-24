import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hãy nhập x: ");
            int x = scanner.nextInt();
            System.out.println("Hãy nhập y: ");
            int y = scanner.nextInt();
            System.out.println("Hãy nhập z: ");
            int z = scanner.nextInt();
            Triangle triangle = new Triangle(x,y,z);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}

