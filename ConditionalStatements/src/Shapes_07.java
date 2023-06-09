import java.util.Scanner;

public class Shapes_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        if (shape.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            System.out.printf("%.3f", area);
        }
        else if (shape.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;
            System.out.printf("%.3f", area);
        }
        else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * Math.pow(r, 2);
            System.out.printf("%.3f", area);
        }
        else if (shape.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = (a * b) / 2;
            System.out.printf("%.3f", area);
        }

    }
}
