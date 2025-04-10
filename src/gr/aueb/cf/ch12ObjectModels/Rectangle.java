package gr.aueb.cf.ch12ObjectModels;

import gr.aueb.cf.ch12ObjectModels.Abstract.AbstractShape;
import gr.aueb.cf.ch12ObjectModels.Interfaces.ITwoDimensional;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
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
}
