package gr.aueb.cf.ch13ShapesModel;

import gr.aueb.cf.ch13ShapesModel.Abstract.AbstractShape;
import gr.aueb.cf.ch13ShapesModel.Interfaces.ILine;

import java.io.Serializable;

public class Line extends AbstractShape implements ILine, Serializable {
    private static final long serialVersionUID = 1L;
    private double length;

    public Line() {

    }

    public Line(Line other) {
        this.length = other.length;
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

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;

        return Double.compare(length, line.length) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(length);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
