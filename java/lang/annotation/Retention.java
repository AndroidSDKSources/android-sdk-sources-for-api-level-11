package java.lang.annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE})
public @interface Retention
{
  public abstract RetentionPolicy value();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.annotation.Retention
 * JD-Core Version:    0.6.0
 */