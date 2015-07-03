package java.lang.reflect;

import java.lang.annotation.Annotation;

public abstract interface AnnotatedElement
{
  public abstract <T extends Annotation> T getAnnotation(Class<T> paramClass);

  public abstract Annotation[] getAnnotations();

  public abstract Annotation[] getDeclaredAnnotations();

  public abstract boolean isAnnotationPresent(Class<? extends Annotation> paramClass);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.reflect.AnnotatedElement
 * JD-Core Version:    0.6.0
 */