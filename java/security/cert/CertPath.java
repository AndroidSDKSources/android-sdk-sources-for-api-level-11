/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.ObjectStreamException;
/*    */ import java.io.Serializable;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class CertPath
/*    */   implements Serializable
/*    */ {
/*    */   protected CertPath(String type)
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public String getType() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract List<? extends Certificate> getCertificates();
/*    */ 
/*    */   public abstract byte[] getEncoded() throws CertificateEncodingException;
/*    */ 
/*    */   public abstract byte[] getEncoded(String paramString) throws CertificateEncodingException;
/*    */ 
/*    */   public abstract Iterator<String> getEncodings();
/*    */ 
/* 20 */   protected Object writeReplace() throws ObjectStreamException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   protected static class CertPathRep
/*    */     implements Serializable
/*    */   {
/*    */     protected CertPathRep(String type, byte[] data)
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     protected Object readResolve() throws ObjectStreamException { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertPath
 * JD-Core Version:    0.6.0
 */