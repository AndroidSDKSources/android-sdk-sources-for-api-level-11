package java.lang.reflect;

public abstract interface Member
{
  public static final int PUBLIC = 0;
  public static final int DECLARED = 1;

  public abstract Class<?> getDeclaringClass();

  public abstract int getModifiers();

  public abstract String getName();

  public abstract boolean isSynthetic();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.reflect.Member
 * JD-Core Version:    0.6.0
 */