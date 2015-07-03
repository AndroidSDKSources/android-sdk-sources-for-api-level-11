/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.io.Reader;
/*    */ import java.io.Writer;
/*    */ import java.nio.charset.CharsetDecoder;
/*    */ import java.nio.charset.CharsetEncoder;
/*    */ 
/*    */ public final class Channels
/*    */ {
/*    */   Channels()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static InputStream newInputStream(ReadableByteChannel channel) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static OutputStream newOutputStream(WritableByteChannel channel) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static ReadableByteChannel newChannel(InputStream inputStream) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static WritableByteChannel newChannel(OutputStream outputStream) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static Reader newReader(ReadableByteChannel channel, CharsetDecoder decoder, int minBufferCapacity) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static Reader newReader(ReadableByteChannel channel, String charsetName) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static Writer newWriter(WritableByteChannel channel, CharsetEncoder encoder, int minBufferCapacity) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static Writer newWriter(WritableByteChannel channel, String charsetName) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.Channels
 * JD-Core Version:    0.6.0
 */