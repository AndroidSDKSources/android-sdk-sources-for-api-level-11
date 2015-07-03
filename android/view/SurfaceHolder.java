/*   */ package android.view;
/*   */ 
/*   */ import android.graphics.Canvas;
/*   */ import android.graphics.Rect;
/*   */ 
/*   */ public abstract interface SurfaceHolder
/*   */ {
/*   */   public static final int SURFACE_TYPE_NORMAL = 0;
/*   */   public static final int SURFACE_TYPE_HARDWARE = 1;
/*   */   public static final int SURFACE_TYPE_GPU = 2;
/*   */   public static final int SURFACE_TYPE_PUSH_BUFFERS = 3;
/*   */ 
/*   */   public abstract void addCallback(Callback paramCallback);
/*   */ 
/*   */   public abstract void removeCallback(Callback paramCallback);
/*   */ 
/*   */   public abstract boolean isCreating();
/*   */ 
/*   */   public abstract void setType(int paramInt);
/*   */ 
/*   */   public abstract void setFixedSize(int paramInt1, int paramInt2);
/*   */ 
/*   */   public abstract void setSizeFromLayout();
/*   */ 
/*   */   public abstract void setFormat(int paramInt);
/*   */ 
/*   */   public abstract void setKeepScreenOn(boolean paramBoolean);
/*   */ 
/*   */   public abstract Canvas lockCanvas();
/*   */ 
/*   */   public abstract Canvas lockCanvas(Rect paramRect);
/*   */ 
/*   */   public abstract void unlockCanvasAndPost(Canvas paramCanvas);
/*   */ 
/*   */   public abstract Rect getSurfaceFrame();
/*   */ 
/*   */   public abstract Surface getSurface();
/*   */ 
/*   */   public static abstract interface Callback2 extends SurfaceHolder.Callback
/*   */   {
/*   */     public abstract void surfaceRedrawNeeded(SurfaceHolder paramSurfaceHolder);
/*   */   }
/*   */ 
/*   */   public static abstract interface Callback
/*   */   {
/*   */     public abstract void surfaceCreated(SurfaceHolder paramSurfaceHolder);
/*   */ 
/*   */     public abstract void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3);
/*   */ 
/*   */     public abstract void surfaceDestroyed(SurfaceHolder paramSurfaceHolder);
/*   */   }
/*   */ 
/*   */   public static class BadSurfaceTypeException extends RuntimeException
/*   */   {
/*   */     public BadSurfaceTypeException()
/*   */     {
/* 7 */       throw new RuntimeException("Stub!"); } 
/* 8 */     public BadSurfaceTypeException(String name) { throw new RuntimeException("Stub!");
/*   */     }
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.SurfaceHolder
 * JD-Core Version:    0.6.0
 */