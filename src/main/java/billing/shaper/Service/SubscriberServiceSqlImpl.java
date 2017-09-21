package billing.shaper.Service;

import billing.shaper.dao.RemoteSqlHandler;
import billing.shaper.model.SqlConfig;

public class SubscriberServiceSqlImpl implements SubscriberService {
    private String sql = null;
    private String tableName = "customers";
    private String setter = null;
    private String id;
    SqlConfig config = new SqlConfig("ip",0,"login","pass");
    RemoteSqlHandler remoteSqlHandler = new RemoteSqlHandler(config);


    public boolean shape() {
        sql = "UPDATE " + tableName + " SET field = "+ setter + " WHERE id = "+id;
        return remoteSqlHandler.execute(sql);
    }

    public boolean enable() {
        sql = "UPDATE " + tableName + " SET field = "+ setter + " WHERE id = "+id;
        return remoteSqlHandler.execute(sql);
    }

    public boolean disable() {
        sql = "UPDATE " + tableName + " SET field = "+ setter + " WHERE id = "+id;
        return remoteSqlHandler.execute(sql);
    }
}
