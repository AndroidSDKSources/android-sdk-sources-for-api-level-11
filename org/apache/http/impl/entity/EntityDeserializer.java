/*   */ package org.apache.http.impl.entity;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import org.apache.http.HttpEntity;
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpMessage;
/*   */ import org.apache.http.entity.BasicHttpEntity;
/*   */ import org.apache.http.entity.ContentLengthStrategy;
/*   */ import org.apache.http.io.SessionInputBuffer;
/*   */ 
/*   */ public class EntityDeserializer
/*   */ {
/*   */   public EntityDeserializer(ContentLengthStrategy lenStrategy)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   protected BasicHttpEntity doDeserialize(SessionInputBuffer inbuffer, HttpMessage message) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 6 */   public HttpEntity deserialize(SessionInputBuffer inbuffer, HttpMessage message) throws HttpException, IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.entity.EntityDeserializer
 * JD-Core Version:    0.6.0
 */