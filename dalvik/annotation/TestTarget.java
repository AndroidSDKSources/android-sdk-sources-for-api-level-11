package dalvik.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
public @interface TestTarget
{
  public abstract String methodName();

  public abstract String conceptName();

  public abstract Class<?>[] methodArgs();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     dalvik.annotation.TestTarget
 * JD-Core Version:    0.6.0
 */