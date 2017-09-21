package billing.shaper.dao;

import billing.shaper.model.SqlConfig;

public class RemoteSqlHandler implements AutoCloseable {

    public boolean execute(String sql) {
        return false;
    }

    public RemoteSqlHandler(SqlConfig config) {
        connect();
    }


    private boolean connect() {
        return false;
    }

    private boolean disconnect() {
        return false;
    }


    public void close() throws Exception {
        disconnect();
    }
}
