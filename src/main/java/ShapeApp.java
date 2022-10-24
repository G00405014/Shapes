import java.sql.SQLOutput;
import java.util.Scanner;

public class ShapeApp {


    public static void main(String[] args) {
        System.out.println("Please enter the width of the rectangle");
        Scanner input = new Scanner((System.in));
        double lenght = input.nextDouble();
        System.out.println("You entered :" + lenght);
    }
}