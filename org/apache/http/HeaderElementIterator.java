package org.apache.http;

import java.util.Iterator;

public abstract interface HeaderElementIterator extends Iterator
{
  public abstract boolean hasNext();

  public abstract HeaderElement nextElement();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.HeaderElementIterator
 * JD-Core Version:    0.6.0
 */