package gr.aueb.cf.ch11.Abstract;

import gr.aueb.cf.ch11.Interfaces.IShape;

public abstract class AbstractShape implements IShape {
    private long id;

    public AbstractShape() {

    }

    public AbstractShape(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
