import java.util.Scanner;

public class LinearEquationLogic {
    private Scanner thisScan;
    private Boolean getCoordInfoFlag = Boolean.TRUE;
    public LinearEquationLogic() {
        thisScan = new Scanner(System.in);
    }

    public void start() {
        getCoordInfo();
    }

    private void getCoordInfo() {
        while(getCoordInfoFlag) {
            System.out.print("Enter first coordinate: ");
            String point1 = thisScan.nextLine();
            System.out.print("Enter second coordinate: ");
            String point2 = thisScan.nextLine();

            int x1 = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
            int y1 = Integer.parseInt(point1.substring(point1.indexOf(" ") + 1, point1.indexOf(")")));
            int x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
            int y2 = Integer.parseInt(point2.substring(point2.indexOf(" ") + 1, point2.indexOf(")")));

            LinearEquation lineq = new LinearEquation(x1, y1, x2, y2);
            System.out.println(lineq.lineInfo());
            System.out.println(" ");

            if(x1 != x2) {
                System.out.print("Enter a value for x: ");
                double x = thisScan.nextDouble();
                thisScan.nextLine();
                System.out.println("The point on the line is " + lineq.coordinateForX(x));
            }

            System.out.print("Would you like to enter another pair of coordinates? (y/n): ");
            String selection = thisScan.nextLine();
            if(selection.equals("n")) { getCoordInfoFlag = Boolean.FALSE; }
        }
    }
}
