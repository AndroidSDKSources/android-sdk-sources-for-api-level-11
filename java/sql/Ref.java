package java.sql;

import java.util.Map;

public abstract interface Ref
{
  public abstract String getBaseTypeName()
    throws SQLException;

  public abstract Object getObject()
    throws SQLException;

  public abstract Object getObject(Map<String, Class<?>> paramMap)
    throws SQLException;

  public abstract void setObject(Object paramObject)
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.Ref
 * JD-Core Version:    0.6.0
 */