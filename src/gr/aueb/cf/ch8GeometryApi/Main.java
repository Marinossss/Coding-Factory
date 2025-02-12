package gr.aueb.cf.ch8GeometryApi;

public class Main {


    public static void main(String[] args) {
        Point point = new Point(10, 20, 30);

        System.out.println("Point: " + point.convertToString());

        System.out.println("Distance on XY plane: " + point.getXYDistance());
        System.out.println("Distance on YZ plane: " + point.getYZDistance());
        System.out.println("Distance on XZ plane: " + point.getXZDistance());
        System.out.println("Distance on XYZ plance: " + point.getXYZDistance());

    }



}
