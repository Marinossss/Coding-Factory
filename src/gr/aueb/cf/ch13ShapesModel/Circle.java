package gr.aueb.cf.ch13ShapesModel;

import gr.aueb.cf.ch13ShapesModel.Abstract.AbstractShape;
import gr.aueb.cf.ch13ShapesModel.Interfaces.ICircle;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ICircle, Serializable {
    public static final long serialVersionUID = 1L;
    private double radius;

    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    public Circle(Circle other) {
        this.radius = other.radius;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
