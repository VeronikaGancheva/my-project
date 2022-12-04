import java.util.Scanner;  // Import the Scanner class

class consoleInputTrianglePerimeter {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter value for a ");
        int objA = Integer.parseInt(a.nextLine());

        Scanner b = new Scanner(System.in);
        System.out.println("Enter value for b ");
        int objB = Integer.parseInt(b.nextLine());

        Scanner c = new Scanner(System.in);
        System.out.println("Enter value for c ");
        int objC = Integer.parseInt(c.nextLine());

        System.out.println("Perimeter of the triangle is: " + (objA+objB+objC));
    }
}