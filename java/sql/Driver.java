package java.sql;

import java.util.Properties;

public abstract interface Driver
{
  public abstract boolean acceptsURL(String paramString)
    throws SQLException;

  public abstract Connection connect(String paramString, Properties paramProperties)
    throws SQLException;

  public abstract int getMajorVersion();

  public abstract int getMinorVersion();

  public abstract DriverPropertyInfo[] getPropertyInfo(String paramString, Properties paramProperties)
    throws SQLException;

  public abstract boolean jdbcCompliant();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.Driver
 * JD-Core Version:    0.6.0
 */