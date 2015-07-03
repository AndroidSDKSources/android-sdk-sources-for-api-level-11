/*    */ package android.util;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ 
/*    */ @Deprecated
/*    */ public class EventLogTags
/*    */ {
/*    */   public EventLogTags()
/*    */     throws IOException
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public EventLogTags(BufferedReader input) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public Description get(String name) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Description get(int tag) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Description
/*    */   {
/*    */     public final int mTag;
/*    */     public final String mName;
/*    */ 
/*    */     Description()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.util.EventLogTags
 * JD-Core Version:    0.6.0
 */