/*    */ package android.graphics;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.util.TypedValue;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class BitmapFactory
/*    */ {
/*    */   public BitmapFactory()
/*    */   {
/* 27 */     throw new RuntimeException("Stub!"); } 
/* 28 */   public static Bitmap decodeFile(String pathName, Options opts) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static Bitmap decodeFile(String pathName) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static Bitmap decodeResourceStream(Resources res, TypedValue value, InputStream is, Rect pad, Options opts) { throw new RuntimeException("Stub!"); } 
/* 31 */   public static Bitmap decodeResource(Resources res, int id, Options opts) { throw new RuntimeException("Stub!"); } 
/* 32 */   public static Bitmap decodeResource(Resources res, int id) { throw new RuntimeException("Stub!"); } 
/* 33 */   public static Bitmap decodeByteArray(byte[] data, int offset, int length, Options opts) { throw new RuntimeException("Stub!"); } 
/* 34 */   public static Bitmap decodeByteArray(byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); } 
/* 35 */   public static Bitmap decodeStream(InputStream is, Rect outPadding, Options opts) { throw new RuntimeException("Stub!"); } 
/* 36 */   public static Bitmap decodeStream(InputStream is) { throw new RuntimeException("Stub!"); } 
/* 37 */   public static Bitmap decodeFileDescriptor(FileDescriptor fd, Rect outPadding, Options opts) { throw new RuntimeException("Stub!"); } 
/* 38 */   public static Bitmap decodeFileDescriptor(FileDescriptor fd) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Options
/*    */   {
/*    */     public Bitmap inBitmap;
/*    */     public boolean inMutable;
/*    */     public boolean inJustDecodeBounds;
/*    */     public int inSampleSize;
/*    */     public Bitmap.Config inPreferredConfig;
/*    */     public boolean inDither;
/*    */     public int inDensity;
/*    */     public int inTargetDensity;
/*    */     public int inScreenDensity;
/*    */     public boolean inScaled;
/*    */     public boolean inPurgeable;
/*    */     public boolean inInputShareable;
/*    */     public boolean inPreferQualityOverSpeed;
/*    */     public int outWidth;
/*    */     public int outHeight;
/*    */     public String outMimeType;
/* 24 */     public byte[] inTempStorage = null;
/*    */     public boolean mCancel;
/*    */ 
/*    */     public Options()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public void requestCancelDecode() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.BitmapFactory
 * JD-Core Version:    0.6.0
 */