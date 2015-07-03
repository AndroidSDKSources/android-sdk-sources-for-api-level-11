package java.lang.annotation;

public abstract interface Annotation
{
  public abstract Class<? extends Annotation> annotationType();

  public abstract boolean equals(Object paramObject);

  public abstract int hashCode();

  public abstract String toString();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.annotation.Annotation
 * JD-Core Version:    0.6.0
 */