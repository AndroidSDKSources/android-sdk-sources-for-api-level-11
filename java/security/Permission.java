/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class Permission
/*    */   implements Guard, Serializable
/*    */ {
/*    */   public Permission(String name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean equals(Object paramObject);
/*    */ 
/*    */   public abstract int hashCode();
/*    */ 
/*    */   public abstract String getActions();
/*    */ 
/*    */   public abstract boolean implies(Permission paramPermission);
/*    */ 
/* 10 */   public final String getName() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void checkGuard(Object obj) throws SecurityException { throw new RuntimeException("Stub!"); } 
/* 12 */   public PermissionCollection newPermissionCollection() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.Permission
 * JD-Core Version:    0.6.0
 */