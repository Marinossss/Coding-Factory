package gr.aueb.cf.ch12ObjectModels;

import gr.aueb.cf.ch12ObjectModels.Abstract.AbstractShape;

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
