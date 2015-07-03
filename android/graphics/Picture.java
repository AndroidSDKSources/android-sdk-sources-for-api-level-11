/*    */ package android.graphics;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class Picture
/*    */ {
/*    */   public Picture()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Picture(Picture src) { throw new RuntimeException("Stub!"); } 
/*  6 */   public Canvas beginRecording(int width, int height) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void endRecording() { throw new RuntimeException("Stub!"); } 
/*    */   public native int getWidth();
/*    */ 
/*    */   public native int getHeight();
/*    */ 
/* 10 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static Picture createFromStream(InputStream stream) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeToStream(OutputStream stream) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.Picture
 * JD-Core Version:    0.6.0
 */