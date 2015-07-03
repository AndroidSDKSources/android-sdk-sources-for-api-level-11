/*    */ package org.apache.http.message;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.NoSuchElementException;
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HeaderIterator;
/*    */ 
/*    */ public class BasicListHeaderIterator
/*    */   implements HeaderIterator
/*    */ {
/*    */   protected final List allHeaders;
/*    */   protected int currentIndex;
/*    */   protected int lastIndex;
/*    */   protected String headerName;
/*    */ 
/*    */   public BasicListHeaderIterator(List headers, String name)
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
 * Qualified Name:     org.apache.http.message.BasicListHeaderIterator
 * JD-Core Version:    0.6.0
 */