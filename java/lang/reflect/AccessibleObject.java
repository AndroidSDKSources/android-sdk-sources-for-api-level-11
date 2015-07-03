/*    */ package java.lang.reflect;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ 
/*    */ public class AccessibleObject
/*    */   implements AnnotatedElement
/*    */ {
/*    */   protected AccessibleObject()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static void setAccessible(AccessibleObject[] objects, boolean flag) throws SecurityException { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isAccessible() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setAccessible(boolean flag) throws SecurityException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Annotation[] getDeclaredAnnotations() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); } 
/* 12 */   public <T extends Annotation> T getAnnotation(Class<T> annotationType) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.reflect.AccessibleObject
 * JD-Core Version:    0.6.0
 */