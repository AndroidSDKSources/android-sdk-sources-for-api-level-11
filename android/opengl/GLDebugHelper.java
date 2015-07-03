/*   */ package android.opengl;
/*   */ 
/*   */ import java.io.Writer;
/*   */ import javax.microedition.khronos.egl.EGL;
/*   */ import javax.microedition.khronos.opengles.GL;
/*   */ 
/*   */ public class GLDebugHelper
/*   */ {
/*   */   public static final int CONFIG_CHECK_GL_ERROR = 1;
/*   */   public static final int CONFIG_CHECK_THREAD = 2;
/*   */   public static final int CONFIG_LOG_ARGUMENT_NAMES = 4;
/*   */   public static final int ERROR_WRONG_THREAD = 28672;
/*   */ 
/*   */   public GLDebugHelper()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static GL wrap(GL gl, int configFlags, Writer log) { throw new RuntimeException("Stub!"); } 
/* 6 */   public static EGL wrap(EGL egl, int configFlags, Writer log) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.opengl.GLDebugHelper
 * JD-Core Version:    0.6.0
 */