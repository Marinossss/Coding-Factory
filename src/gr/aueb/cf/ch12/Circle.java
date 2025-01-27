package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.Abstract.AbstractShape;
import gr.aueb.cf.ch12.Interfaces.ICircle;
import gr.aueb.cf.ch12.Interfaces.ITwoDimensional;

public class Circle extends AbstractShape implements ICircle {
    private double radius;

    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * Math.PI * radius);
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
