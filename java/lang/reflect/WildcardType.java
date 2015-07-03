package java.lang.reflect;

public abstract interface WildcardType extends Type
{
  public abstract Type[] getUpperBounds();

  public abstract Type[] getLowerBounds();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.reflect.WildcardType
 * JD-Core Version:    0.6.0
 */