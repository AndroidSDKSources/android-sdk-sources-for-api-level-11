/*   */ package org.apache.http.impl.entity;
/*   */ 
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpMessage;
/*   */ import org.apache.http.entity.ContentLengthStrategy;
/*   */ 
/*   */ public class StrictContentLengthStrategy
/*   */   implements ContentLengthStrategy
/*   */ {
/*   */   public StrictContentLengthStrategy()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public long determineLength(HttpMessage message) throws HttpException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.entity.StrictContentLengthStrategy
 * JD-Core Version:    0.6.0
 */