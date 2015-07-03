/*    */ package org.apache.http.params;
/*    */ 
/*    */ public abstract class AbstractHttpParams
/*    */   implements HttpParams
/*    */ {
/*    */   protected AbstractHttpParams()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public long getLongParameter(String name, long defaultValue) { throw new RuntimeException("Stub!"); } 
/*  7 */   public HttpParams setLongParameter(String name, long value) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getIntParameter(String name, int defaultValue) { throw new RuntimeException("Stub!"); } 
/*  9 */   public HttpParams setIntParameter(String name, int value) { throw new RuntimeException("Stub!"); } 
/* 10 */   public double getDoubleParameter(String name, double defaultValue) { throw new RuntimeException("Stub!"); } 
/* 11 */   public HttpParams setDoubleParameter(String name, double value) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean getBooleanParameter(String name, boolean defaultValue) { throw new RuntimeException("Stub!"); } 
/* 13 */   public HttpParams setBooleanParameter(String name, boolean value) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean isParameterTrue(String name) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isParameterFalse(String name) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.params.AbstractHttpParams
 * JD-Core Version:    0.6.0
 */