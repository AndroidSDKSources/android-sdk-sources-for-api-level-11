package org.w3c.dom;

public abstract interface UserDataHandler
{
  public static final short NODE_CLONED = 1;
  public static final short NODE_IMPORTED = 2;
  public static final short NODE_DELETED = 3;
  public static final short NODE_RENAMED = 4;
  public static final short NODE_ADOPTED = 5;

  public abstract void handle(short paramShort, String paramString, Object paramObject, Node paramNode1, Node paramNode2);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.w3c.dom.UserDataHandler
 * JD-Core Version:    0.6.0
 */