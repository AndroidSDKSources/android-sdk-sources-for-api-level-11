package android.test;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UiThreadTest
{
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.UiThreadTest
 * JD-Core Version:    0.6.0
 */