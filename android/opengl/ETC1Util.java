/*    */ package android.opengl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.Buffer;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public class ETC1Util
/*    */ {
/*    */   public ETC1Util()
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public static void loadTexture(int target, int level, int border, int fallbackFormat, int fallbackType, InputStream input) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public static void loadTexture(int target, int level, int border, int fallbackFormat, int fallbackType, ETC1Texture texture) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static boolean isETC1Supported() { throw new RuntimeException("Stub!"); } 
/* 15 */   public static ETC1Texture createTexture(InputStream input) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public static ETC1Texture compressTexture(Buffer input, int width, int height, int pixelSize, int stride) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static void writeTexture(ETC1Texture texture, OutputStream output) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class ETC1Texture
/*    */   {
/*    */     public ETC1Texture(int width, int height, ByteBuffer data)
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public int getWidth() { throw new RuntimeException("Stub!"); } 
/*  8 */     public int getHeight() { throw new RuntimeException("Stub!"); } 
/*  9 */     public ByteBuffer getData() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.opengl.ETC1Util
 * JD-Core Version:    0.6.0
 */