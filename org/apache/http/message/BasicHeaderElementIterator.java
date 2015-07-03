/*    */ package org.apache.http.message;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ import org.apache.http.HeaderElement;
/*    */ import org.apache.http.HeaderElementIterator;
/*    */ import org.apache.http.HeaderIterator;
/*    */ 
/*    */ public class BasicHeaderElementIterator
/*    */   implements HeaderElementIterator
/*    */ {
/*    */   public BasicHeaderElementIterator(HeaderIterator headerIterator, HeaderValueParser parser)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public BasicHeaderElementIterator(HeaderIterator headerIterator) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean hasNext() { throw new RuntimeException("Stub!"); } 
/*  8 */   public HeaderElement nextElement() throws NoSuchElementException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Object next() throws NoSuchElementException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void remove() throws UnsupportedOperationException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicHeaderElementIterator
 * JD-Core Version:    0.6.0
 */