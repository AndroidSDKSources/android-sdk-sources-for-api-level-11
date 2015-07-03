package org.apache.http.impl.conn.tsccm;

import java.lang.ref.Reference;

public abstract interface RefQueueHandler
{
  public abstract void handleReference(Reference<?> paramReference);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.RefQueueHandler
 * JD-Core Version:    0.6.0
 */