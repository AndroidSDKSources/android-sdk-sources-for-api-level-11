/*   */ package org.apache.http.impl;
/*   */ 
/*   */ import java.util.Locale;
/*   */ import org.apache.http.ReasonPhraseCatalog;
/*   */ 
/*   */ public class EnglishReasonPhraseCatalog
/*   */   implements ReasonPhraseCatalog
/*   */ {
/* 8 */   public static final EnglishReasonPhraseCatalog INSTANCE = null;
/*   */ 
/*   */   protected EnglishReasonPhraseCatalog()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public String getReason(int status, Locale loc) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.EnglishReasonPhraseCatalog
 * JD-Core Version:    0.6.0
 */