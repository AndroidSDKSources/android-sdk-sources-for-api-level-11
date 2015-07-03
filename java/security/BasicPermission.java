/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class BasicPermission extends Permission
/*    */   implements Serializable
/*    */ {
/*    */   public BasicPermission(String name)
/*    */   {
/*  6 */     super((String)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public BasicPermission(String name, String action) { super((String)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getActions() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean implies(Permission permission) { throw new RuntimeException("Stub!"); } 
/* 12 */   public PermissionCollection newPermissionCollection() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.BasicPermission
 * JD-Core Version:    0.6.0
 */