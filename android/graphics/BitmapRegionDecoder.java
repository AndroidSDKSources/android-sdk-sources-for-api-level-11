/*    */ package android.graphics;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public final class BitmapRegionDecoder
/*    */ {
/*    */   BitmapRegionDecoder()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static BitmapRegionDecoder newInstance(byte[] data, int offset, int length, boolean isShareable) throws IOException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static BitmapRegionDecoder newInstance(FileDescriptor fd, boolean isShareable) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static BitmapRegionDecoder newInstance(InputStream is, boolean isShareable) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static BitmapRegionDecoder newInstance(String pathName, boolean isShareable) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public Bitmap decodeRegion(Rect rect, BitmapFactory.Options options) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getWidth() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getHeight() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void recycle() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final boolean isRecycled() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.BitmapRegionDecoder
 * JD-Core Version:    0.6.0
 */