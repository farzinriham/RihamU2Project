public class LinearEquation {
    private int xOne;
    private int xTwo;
    private int yOne;
    private int yTwo;

    public LinearEquation(int xOne, int yOne, int xTwo, int yTwo) { // constructor
        this.xOne = xOne;
        this.xTwo = xTwo;
        this.yOne = yOne;
        this.yTwo = yTwo;
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }

    public double roundedToTenth(double toRound) {
        return Math.round(toRound * 10) / 10.0;
    }

    public double distance() {
        double xDiff = Math.pow((xTwo - xOne), 2);
        double yDiff = Math.pow((yTwo - yOne), 2);
        double fin = Math.sqrt((xDiff + yDiff));
        double finRounded = roundedToTenth(fin); // method
        return finRounded;
    }

    public double slope() {
        double xDiff = xTwo - xOne;
        double yDiff = yTwo - yOne;
        double quotient = yDiff / xDiff;
        double slope = roundedToHundredth(quotient); // method
        return slope;
    }

    public double yIntercept() { // b = y - mx,
        double yInt = yOne - ((slope()) * (xOne)); // method
        double yIntRounded = roundedToHundredth(yInt); // method
        return yIntRounded;
    }

    public String equation() {
        if (yTwo == yOne) {
            return "y = " + yIntercept(); // method
        } else {
            int xDiff = xTwo - xOne;
            int yDiff = yTwo - yOne;
            String slope = yDiff + "/" + xDiff;
            return "y = " + slope + "x + " + yIntercept(); // method
        }
    }

    public String coordinateForX(double x) { // y = mx + b
        double mx = roundedToHundredth((x * slope())); // method
        double y = mx + yIntercept(); // method
        return "(" + x + ", " + y + ")";
    }

    public String lineInfo() {
        String twoPoints = "The two points are: (" + xOne + ", " + yOne + ") and (" + xTwo + ", " + yTwo + ")";
        String equation = " The equation of the line between these points is: " + equation();
        String slope = "The slope of this line is: " + slope();
        String yInt = "The y-intercept of this line is: " + yIntercept();
        String dist = "The distance between these points is: " + distance();
        return "Here's some information regarding the two points inputted!\n" + twoPoints + "\n" + equation + "\n" + slope + "\n" + yInt + "\n" + dist;
    }
}