/*    */ package android.renderscript;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.SurfaceHolder;
/*    */ 
/*    */ public class RenderScriptGL extends RenderScript
/*    */ {
/*    */   public RenderScriptGL(Context ctx, SurfaceConfig sc)
/*    */   {
/* 14 */     throw new RuntimeException("Stub!"); } 
/* 15 */   public void setSurface(SurfaceHolder sur, int w, int h) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getHeight() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getWidth() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void pause() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void resume() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void bindRootScript(Script s) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void bindProgramStore(ProgramStore p) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void bindProgramFragment(ProgramFragment p) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void bindProgramRaster(ProgramRaster p) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void bindProgramVertex(ProgramVertex p) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class SurfaceConfig
/*    */   {
/*    */     public SurfaceConfig()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public SurfaceConfig(SurfaceConfig sc) { throw new RuntimeException("Stub!"); } 
/*  9 */     public void setColor(int minimum, int preferred) { throw new RuntimeException("Stub!"); } 
/* 10 */     public void setAlpha(int minimum, int preferred) { throw new RuntimeException("Stub!"); } 
/* 11 */     public void setDepth(int minimum, int preferred) { throw new RuntimeException("Stub!"); } 
/* 12 */     public void setSamples(int minimum, int preferred, float Q) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.RenderScriptGL
 * JD-Core Version:    0.6.0
 */