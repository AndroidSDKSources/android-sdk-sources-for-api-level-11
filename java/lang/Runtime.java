/*    */ package java.lang;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class Runtime
/*    */ {
/*    */   Runtime()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Process exec(String[] progArray) throws IOException { throw new RuntimeException("Stub!"); } 
/*  6 */   public Process exec(String[] progArray, String[] envp) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public Process exec(String[] progArray, String[] envp, File directory) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public Process exec(String prog) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public Process exec(String prog, String[] envp) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public Process exec(String prog, String[] envp, File directory) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void exit(int code) { throw new RuntimeException("Stub!"); } 
/*    */   public native long freeMemory();
/*    */ 
/*    */   public native void gc();
/*    */ 
/* 14 */   public static Runtime getRuntime() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void load(String pathName) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void loadLibrary(String libName) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void runFinalization() { throw new RuntimeException("Stub!"); } 
/* 18 */   public static void runFinalizersOnExit(boolean run) { throw new RuntimeException("Stub!"); } 
/*    */   public native long totalMemory();
/*    */ 
/* 20 */   public void traceInstructions(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void traceMethodCalls(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 22 */   public InputStream getLocalizedInputStream(InputStream stream) { throw new RuntimeException("Stub!"); } 
/* 23 */   public OutputStream getLocalizedOutputStream(OutputStream stream) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void addShutdownHook(Thread hook) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean removeShutdownHook(Thread hook) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void halt(int code) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public native int availableProcessors();
/*    */ 
/*    */   public native long maxMemory();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Runtime
 * JD-Core Version:    0.6.0
 */