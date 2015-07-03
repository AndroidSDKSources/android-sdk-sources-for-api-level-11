package android.nfc.tech;

import android.nfc.Tag;
import java.io.Closeable;
import java.io.IOException;

public abstract interface TagTechnology extends Closeable
{
  public abstract Tag getTag();

  public abstract void connect()
    throws IOException;

  public abstract void close()
    throws IOException;

  public abstract boolean isConnected();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.nfc.tech.TagTechnology
 * JD-Core Version:    0.6.0
 */