/*    */ package org.apache.http.client.params;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.HttpHost;
/*    */ import org.apache.http.conn.ClientConnectionManagerFactory;
/*    */ import org.apache.http.params.HttpAbstractParamBean;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class ClientParamBean extends HttpAbstractParamBean
/*    */ {
/*    */   public ClientParamBean(HttpParams params)
/*    */   {
/*  5 */     super((HttpParams)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public void setConnectionManagerFactoryClassName(String factory) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setConnectionManagerFactory(ClientConnectionManagerFactory factory) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setHandleRedirects(boolean handle) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setRejectRelativeRedirect(boolean reject) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setMaxRedirects(int maxRedirects) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setAllowCircularRedirects(boolean allow) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setHandleAuthentication(boolean handle) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setCookiePolicy(String policy) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setVirtualHost(HttpHost host) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setDefaultHeaders(Collection<Header> headers) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setDefaultHost(HttpHost host) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.client.params.ClientParamBean
 * JD-Core Version:    0.6.0
 */