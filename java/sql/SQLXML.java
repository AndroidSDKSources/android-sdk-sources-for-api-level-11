package java.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import javax.xml.transform.Result;
import javax.xml.transform.Source;

public abstract interface SQLXML
{
  public abstract void free()
    throws SQLException;

  public abstract InputStream getBinaryStream()
    throws SQLException;

  public abstract OutputStream setBinaryStream()
    throws SQLException;

  public abstract Reader getCharacterStream()
    throws SQLException;

  public abstract Writer setCharacterStream()
    throws SQLException;

  public abstract String getString()
    throws SQLException;

  public abstract void setString(String paramString)
    throws SQLException;

  public abstract <T extends Source> T getSource(Class<T> paramClass)
    throws SQLException;

  public abstract <T extends Result> T setResult(Class<T> paramClass)
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.SQLXML
 * JD-Core Version:    0.6.0
 */