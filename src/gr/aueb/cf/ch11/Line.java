package gr.aueb.cf.ch11;

import gr.aueb.cf.ch11.Abstract.AbstractShape;

public class Line extends AbstractShape {
    private double length;

    public Line() {

    }

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
