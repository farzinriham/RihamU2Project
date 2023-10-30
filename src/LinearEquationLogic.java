import java.util.Scanner;

public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in); //only logic should take in user input!

    private String coordinates1;
    private String coordinates2;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    /* Getting coordinates: Please remember to use these in start() method */

    private void getCoordinates1 () {
        System.out.print("Welcome to Equation Calculator! Please enter the first coordinate /example: (6, -2)/: ");
        coordinates1 = scan.nextLine();
    }

    private void getCoordinates2 () {
        System.out.print("Please enter the second coordinate /example: (6, -2)/: ");
        coordinates2 = scan.nextLine();
    }

    /* Getting x and y values: Please remember to use these in start() method */

    private void getX1 () { //USE THE INDEX OF COMMAAAAAAA, also note that the coordinates are be like (x, y) with space after comma, and don't forget negative numbers exist!!!!
        int idxComma = coordinates1.indexOf(",");
        String xString = coordinates1.substring(1, idxComma);
        x1 = Integer.parseInt(xString);
    }

    private void getY1 () { //USE THE INDEX OF COMMAAAAAAA, also note that the coordinates are be like (x, y) with space after comma, and don't forget negative numbers exist!!!!
        int lengthC1 = coordinates1.length();
        int idxComma = coordinates1.indexOf(",");
        String yString = coordinates1.substring(idxComma+2, lengthC1-1);
        y1 = Integer.parseInt(yString);
    }

    private void getX2 () { //USE THE INDEX OF COMMAAAAAAA, also note that the coordinates are be like (x, y) with space after comma, and don't forget negative numbers exist!!!!
        int idxComma = coordinates2.indexOf(",");
        String xString = coordinates2.substring(1, idxComma);
        x2 = Integer.parseInt(xString);
    }

    private void getY2 () { //USE THE INDEX OF COMMAAAAAAA, also note that the coordinates are be like (x, y) with space after comma, and don't forget negative numbers exist!!!!
        int lengthC2 = coordinates2.length();
        int idxComma = coordinates2.indexOf(",");
        String yString = coordinates2.substring(idxComma+2, lengthC2-1);
        y2 = Integer.parseInt(yString);
    }
}
