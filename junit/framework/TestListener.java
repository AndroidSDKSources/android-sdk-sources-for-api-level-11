package junit.framework;

public abstract interface TestListener
{
  public abstract void addError(Test paramTest, Throwable paramThrowable);

  public abstract void addFailure(Test paramTest, AssertionFailedError paramAssertionFailedError);

  public abstract void endTest(Test paramTest);

  public abstract void startTest(Test paramTest);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     junit.framework.TestListener
 * JD-Core Version:    0.6.0
 */