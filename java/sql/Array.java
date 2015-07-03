package java.sql;

import java.util.Map;

public abstract interface Array
{
  public abstract Object getArray()
    throws SQLException;

  public abstract Object getArray(long paramLong, int paramInt)
    throws SQLException;

  public abstract Object getArray(long paramLong, int paramInt, Map<String, Class<?>> paramMap)
    throws SQLException;

  public abstract Object getArray(Map<String, Class<?>> paramMap)
    throws SQLException;

  public abstract int getBaseType()
    throws SQLException;

  public abstract String getBaseTypeName()
    throws SQLException;

  public abstract ResultSet getResultSet()
    throws SQLException;

  public abstract ResultSet getResultSet(long paramLong, int paramInt)
    throws SQLException;

  public abstract ResultSet getResultSet(long paramLong, int paramInt, Map<String, Class<?>> paramMap)
    throws SQLException;

  public abstract ResultSet getResultSet(Map<String, Class<?>> paramMap)
    throws SQLException;

  public abstract void free()
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.Array
 * JD-Core Version:    0.6.0
 */