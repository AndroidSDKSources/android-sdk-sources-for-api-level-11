package java.util.prefs;

import java.util.EventListener;

public abstract interface NodeChangeListener extends EventListener
{
  public abstract void childAdded(NodeChangeEvent paramNodeChangeEvent);

  public abstract void childRemoved(NodeChangeEvent paramNodeChangeEvent);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.prefs.NodeChangeListener
 * JD-Core Version:    0.6.0
 */