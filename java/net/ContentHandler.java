/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ 
/*   */ public abstract class ContentHandler
/*   */ {
/*   */   public ContentHandler()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract Object getContent(URLConnection paramURLConnection) throws IOException;
/*   */ 
/* 6 */   public Object getContent(URLConnection uConn, Class[] types) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.ContentHandler
 * JD-Core Version:    0.6.0
 */