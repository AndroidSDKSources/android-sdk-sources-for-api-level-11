/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.security.cert.Certificate;
/*    */ 
/*    */ public final class UnresolvedPermission extends Permission
/*    */   implements Serializable
/*    */ {
/*    */   public UnresolvedPermission(String type, String name, String actions, Certificate[] certs)
/*    */   {
/*  6 */     super((String)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getActions() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getUnresolvedName() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getUnresolvedActions() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getUnresolvedType() { throw new RuntimeException("Stub!"); } 
/* 13 */   public Certificate[] getUnresolvedCerts() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean implies(Permission permission) { throw new RuntimeException("Stub!"); } 
/* 15 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 16 */   public PermissionCollection newPermissionCollection() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.UnresolvedPermission
 * JD-Core Version:    0.6.0
 */