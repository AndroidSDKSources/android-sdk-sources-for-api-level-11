/*    */ package org.apache.http.impl.cookie;
/*    */ 
/*    */ import java.util.Date;
/*    */ import org.apache.http.cookie.ClientCookie;
/*    */ import org.apache.http.cookie.SetCookie;
/*    */ 
/*    */ public class BasicClientCookie
/*    */   implements SetCookie, ClientCookie, Cloneable
/*    */ {
/*    */   public BasicClientCookie(String name, String value)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getValue() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setValue(String value) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getComment() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setComment(String comment) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getCommentURL() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Date getExpiryDate() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setExpiryDate(Date expiryDate) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean isPersistent() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getDomain() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setDomain(String domain) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String getPath() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setPath(String path) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isSecure() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setSecure(boolean secure) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int[] getPorts() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getVersion() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setVersion(int version) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean isExpired(Date date) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setAttribute(String name, String value) { throw new RuntimeException("Stub!"); } 
/* 26 */   public String getAttribute(String name) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean containsAttribute(String name) { throw new RuntimeException("Stub!"); } 
/* 28 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 29 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.BasicClientCookie
 * JD-Core Version:    0.6.0
 */