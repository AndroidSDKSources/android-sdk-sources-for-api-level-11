/*   */ package java.security;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public class GuardedObject
/*   */   implements Serializable
/*   */ {
/*   */   public GuardedObject(Object object, Guard guard)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public Object getObject() throws SecurityException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.GuardedObject
 * JD-Core Version:    0.6.0
 */