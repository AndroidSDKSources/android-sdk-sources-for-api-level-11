package dalvik.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface TestTargetClass
{
  public abstract Class<?> value();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     dalvik.annotation.TestTargetClass
 * JD-Core Version:    0.6.0
 */