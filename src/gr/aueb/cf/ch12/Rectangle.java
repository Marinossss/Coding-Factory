package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.Abstract.AbstractShape;
import gr.aueb.cf.ch12.Interfaces.IRectangle;
import gr.aueb.cf.ch12.Interfaces.ITwoDimensional;

public class Rectangle extends AbstractShape implements IRectangle{
    private double width;
    private double height;

    public Rectangle() {

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
        return (long) (2 * (width * height));
    }
}
