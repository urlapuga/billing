package billing.shaper.dao;

import billing.shaper.enums.ShapeClass;
import billing.shaper.model.Subscriber;

public interface ShapeDao {
    boolean Shape(Subscriber subscriber, ShapeClass shapeClass);
    boolean Disable(Subscriber subscriber);
    boolean Enable(Subscriber subscriber );
}
