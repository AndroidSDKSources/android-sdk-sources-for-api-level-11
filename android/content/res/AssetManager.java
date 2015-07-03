/*    */ package android.content.res;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public final class AssetManager
/*    */ {
/*    */   public static final int ACCESS_UNKNOWN = 0;
/*    */   public static final int ACCESS_RANDOM = 1;
/*    */   public static final int ACCESS_STREAMING = 2;
/*    */   public static final int ACCESS_BUFFER = 3;
/*    */ 
/*    */   AssetManager()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!"); } 
/* 21 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final InputStream open(String fileName) throws IOException { throw new RuntimeException("Stub!"); } 
/* 23 */   public final InputStream open(String fileName, int accessMode) throws IOException { throw new RuntimeException("Stub!"); } 
/* 24 */   public final AssetFileDescriptor openFd(String fileName) throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public final native String[] list(String paramString) throws IOException;
/*    */ 
/* 26 */   public final AssetFileDescriptor openNonAssetFd(String fileName) throws IOException { throw new RuntimeException("Stub!"); } 
/* 27 */   public final AssetFileDescriptor openNonAssetFd(int cookie, String fileName) throws IOException { throw new RuntimeException("Stub!"); } 
/* 28 */   public final XmlResourceParser openXmlResourceParser(String fileName) throws IOException { throw new RuntimeException("Stub!"); } 
/* 29 */   public final XmlResourceParser openXmlResourceParser(int cookie, String fileName) throws IOException { throw new RuntimeException("Stub!"); } 
/* 30 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public final native String[] getLocales();
/*    */ 
/*    */   public final class AssetInputStream extends InputStream
/*    */   {
/*    */     AssetInputStream()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public final int getAssetInt() { throw new RuntimeException("Stub!"); } 
/*  9 */     public final int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */     public final boolean markSupported() { throw new RuntimeException("Stub!"); } 
/* 11 */     public final int available() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */     public final void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */     public final void mark(int readlimit) { throw new RuntimeException("Stub!"); } 
/* 14 */     public final void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */     public final int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */     public final int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */     public final long skip(long n) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.res.AssetManager
 * JD-Core Version:    0.6.0
 */