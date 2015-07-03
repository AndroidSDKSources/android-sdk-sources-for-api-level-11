package junit.runner;

public abstract interface TestSuiteLoader
{
  public abstract Class load(String paramString)
    throws ClassNotFoundException;

  public abstract Class reload(Class paramClass)
    throws ClassNotFoundException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     junit.runner.TestSuiteLoader
 * JD-Core Version:    0.6.0
 */