/*   */ package java.lang;
/*   */ 
/*   */ import java.io.InputStream;
/*   */ import java.io.OutputStream;
/*   */ 
/*   */ public abstract class Process
/*   */ {
/*   */   public Process()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void destroy();
/*   */ 
/*   */   public abstract int exitValue();
/*   */ 
/*   */   public abstract InputStream getErrorStream();
/*   */ 
/*   */   public abstract InputStream getInputStream();
/*   */ 
/*   */   public abstract OutputStream getOutputStream();
/*   */ 
/*   */   public abstract int waitFor()
/*   */     throws InterruptedException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Process
 * JD-Core Version:    0.6.0
 */