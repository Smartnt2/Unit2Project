public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double roundedToHundredth(double toRound) {
        return (Math.round(toRound * 100) / 100.0);
    }

    public double distance() {
        double distance = Math.hypot(x1 - x2, y1 - y2);
        return roundedToHundredth(distance);
    }

    public double slope() {
        if(x1 == x2 || y1 == y2) {
            return 0;
        } else {
            return roundedToHundredth((double) (y2 - y1) / (x2 - x1)); }
    }

    public double yIntercept() {
        return roundedToHundredth(y1 - slope() * x1);
    }

    public String equation() {
        String equation = "";
        //slope logic
        if(y1 == y2) {
            equation = "y = " + yIntercept();
        } else if(x1 == x2) {
            equation = "x = " + x1;
        } else if(slope() == 1) {
            equation = "y = x";
        } else if(slope() == -1) {
            equation = "y = -x";
        } else if(slope() != (int) slope() && slope() > 0) {
            equation = "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
        } else if(slope() != (int) slope() && slope() < 0) {
            equation = "y = -" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
        } else if(slope() == (int) slope()) {
            equation = "y = " + (int)slope() + "x";
        }

        //y intercept logic
        if (x1 != x2 && y1 != y2) {
            if (yIntercept() > 0) {
                equation += " + " + yIntercept();
            }
            if (yIntercept() < 0) {
                equation += " - " + Math.abs(yIntercept());
            }
        }
        return equation;
    }

    public String coordinateForX(double x) {
        double y = slope() * x + yIntercept();
        x = roundedToHundredth(x);
        y = roundedToHundredth(y);

        return "(" + x + ", " + y + ")";
    }

    public String lineInfo() {
        if(x1 == x2) {
            return
                    "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n" +
                    "The equation of the line between these points is: " + equation() + "\n" +
                    "The slope of this line is: " + slope() + "\n" +
                    "The distance between these points is " + distance();
        } else {
            return
                    "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n" +
                    "The equation of the line between these points is: " + equation() + "\n" +
                    "The slope of this line is: " + slope() + "\n" +
                    "The y-intercept of this line is: " + yIntercept() + "\n" +
                    "The distance between these points is " + distance();

        }
    }
}
