/*   */ package org.apache.http.impl.entity;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.OutputStream;
/*   */ import org.apache.http.HttpEntity;
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpMessage;
/*   */ import org.apache.http.entity.ContentLengthStrategy;
/*   */ import org.apache.http.io.SessionOutputBuffer;
/*   */ 
/*   */ public class EntitySerializer
/*   */ {
/*   */   public EntitySerializer(ContentLengthStrategy lenStrategy)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   protected OutputStream doSerialize(SessionOutputBuffer outbuffer, HttpMessage message) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 6 */   public void serialize(SessionOutputBuffer outbuffer, HttpMessage message, HttpEntity entity) throws HttpException, IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.entity.EntitySerializer
 * JD-Core Version:    0.6.0
 */