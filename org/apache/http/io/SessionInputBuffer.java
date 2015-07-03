package org.apache.http.io;

import java.io.IOException;
import org.apache.http.util.CharArrayBuffer;

public abstract interface SessionInputBuffer
{
  public abstract int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;

  public abstract int read(byte[] paramArrayOfByte)
    throws IOException;

  public abstract int read()
    throws IOException;

  public abstract int readLine(CharArrayBuffer paramCharArrayBuffer)
    throws IOException;

  public abstract String readLine()
    throws IOException;

  public abstract boolean isDataAvailable(int paramInt)
    throws IOException;

  public abstract HttpTransportMetrics getMetrics();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.io.SessionInputBuffer
 * JD-Core Version:    0.6.0
 */