package java.lang;

import java.io.IOException;
import java.nio.CharBuffer;

public abstract interface Readable
{
  public abstract int read(CharBuffer paramCharBuffer)
    throws IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Readable
 * JD-Core Version:    0.6.0
 */