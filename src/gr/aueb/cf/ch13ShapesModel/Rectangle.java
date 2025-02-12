package gr.aueb.cf.ch13ShapesModel;

import gr.aueb.cf.ch13ShapesModel.Abstract.AbstractShape;
import gr.aueb.cf.ch13ShapesModel.Interfaces.IRectangle;

import java.io.Serializable;

public class Rectangle extends AbstractShape implements IRectangle, Serializable {
    private static final long serialVersionUID = 1L;

    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(Rectangle other) {
        this.width = other.width;
        this.height = other.height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * (width + height));
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;

        return Double.compare(width, rectangle.width) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(width);
        result = 31 * result + Double.hashCode(height);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
