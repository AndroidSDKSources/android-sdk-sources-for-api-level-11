package java.lang.annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE})
public @interface Target
{
  public abstract ElementType[] value();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.annotation.Target
 * JD-Core Version:    0.6.0
 */