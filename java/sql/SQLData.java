package java.sql;

public abstract interface SQLData
{
  public abstract String getSQLTypeName()
    throws SQLException;

  public abstract void readSQL(SQLInput paramSQLInput, String paramString)
    throws SQLException;

  public abstract void writeSQL(SQLOutput paramSQLOutput)
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.SQLData
 * JD-Core Version:    0.6.0
 */