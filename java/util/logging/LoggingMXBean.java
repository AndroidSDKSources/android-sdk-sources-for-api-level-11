package java.util.logging;

import java.util.List;

public abstract interface LoggingMXBean
{
  public abstract String getLoggerLevel(String paramString);

  public abstract List<String> getLoggerNames();

  public abstract String getParentLoggerName(String paramString);

  public abstract void setLoggerLevel(String paramString1, String paramString2);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.logging.LoggingMXBean
 * JD-Core Version:    0.6.0
 */