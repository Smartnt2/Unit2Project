public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double distance;
    private double slope;
    private double yIntercept;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance() {
        double distance = Math.hypot(x1 - x2, y1 - y2);
        return (Math.round(distance * 100) / 100.0);
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double slope() {
        slope = (double) (y2 - y1) / (x2 - x1);
        return (Math.round(slope * 100) / 100.0);
    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    public double yIntercept() {
        yIntercept = 0 - x1 * slope;
        return (Math.round(yIntercept * 100) / 100.0);
    }

    public void setYIntercept(double yIntercept) {
        this.yIntercept = yIntercept;
    }
}
