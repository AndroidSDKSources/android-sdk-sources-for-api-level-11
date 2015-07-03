package javax.xml.transform;

public abstract interface Result
{
  public static final String PI_DISABLE_OUTPUT_ESCAPING = "javax.xml.transform.disable-output-escaping";
  public static final String PI_ENABLE_OUTPUT_ESCAPING = "javax.xml.transform.enable-output-escaping";

  public abstract void setSystemId(String paramString);

  public abstract String getSystemId();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.Result
 * JD-Core Version:    0.6.0
 */