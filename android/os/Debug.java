/*    */ package android.os;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public final class Debug
/*    */ {
/*    */   public static final int TRACE_COUNT_ALLOCS = 1;
/*    */   public static final int SHOW_FULL_DETAIL = 1;
/*    */   public static final int SHOW_CLASSLOADER = 2;
/*    */   public static final int SHOW_INITIALIZED = 4;
/*    */ 
/*    */   Debug()
/*    */   {
/* 34 */     throw new RuntimeException("Stub!"); } 
/* 35 */   public static void waitForDebugger() { throw new RuntimeException("Stub!"); } 
/* 36 */   public static boolean waitingForDebugger() { throw new RuntimeException("Stub!"); } 
/* 37 */   public static boolean isDebuggerConnected() { throw new RuntimeException("Stub!"); } 
/* 38 */   public static void changeDebugPort(int port) { throw new RuntimeException("Stub!"); } 
/* 39 */   public static void startNativeTracing() { throw new RuntimeException("Stub!"); } 
/* 40 */   public static void stopNativeTracing() { throw new RuntimeException("Stub!"); } 
/* 41 */   public static void enableEmulatorTraceOutput() { throw new RuntimeException("Stub!"); } 
/* 42 */   public static void startMethodTracing() { throw new RuntimeException("Stub!"); } 
/* 43 */   public static void startMethodTracing(String traceName) { throw new RuntimeException("Stub!"); } 
/* 44 */   public static void startMethodTracing(String traceName, int bufferSize) { throw new RuntimeException("Stub!"); } 
/* 45 */   public static void startMethodTracing(String traceName, int bufferSize, int flags) { throw new RuntimeException("Stub!"); } 
/* 46 */   public static void stopMethodTracing() { throw new RuntimeException("Stub!"); } 
/* 47 */   public static long threadCpuTimeNanos() { throw new RuntimeException("Stub!"); } 
/* 48 */   public static void startAllocCounting() { throw new RuntimeException("Stub!"); } 
/* 49 */   public static void stopAllocCounting() { throw new RuntimeException("Stub!"); } 
/* 50 */   public static int getGlobalAllocCount() { throw new RuntimeException("Stub!"); } 
/* 51 */   public static int getGlobalAllocSize() { throw new RuntimeException("Stub!"); } 
/* 52 */   public static int getGlobalFreedCount() { throw new RuntimeException("Stub!"); } 
/* 53 */   public static int getGlobalFreedSize() { throw new RuntimeException("Stub!"); } 
/* 54 */   public static int getGlobalClassInitCount() { throw new RuntimeException("Stub!"); } 
/* 55 */   public static int getGlobalClassInitTime() { throw new RuntimeException("Stub!"); } 
/* 56 */   public static int getGlobalExternalAllocCount() { throw new RuntimeException("Stub!"); } 
/* 57 */   public static int getGlobalExternalAllocSize() { throw new RuntimeException("Stub!"); } 
/* 58 */   public static int getGlobalExternalFreedCount() { throw new RuntimeException("Stub!"); } 
/* 59 */   public static int getGlobalExternalFreedSize() { throw new RuntimeException("Stub!"); } 
/* 60 */   public static int getGlobalGcInvocationCount() { throw new RuntimeException("Stub!"); } 
/* 61 */   public static int getThreadAllocCount() { throw new RuntimeException("Stub!"); } 
/* 62 */   public static int getThreadAllocSize() { throw new RuntimeException("Stub!"); } 
/* 63 */   public static int getThreadExternalAllocCount() { throw new RuntimeException("Stub!"); } 
/* 64 */   public static int getThreadExternalAllocSize() { throw new RuntimeException("Stub!"); } 
/* 65 */   public static int getThreadGcInvocationCount() { throw new RuntimeException("Stub!"); } 
/* 66 */   public static void resetGlobalAllocCount() { throw new RuntimeException("Stub!"); } 
/* 67 */   public static void resetGlobalAllocSize() { throw new RuntimeException("Stub!"); } 
/* 68 */   public static void resetGlobalFreedCount() { throw new RuntimeException("Stub!"); } 
/* 69 */   public static void resetGlobalFreedSize() { throw new RuntimeException("Stub!"); } 
/* 70 */   public static void resetGlobalClassInitCount() { throw new RuntimeException("Stub!"); } 
/* 71 */   public static void resetGlobalClassInitTime() { throw new RuntimeException("Stub!"); } 
/* 72 */   public static void resetGlobalExternalAllocCount() { throw new RuntimeException("Stub!"); } 
/* 73 */   public static void resetGlobalExternalAllocSize() { throw new RuntimeException("Stub!"); } 
/* 74 */   public static void resetGlobalExternalFreedCount() { throw new RuntimeException("Stub!"); } 
/* 75 */   public static void resetGlobalExternalFreedSize() { throw new RuntimeException("Stub!"); } 
/* 76 */   public static void resetGlobalGcInvocationCount() { throw new RuntimeException("Stub!"); } 
/* 77 */   public static void resetThreadAllocCount() { throw new RuntimeException("Stub!"); } 
/* 78 */   public static void resetThreadAllocSize() { throw new RuntimeException("Stub!"); } 
/* 79 */   public static void resetThreadExternalAllocCount() { throw new RuntimeException("Stub!"); } 
/* 80 */   public static void resetThreadExternalAllocSize() { throw new RuntimeException("Stub!"); } 
/* 81 */   public static void resetThreadGcInvocationCount() { throw new RuntimeException("Stub!"); } 
/* 82 */   public static void resetAllCounts() { throw new RuntimeException("Stub!"); } 
/*    */   public static native long getNativeHeapSize();
/*    */ 
/*    */   public static native long getNativeHeapAllocatedSize();
/*    */ 
/*    */   public static native long getNativeHeapFreeSize();
/*    */ 
/*    */   public static native void getMemoryInfo(MemoryInfo paramMemoryInfo);
/*    */ 
/* 87 */   public static int setAllocationLimit(int limit) { throw new RuntimeException("Stub!"); } 
/* 88 */   public static int setGlobalAllocationLimit(int limit) { throw new RuntimeException("Stub!"); } 
/* 89 */   public static void printLoadedClasses(int flags) { throw new RuntimeException("Stub!"); } 
/* 90 */   public static int getLoadedClassCount() { throw new RuntimeException("Stub!"); } 
/* 91 */   public static void dumpHprofData(String fileName) throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public static native int getBinderSentTransactions();
/*    */ 
/*    */   public static native int getBinderReceivedTransactions();
/*    */ 
/*    */   public static final native int getBinderLocalObjectCount();
/*    */ 
/*    */   public static final native int getBinderProxyObjectCount();
/*    */ 
/*    */   public static final native int getBinderDeathObjectCount();
/*    */ 
/* 97 */   public static boolean dumpService(String name, FileDescriptor fd, String[] args) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class InstructionCount
/*    */   {
/*    */     public InstructionCount()
/*    */     {
/* 28 */       throw new RuntimeException("Stub!"); } 
/* 29 */     public boolean resetAndStart() { throw new RuntimeException("Stub!"); } 
/* 30 */     public boolean collect() { throw new RuntimeException("Stub!"); } 
/* 31 */     public int globalTotal() { throw new RuntimeException("Stub!"); } 
/* 32 */     public int globalMethodInvocations() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class MemoryInfo
/*    */     implements Parcelable
/*    */   {
/*    */     public int dalvikPss;
/*    */     public int dalvikPrivateDirty;
/*    */     public int dalvikSharedDirty;
/*    */     public int nativePss;
/*    */     public int nativePrivateDirty;
/*    */     public int nativeSharedDirty;
/*    */     public int otherPss;
/*    */     public int otherPrivateDirty;
/*    */     public int otherSharedDirty;
/* 24 */     public static final Parcelable.Creator<MemoryInfo> CREATOR = null;
/*    */ 
/*    */     public MemoryInfo()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public int getTotalPss() { throw new RuntimeException("Stub!"); } 
/*  9 */     public int getTotalPrivateDirty() { throw new RuntimeException("Stub!"); } 
/* 10 */     public int getTotalSharedDirty() { throw new RuntimeException("Stub!"); } 
/* 11 */     public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 12 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 13 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.Debug
 * JD-Core Version:    0.6.0
 */