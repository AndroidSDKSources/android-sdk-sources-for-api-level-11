package javax.sql;

import java.io.PrintWriter;
import java.sql.SQLException;

public abstract interface CommonDataSource
{
  public abstract int getLoginTimeout()
    throws SQLException;

  public abstract PrintWriter getLogWriter()
    throws SQLException;

  public abstract void setLoginTimeout(int paramInt)
    throws SQLException;

  public abstract void setLogWriter(PrintWriter paramPrintWriter)
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.sql.CommonDataSource
 * JD-Core Version:    0.6.0
 */