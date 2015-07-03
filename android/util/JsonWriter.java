/*    */ package android.util;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.Writer;
/*    */ 
/*    */ public final class JsonWriter
/*    */   implements Closeable
/*    */ {
/*    */   public JsonWriter(Writer out)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setIndent(String indent) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isLenient() { throw new RuntimeException("Stub!"); } 
/*  9 */   public JsonWriter beginArray() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public JsonWriter endArray() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public JsonWriter beginObject() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public JsonWriter endObject() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public JsonWriter name(String name) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public JsonWriter value(String value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public JsonWriter nullValue() throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public JsonWriter value(boolean value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public JsonWriter value(double value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public JsonWriter value(long value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public JsonWriter value(Number value) throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void close() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.util.JsonWriter
 * JD-Core Version:    0.6.0
 */