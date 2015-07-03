/*    */ package android.webkit;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class WebBackForwardList
/*    */   implements Cloneable, Serializable
/*    */ {
/*    */   WebBackForwardList()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public synchronized WebHistoryItem getCurrentItem() { throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized int getCurrentIndex() { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized WebHistoryItem getItemAtIndex(int index) { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized int getSize() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected synchronized WebBackForwardList clone() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.webkit.WebBackForwardList
 * JD-Core Version:    0.6.0
 */