import java.util.Scanner;

/**
 * Sharron Jackson
 * 1/30/17
 * TriangleArea.java
 * This program takes input for the length and width of a triangle
 * and calculates the area
 */

public class RoomCalc {
    public static void main (String [] args) {
        //1. set up resources
        Scanner scan = new Scanner(System.in);

        //2. output so the user knows what's up
        System.out.println("Perimeter of rectangle");
            //while loop
          int choose = 1;

        while (choose == 1){

            //3. ask for input
            System.out.print("Enter length of rectangle: ");
            double length = scan.nextDouble();

            System.out.print("Enter width of rectangle: ");
            double width = scan.nextDouble();

            //4. perform calculations
            double area = length * width;
            double perimeter = length * 2 + width * 2;
            System.out.println("the perimeter is " + perimeter);

            //5. output results
            System.out.println("The area is " + area);

            //6. Ask if user wants to continue measuring room
            System.out.println("Continue?: enter 1 for yes or 2 for no");
            choose = scan.nextInt();
        }
        //7. close out resources
        scan.close();
        }

    }

