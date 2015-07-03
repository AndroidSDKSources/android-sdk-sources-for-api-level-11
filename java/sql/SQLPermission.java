/*   */ package java.sql;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ import java.security.BasicPermission;
/*   */ import java.security.Guard;
/*   */ 
/*   */ public final class SQLPermission extends BasicPermission
/*   */   implements Guard, Serializable
/*   */ {
/*   */   public SQLPermission(String name)
/*   */   {
/* 6 */     super((String)null, (String)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public SQLPermission(String name, String actions) { super((String)null, (String)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.SQLPermission
 * JD-Core Version:    0.6.0
 */