import java.util.Scanner;

public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in); //only logic should take in user input!

    private String coordinates1;
    private String coordinates2;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private void getCoordinates1 () {
        System.out.print("Welcome to Equation Calculator! Please enter the first coordinate /example: (6, -2)/: ");
        coordinates1 = scan.nextLine();
    }

    private void getCoordinates2 () {
        System.out.print("Please enter the second coordinate /example: (6, -2)/: ");
        coordinates2 = scan.nextLine();
    }

    private void getX1 () { //USE THE INDEX OF COMMAAAAAAA, also note that coordinates can be like (x, y), and don't forget negative numbers exist!!!!
        int lengthC1 = coordinates1.length();
        int idxComma = coordinates1.indexOf(",");
    }
}
