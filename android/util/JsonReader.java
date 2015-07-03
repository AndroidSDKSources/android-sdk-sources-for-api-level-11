/*    */ package android.util;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.Reader;
/*    */ 
/*    */ public final class JsonReader
/*    */   implements Closeable
/*    */ {
/*    */   public JsonReader(Reader in)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isLenient() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void beginArray() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void endArray() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void beginObject() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void endObject() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean hasNext() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public JsonToken peek() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public String nextName() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public String nextString() throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean nextBoolean() throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void nextNull() throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public double nextDouble() throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public long nextLong() throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public int nextInt() throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void skipValue() throws IOException { throw new RuntimeException("Stub!"); } 
/* 23 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.util.JsonReader
 * JD-Core Version:    0.6.0
 */