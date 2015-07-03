/*   */ package java.util.logging;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ import java.security.BasicPermission;
/*   */ import java.security.Guard;
/*   */ 
/*   */ public final class LoggingPermission extends BasicPermission
/*   */   implements Guard, Serializable
/*   */ {
/*   */   public LoggingPermission(String name, String actions)
/*   */   {
/* 6 */     super((String)null, (String)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.logging.LoggingPermission
 * JD-Core Version:    0.6.0
 */