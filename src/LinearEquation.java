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
        return fin;
    }
}
