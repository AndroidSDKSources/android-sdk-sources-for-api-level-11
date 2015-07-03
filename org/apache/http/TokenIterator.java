package org.apache.http;

import java.util.Iterator;

public abstract interface TokenIterator extends Iterator
{
  public abstract boolean hasNext();

  public abstract String nextToken();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.TokenIterator
 * JD-Core Version:    0.6.0
 */