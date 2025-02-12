package gr.aueb.cf.ch12ObjectModels;

import gr.aueb.cf.ch12ObjectModels.Abstract.AbstractShape;
import gr.aueb.cf.ch12ObjectModels.Interfaces.ITwoDimensional;

public class Circle extends AbstractShape implements ITwoDimensional {
    private double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
