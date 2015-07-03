/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.Region;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class Surface
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int HIDDEN = 4;
/*    */   public static final int HARDWARE = 16;
/*    */   public static final int GPU = 40;
/*    */   public static final int SECURE = 128;
/*    */   public static final int NON_PREMULTIPLIED = 256;
/*    */   public static final int PUSH_BUFFERS = 512;
/*    */   public static final int FX_SURFACE_NORMAL = 0;
/*    */   public static final int FX_SURFACE_BLUR = 65536;
/*    */   public static final int FX_SURFACE_DIM = 131072;
/*    */   public static final int FX_SURFACE_MASK = 983040;
/*    */   public static final int SURFACE_HIDDEN = 1;
/*    */   public static final int SURFACE_FROZEN = 2;
/*    */   public static final int SURACE_FROZEN = 2;
/*    */   public static final int SURFACE_DITHER = 4;
/*    */   public static final int SURFACE_BLUR_FREEZE = 16;
/*    */   public static final int ROTATION_0 = 0;
/*    */   public static final int ROTATION_90 = 1;
/*    */   public static final int ROTATION_180 = 2;
/*    */   public static final int ROTATION_270 = 3;
/* 54 */   public static final Parcelable.Creator<Surface> CREATOR = null;
/*    */ 
/*    */   Surface()
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/*    */   public native boolean isValid();
/*    */ 
/* 13 */   public Canvas lockCanvas(Rect dirty) throws Surface.OutOfResourcesException, IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/*    */   public native void unlockCanvasAndPost(Canvas paramCanvas);
/*    */ 
/*    */   public native void unlockCanvas(Canvas paramCanvas);
/*    */ 
/* 16 */   public static void setOrientation(int display, int orientation) { throw new RuntimeException("Stub!"); } 
/*    */   public native void setLayer(int paramInt);
/*    */ 
/*    */   public native void setPosition(int paramInt1, int paramInt2);
/*    */ 
/*    */   public native void setSize(int paramInt1, int paramInt2);
/*    */ 
/*    */   public native void hide();
/*    */ 
/*    */   public native void show();
/*    */ 
/*    */   public native void setTransparentRegionHint(Region paramRegion);
/*    */ 
/*    */   public native void setAlpha(float paramFloat);
/*    */ 
/*    */   public native void setMatrix(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*    */ 
/*    */   public native void freeze();
/*    */ 
/*    */   public native void unfreeze();
/*    */ 
/*    */   public native void setFreezeTint(int paramInt);
/*    */ 
/*    */   public native void setFlags(int paramInt1, int paramInt2);
/*    */ 
/* 29 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/*    */   public native void readFromParcel(Parcel paramParcel);
/*    */ 
/*    */   public native void writeToParcel(Parcel paramParcel, int paramInt);
/*    */ 
/* 33 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class OutOfResourcesException extends Exception
/*    */   {
/*    */     public OutOfResourcesException()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public OutOfResourcesException(String name) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.Surface
 * JD-Core Version:    0.6.0
 */