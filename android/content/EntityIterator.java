package android.content;

import java.util.Iterator;

public abstract interface EntityIterator extends Iterator<Entity>
{
  public abstract void reset();

  public abstract void close();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.EntityIterator
 * JD-Core Version:    0.6.0
 */