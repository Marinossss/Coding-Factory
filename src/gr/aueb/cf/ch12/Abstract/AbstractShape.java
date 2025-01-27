package gr.aueb.cf.ch12.Abstract;

import gr.aueb.cf.ch12.Interfaces.IShape;

public abstract class AbstractShape implements IShape {
    private long id;

    public AbstractShape() {

    }

    public AbstractShape(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
