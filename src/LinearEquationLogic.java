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
        System.out.print("Please enter the first coordinate /example: (6, -2)/: ");
        coordinates1 = scan.nextLine();
    }

    private void getCoordinates2 () {
        System.out.print("Please enter the second coordinate /example: (6, -2)/ Please do not type the same x coordinate: ");
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

    public String start() {
        System.out.println("Welcome to Equation Calculator!");
        String userInput = "";
        while (!userInput.equals("no")) { //ASK MR MILLER WHY IT WON'T STOP WHEN I SAY "no".
            getCoordinates1();
            getCoordinates2();
            getX1();
            getX2();
            getY1();
            getY2();
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
            while (x1 == x2) {
                System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("Bruh, if you enter the same x coordinate for each pair, you'll get a vertical slope.");
                System.out.println("Which means I'm gonna get an undefined value.");
                System.out.println("Which means I'm gonna break.");
                System.out.println("Please use your brain, which I hope you have, and try again.");
                System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
                getCoordinates1();
                getCoordinates2();
                getX1();
                getX2();
                getY1();
                getY2();
                equation = new LinearEquation(x1, y1, x2, y2);
            }
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
            String lineInformation = equation.lineInfo();
            System.out.println(lineInformation);
            System.out.print("Enter an x value.");
            double x = scan.nextDouble();
            scan.nextLine();
            System.out.println(equation.coordinateForX(x));
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
            System.out.print("Would you like to enter coordinates again? TYPE no if not. ");
            userInput = scan.nextLine();
            if (userInput.equals("no")) {
                System.out.println("Alright then! Thanks for using Equation Calculator, see you next time!");
            }
            //scan.nextLine();
        }
    return "i hate marcus, and this shouldn't print.";
    }
}

