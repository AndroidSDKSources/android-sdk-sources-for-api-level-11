/*   */ package javax.microedition.khronos.egl;
/*   */ 
/*   */ import javax.microedition.khronos.opengles.GL;
/*   */ 
/*   */ public abstract class EGLContext
/*   */ {
/*   */   public EGLContext()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static EGL getEGL() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract GL getGL();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.microedition.khronos.egl.EGLContext
 * JD-Core Version:    0.6.0
 */