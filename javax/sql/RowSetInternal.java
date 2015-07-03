package javax.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract interface RowSetInternal
{
  public abstract Connection getConnection()
    throws SQLException;

  public abstract ResultSet getOriginal()
    throws SQLException;

  public abstract ResultSet getOriginalRow()
    throws SQLException;

  public abstract Object[] getParams()
    throws SQLException;

  public abstract void setMetaData(RowSetMetaData paramRowSetMetaData)
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.sql.RowSetInternal
 * JD-Core Version:    0.6.0
 */