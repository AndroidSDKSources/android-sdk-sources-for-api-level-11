package android.content.res;

import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public abstract interface XmlResourceParser extends XmlPullParser, AttributeSet
{
  public abstract void close();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.res.XmlResourceParser
 * JD-Core Version:    0.6.0
 */