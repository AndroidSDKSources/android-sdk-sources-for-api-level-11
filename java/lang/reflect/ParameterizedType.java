package java.lang.reflect;

public abstract interface ParameterizedType extends Type
{
  public abstract Type[] getActualTypeArguments();

  public abstract Type getOwnerType();

  public abstract Type getRawType();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.reflect.ParameterizedType
 * JD-Core Version:    0.6.0
 */