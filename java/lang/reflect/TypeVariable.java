package java.lang.reflect;

public abstract interface TypeVariable<D extends GenericDeclaration> extends Type
{
  public abstract Type[] getBounds();

  public abstract D getGenericDeclaration();

  public abstract String getName();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.reflect.TypeVariable
 * JD-Core Version:    0.6.0
 */