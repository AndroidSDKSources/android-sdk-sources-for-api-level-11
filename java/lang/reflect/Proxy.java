/*   */ package java.lang.reflect;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public class Proxy
/*   */   implements Serializable
/*   */ {
/*   */   protected InvocationHandler h;
/*   */ 
/*   */   protected Proxy(InvocationHandler h)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static Class<?> getProxyClass(ClassLoader loader, Class<?>[] interfaces) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 7 */   public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 8 */   public static boolean isProxyClass(Class<?> cl) { throw new RuntimeException("Stub!"); } 
/* 9 */   public static InvocationHandler getInvocationHandler(Object proxy) throws IllegalArgumentException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.reflect.Proxy
 * JD-Core Version:    0.6.0
 */