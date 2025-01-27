package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.Abstract.AbstractShape;
import gr.aueb.cf.ch12.Interfaces.ILine;
import gr.aueb.cf.ch12.Interfaces.ITwoDimensional;

public class Line extends AbstractShape implements ILine {
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
