/*    */ package org.apache.http.message;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HeaderIterator;
/*    */ 
/*    */ public class BasicHeaderIterator
/*    */   implements HeaderIterator
/*    */ {
/* 12 */   protected final Header[] allHeaders = null;
/*    */   protected int currentIndex;
/*    */   protected String headerName;
/*    */ 
/*    */   public BasicHeaderIterator(Header[] headers, String name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected int findNext(int from) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected boolean filterHeader(int index) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean hasNext() { throw new RuntimeException("Stub!"); } 
/*  9 */   public Header nextHeader() throws NoSuchElementException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final Object next() throws NoSuchElementException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void remove() throws UnsupportedOperationException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicHeaderIterator
 * JD-Core Version:    0.6.0
 */