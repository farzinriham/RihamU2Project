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

    public String equation() { // y = mx + b, also, please ask Mr Miller if slope() should be used here
        if (yTwo == yOne) {
            return "y = " + yIntercept(); // method
        } else { // I hate this EC.
            int xDiff = xTwo - xOne;
            int yDiff = yTwo - yOne;
            if (yDiff == 0) {
                if (yIntercept() == 0.0) {
                    return "y = 0";
                } else if (yIntercept() < 0.0) {
                    double abs = Math.abs(yIntercept());
                    return "y = -" + abs;
                } else {
                    return "y = " + yIntercept();
                }
            }
            if (yDiff % xDiff == 0) { // if slope is a whole number, if not, go to else if statement and work from there
                if (yDiff / xDiff == 1) { // check if slope is 1- if not, check if it's -1
                    if (yIntercept() == 0.0) {
                        return "y = x";
                    } else if (yIntercept() < 0.0) {
                        double abs = Math.abs(yIntercept());
                        return "y = x - " + abs;
                    } else {
                        return "y = x + " + yIntercept();
                    }
                }
                if (yDiff / xDiff == -1) { // check if slope is -1, if not, proceed to normal remaining code
                    if (yIntercept() == 0.0) {
                        return "y = -x";
                    } else if (yIntercept() < 0.0) {
                        double abs = Math.abs(yIntercept());
                        return "y = -x - " + abs;
                    } else {
                        return "y = -x + " + yIntercept();
                    }
                }
                int slope = yDiff / xDiff; // go here if not 1 or -1
                if (yIntercept() == 0.0) {
                    return "y = " + slope;
                } else if (yIntercept() < 0.0) {
                    double abs = Math.abs(yIntercept());
                    return "y = " + slope + "x - " + abs;
                } else {
                    return "y = " + slope + "x + " + yIntercept();
                }
            } else if (yDiff < xDiff || yDiff % xDiff != 0) { // here's where we go when slope isn't a whole number and <1. eg 2/3. 0 < slope < 1.
                if (yDiff / xDiff < 0) { // if slope is negative... else go to the next statement
                    double yAbsDiff = Math.abs(yDiff);
                    double xAbsDiff = Math.abs(xDiff);
                    String slope = yAbsDiff + "/" + xAbsDiff;
                    if (yIntercept() == 0) {
                        return "y = -" + slope + "x";
                    } else if (yIntercept() < 0.0) {
                        double abs = Math.abs(yIntercept());
                        return "y = -" + slope + "x " + abs;
                    } else {
                        return "y = -" + slope + "x " + yIntercept();
                    }
                }
                String slope = yDiff + "/" + xDiff;
                if (yIntercept() < 0) {
                    double abs = Math.abs(yIntercept());
                    return "y = " + slope + "x - " + abs;
                }
                return "y = " + slope + "x + " + yIntercept();
            }
        }
        int xDiff = xTwo - xOne;
        int yDiff = yTwo - yOne;
        return yDiff + "/" + xDiff + "x";
    }

    public String coordinateForX(double x) { // y = mx + b
        double mx = roundedToHundredth((x * slope())); // method
        double y = mx + yIntercept(); // method
        return "(" + x + ", " + y + ")";
    }

    public String lineInfo() {
        String twoPoints = "The two points are: (" + xOne + ", " + yOne + ") and (" + xTwo + ", " + yTwo + ")";
        String equation = "The equation of the line between these points is: " + equation();
        String slope = "The slope of this line is: " + slope();
        String yInt = "The y-intercept of this line is: " + yIntercept();
        String dist = "The distance between these points is: " + distance();
        return "Here's some information regarding the two points inputted!\n" + twoPoints + "\n" + equation + "\n" + slope + "\n" + yInt + "\n" + dist;
    }
}