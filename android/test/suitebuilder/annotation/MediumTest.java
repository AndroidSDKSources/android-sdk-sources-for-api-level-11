package android.test.suitebuilder.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
public @interface MediumTest
{
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.suitebuilder.annotation.MediumTest
 * JD-Core Version:    0.6.0
 */