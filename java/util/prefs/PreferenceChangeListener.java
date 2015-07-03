package java.util.prefs;

import java.util.EventListener;

public abstract interface PreferenceChangeListener extends EventListener
{
  public abstract void preferenceChange(PreferenceChangeEvent paramPreferenceChangeEvent);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.prefs.PreferenceChangeListener
 * JD-Core Version:    0.6.0
 */