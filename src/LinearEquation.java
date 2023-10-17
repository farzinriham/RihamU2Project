public class LinearEquation {
    private int xOne;
    private int xTwo;
    private int yOne;
    private int yTwo;

    public LinearEquation (int xOne,int xTwo,int yOne,int yTwo) {
        xOne = this.xOne;
        xTwo = this.xTwo;
        yOne = this.yTwo;
        yTwo = this.yTwo;
    }

    public double distance () {
        double xDiff = Math.pow((xTwo-xOne), 2);
        double yDiff = Math.pow((yTwo-yOne), 2);
        double fin = Math.sqrt((xDiff + yDiff));
        double finRounded = Math.round(fin * 10.0) / 10.0;
        return finRounded;
    }

    public double slope () {
        double xDiff = xTwo-xOne;
        double yDiff = yTwo-yOne;
        double quotient = yDiff/xDiff;
        double slope = Math.round(quotient * 100.0) / 100.0;
        return slope;
    }

    public double yIntercept () {
        double yInt = yOne - ((slope ()) * (xOne)); // b = y - mx
        return yInt;
    }

    public String equation () {
        if (yTwo == yOne) {
           return "y = " + yIntercept();
        } else {
            int xDiff = xTwo-xOne;
            int yDiff = yTwo-yOne;
            String slope = yDiff + "/" + xDiff;
            return "y = " + slope + "x + " + yIntercept();
        }
    }
}
