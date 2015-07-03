/*    */ package android.util;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class EventLog
/*    */ {
/*    */   public EventLog()
/*    */   {
/* 13 */     throw new RuntimeException("Stub!"); } 
/*    */   public static native int writeEvent(int paramInt1, int paramInt2);
/*    */ 
/*    */   public static native int writeEvent(int paramInt, long paramLong);
/*    */ 
/*    */   public static native int writeEvent(int paramInt, String paramString);
/*    */ 
/*    */   public static native int writeEvent(int paramInt, Object[] paramArrayOfObject);
/*    */ 
/*    */   public static native void readEvents(int[] paramArrayOfInt, Collection<Event> paramCollection) throws IOException;
/*    */ 
/* 19 */   public static String getTagName(int tag) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static int getTagCode(String name) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class Event
/*    */   {
/*    */     Event()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public int getProcessId() { throw new RuntimeException("Stub!"); } 
/*  8 */     public int getThreadId() { throw new RuntimeException("Stub!"); } 
/*  9 */     public long getTimeNanos() { throw new RuntimeException("Stub!"); } 
/* 10 */     public int getTag() { throw new RuntimeException("Stub!"); } 
/* 11 */     public synchronized Object getData() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.util.EventLog
 * JD-Core Version:    0.6.0
 */