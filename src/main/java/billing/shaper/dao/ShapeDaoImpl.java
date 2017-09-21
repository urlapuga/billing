package billing.shaper.dao;

import billing.shaper.enums.ShapeClass;
import billing.shaper.model.Subscriber;

public class ShapeDaoImpl implements ShapeDao {

    @Override
    public boolean Shape(Subscriber subscriber, ShapeClass shapeClass) {
        return false;
    }

    @Override
    public boolean Disable(Subscriber subscriber) {
        return false;
    }

    @Override
    public boolean Enable(Subscriber subscriber) {
        return false;
    }
}
