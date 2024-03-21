package model;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ba canh cua tam giac :");
        try {
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Tam giac co canh " + triangle.getSide1() + ", " + triangle.getSide2() + ", " + triangle.getSide3() + " hop le.");
        } catch (IllegalTriangleException e) {
            System.out.println("Khong hop le " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Hop le " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
