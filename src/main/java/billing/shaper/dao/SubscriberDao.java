package billing.shaper.dao;

import billing.shaper.model.Subscriber;

import java.util.List;

public interface SubscriberDao {
    List<Subscriber> getAll();
    boolean add(Subscriber subscriber);
    boolean edit(Subscriber subscriber);
    boolean remove(Subscriber subscriber);
}
