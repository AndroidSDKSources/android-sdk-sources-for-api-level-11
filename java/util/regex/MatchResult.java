package java.util.regex;

public abstract interface MatchResult
{
  public abstract int end();

  public abstract int end(int paramInt);

  public abstract String group();

  public abstract String group(int paramInt);

  public abstract int groupCount();

  public abstract int start();

  public abstract int start(int paramInt);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.regex.MatchResult
 * JD-Core Version:    0.6.0
 */