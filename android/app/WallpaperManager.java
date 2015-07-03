/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class WallpaperManager
/*    */ {
/*    */   public static final String ACTION_LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";
/*    */   public static final String WALLPAPER_PREVIEW_META_DATA = "android.wallpaper.preview";
/*    */   public static final String COMMAND_TAP = "android.wallpaper.tap";
/*    */   public static final String COMMAND_SECONDARY_TAP = "android.wallpaper.secondaryTap";
/*    */   public static final String COMMAND_DROP = "android.home.drop";
/*    */ 
/*    */   WallpaperManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static WallpaperManager getInstance(Context context) { throw new RuntimeException("Stub!"); } 
/*  6 */   public Drawable getDrawable() { throw new RuntimeException("Stub!"); } 
/*  7 */   public Drawable peekDrawable() { throw new RuntimeException("Stub!"); } 
/*  8 */   public Drawable getFastDrawable() { throw new RuntimeException("Stub!"); } 
/*  9 */   public Drawable peekFastDrawable() { throw new RuntimeException("Stub!"); } 
/* 10 */   public WallpaperInfo getWallpaperInfo() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setResource(int resid) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setBitmap(Bitmap bitmap) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setStream(InputStream data) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getDesiredMinimumWidth() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getDesiredMinimumHeight() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void suggestDesiredDimensions(int minimumWidth, int minimumHeight) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setWallpaperOffsets(IBinder windowToken, float xOffset, float yOffset) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setWallpaperOffsetSteps(float xStep, float yStep) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void sendWallpaperCommand(IBinder windowToken, String action, int x, int y, int z, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void clearWallpaperOffsets(IBinder windowToken) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void clear() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.WallpaperManager
 * JD-Core Version:    0.6.0
 */