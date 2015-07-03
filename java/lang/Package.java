/*    */ package java.lang;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.AnnotatedElement;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class Package
/*    */   implements AnnotatedElement
/*    */ {
/*    */   Package()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public <A extends Annotation> A getAnnotation(Class<A> annotationType) { throw new RuntimeException("Stub!"); } 
/*  7 */   public Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); } 
/*  8 */   public Annotation[] getDeclaredAnnotations() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getImplementationTitle() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getImplementationVendor() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getImplementationVersion() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 14 */   public static Package getPackage(String packageName) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static Package[] getPackages() { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getSpecificationTitle() { throw new RuntimeException("Stub!"); } 
/* 17 */   public String getSpecificationVendor() { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getSpecificationVersion() { throw new RuntimeException("Stub!"); } 
/* 19 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isCompatibleWith(String version) throws NumberFormatException { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isSealed() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isSealed(URL url) { throw new RuntimeException("Stub!"); } 
/* 23 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Package
 * JD-Core Version:    0.6.0
 */