public class LinearEquation {
    private int xOne;
    private int xTwo;
    private int yOne;
    private int yTwo;

    public LinearEquation(int xOne, int xTwo, int yOne, int yTwo) { //constructor
        xOne = this.xOne;
        xTwo = this.xTwo;
        yOne = this.yTwo;
        yTwo = this.yTwo;
    }

    public double distance() {
        double xDiff = Math.pow((xTwo - xOne), 2);
        double yDiff = Math.pow((yTwo - yOne), 2);
        double fin = Math.sqrt((xDiff + yDiff));
        double finRounded = Math.round(fin * 10.0) / 10.0;
        return finRounded;
    }

    public double slope() {
        double xDiff = xTwo - xOne;
        double yDiff = yTwo - yOne;
        double quotient = yDiff / xDiff;
        double slope = Math.round(quotient * 100.0) / 100.0;
        return slope;
    }

    public double yIntercept() {
        double yInt = yOne - ((slope()) * (xOne)); // b = y - mx
        double yIntRounded = Math.round(yInt * 100.0) / 100.0;
        return yIntRounded;
    }

    public String equation() {
        if (yTwo == yOne) {
            return "y = " + yIntercept();
        } else {
            int xDiff = xTwo - xOne;
            int yDiff = yTwo - yOne;
            String slope = yDiff + "/" + xDiff;
            return "y = " + slope + "x + " + yIntercept();
        }
    }

    public String coordinateForX(double x) { // y = mx + b
        double mx = Math.round((x * slope()) * 100.0) / 100.0;
        double y = mx + yIntercept();
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