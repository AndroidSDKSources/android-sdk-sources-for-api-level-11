package org.apache.http;

import java.util.Iterator;

public abstract interface HeaderIterator extends Iterator
{
  public abstract boolean hasNext();

  public abstract Header nextHeader();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.HeaderIterator
 * JD-Core Version:    0.6.0
 */