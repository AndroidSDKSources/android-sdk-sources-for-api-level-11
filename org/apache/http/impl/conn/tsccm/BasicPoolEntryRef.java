/*   */ package org.apache.http.impl.conn.tsccm;
/*   */ 
/*   */ import java.lang.ref.ReferenceQueue;
/*   */ import java.lang.ref.WeakReference;
/*   */ import org.apache.http.conn.routing.HttpRoute;
/*   */ 
/*   */ public class BasicPoolEntryRef extends WeakReference<BasicPoolEntry>
/*   */ {
/*   */   public BasicPoolEntryRef(BasicPoolEntry entry, ReferenceQueue<Object> queue)
/*   */   {
/* 5 */     super(null, (ReferenceQueue)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public final HttpRoute getRoute() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.BasicPoolEntryRef
 * JD-Core Version:    0.6.0
 */