/*    */ package java.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.Reader;
/*    */ import java.io.Writer;
/*    */ 
/*    */ public class Properties extends Hashtable<Object, Object>
/*    */ {
/*    */   protected Properties defaults;
/*    */ 
/*    */   public Properties()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Properties(Properties properties) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getProperty(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getProperty(String name, String defaultValue) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void list(PrintStream out) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void list(PrintWriter writer) { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized void load(InputStream in) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized void load(Reader in) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public Enumeration<?> propertyNames() { throw new RuntimeException("Stub!"); } 
/* 14 */   public Set<String> stringPropertyNames() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void save(OutputStream out, String comment) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Object setProperty(String name, String value) { throw new RuntimeException("Stub!"); } 
/* 17 */   public synchronized void store(OutputStream out, String comment) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public synchronized void store(Writer writer, String comment) throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public synchronized void loadFromXML(InputStream in) throws IOException, InvalidPropertiesFormatException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void storeToXML(OutputStream os, String comment) throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public synchronized void storeToXML(OutputStream os, String comment, String encoding) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Properties
 * JD-Core Version:    0.6.0
 */