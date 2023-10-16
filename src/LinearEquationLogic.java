import java.util.Scanner;

public class LinearEquationLogic {
    private Scanner thisScan;
    public LinearEquationLogic() {
        thisScan = new Scanner(System.in);
    }

    public void start() {
        getCoordInfo();
    }

    private void getCoordInfo() {
        System.out.print("Enter first coordinate: ");
        String point1 = thisScan.nextLine();
        System.out.print("Enter second coordinate: ");
        String point2 = thisScan.nextLine();

        int x1 = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        int y1 = Integer.parseInt(point1.substring(point1.indexOf(","), point1.indexOf(")")));
        int x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        int y2 = Integer.parseInt(point2.substring(point2.indexOf(","), point2.indexOf(")")));

        LinearEquation lineq = new LinearEquation(x1, y1, x2, y2);

    }
}
