/*    */ package android.service.wallpaper;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.SurfaceHolder;
/*    */ 
/*    */ public abstract class WallpaperService extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.wallpaper.WallpaperService";
/*    */   public static final String SERVICE_META_DATA = "android.service.wallpaper";
/*    */ 
/*    */   public WallpaperService()
/*    */   {
/* 26 */     throw new RuntimeException("Stub!"); } 
/* 27 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 29 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract Engine onCreateEngine();
/*    */ 
/*    */   public class Engine
/*    */   {
/*    */     public Engine()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public SurfaceHolder getSurfaceHolder() { throw new RuntimeException("Stub!"); } 
/*  9 */     public int getDesiredMinimumWidth() { throw new RuntimeException("Stub!"); } 
/* 10 */     public int getDesiredMinimumHeight() { throw new RuntimeException("Stub!"); } 
/* 11 */     public boolean isVisible() { throw new RuntimeException("Stub!"); } 
/* 12 */     public boolean isPreview() { throw new RuntimeException("Stub!"); } 
/* 13 */     public void setTouchEventsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 14 */     public void onCreate(SurfaceHolder surfaceHolder) { throw new RuntimeException("Stub!"); } 
/* 15 */     public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 16 */     public void onVisibilityChanged(boolean visible) { throw new RuntimeException("Stub!"); } 
/* 17 */     public void onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 18 */     public void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep, int xPixelOffset, int yPixelOffset) { throw new RuntimeException("Stub!"); } 
/* 19 */     public Bundle onCommand(String action, int x, int y, int z, Bundle extras, boolean resultRequested) { throw new RuntimeException("Stub!"); } 
/* 20 */     public void onDesiredSizeChanged(int desiredWidth, int desiredHeight) { throw new RuntimeException("Stub!"); } 
/* 21 */     public void onSurfaceChanged(SurfaceHolder holder, int format, int width, int height) { throw new RuntimeException("Stub!"); } 
/* 22 */     public void onSurfaceRedrawNeeded(SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/* 23 */     public void onSurfaceCreated(SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/* 24 */     public void onSurfaceDestroyed(SurfaceHolder holder) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.service.wallpaper.WallpaperService
 * JD-Core Version:    0.6.0
 */