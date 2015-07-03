/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.net.URL;
/*    */ import java.security.cert.Certificate;
/*    */ 
/*    */ public class CodeSource
/*    */   implements Serializable
/*    */ {
/*    */   public CodeSource(URL location, Certificate[] certs)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public CodeSource(URL location, CodeSigner[] signers) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final Certificate[] getCertificates() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final CodeSigner[] getCodeSigners() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final URL getLocation() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean implies(CodeSource cs) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.CodeSource
 * JD-Core Version:    0.6.0
 */