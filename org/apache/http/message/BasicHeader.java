/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HeaderElement;
/*    */ import org.apache.http.ParseException;
/*    */ 
/*    */ public class BasicHeader
/*    */   implements Header, Cloneable
/*    */ {
/*    */   public BasicHeader(String name, String value)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getValue() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  9 */   public HeaderElement[] getElements() throws ParseException { throw new RuntimeException("Stub!"); } 
/* 10 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicHeader
 * JD-Core Version:    0.6.0
 */