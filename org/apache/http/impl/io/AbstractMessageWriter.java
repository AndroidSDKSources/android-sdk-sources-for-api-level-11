/*   */ package org.apache.http.impl.io;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpMessage;
/*   */ import org.apache.http.io.HttpMessageWriter;
/*   */ import org.apache.http.io.SessionOutputBuffer;
/*   */ import org.apache.http.message.LineFormatter;
/*   */ import org.apache.http.params.HttpParams;
/*   */ import org.apache.http.util.CharArrayBuffer;
/*   */ 
/*   */ public abstract class AbstractMessageWriter
/*   */   implements HttpMessageWriter
/*   */ {
/*   */   protected final SessionOutputBuffer sessionBuffer;
/*   */   protected final CharArrayBuffer lineBuf;
/*   */   protected final LineFormatter lineFormatter;
/*   */ 
/*   */   public AbstractMessageWriter(SessionOutputBuffer buffer, LineFormatter formatter, HttpParams params)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/*   */   protected abstract void writeHeadLine(HttpMessage paramHttpMessage) throws IOException;
/*   */ 
/* 7 */   public void write(HttpMessage message) throws IOException, HttpException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.AbstractMessageWriter
 * JD-Core Version:    0.6.0
 */