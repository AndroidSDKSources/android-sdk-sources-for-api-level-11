/*   */ package java.security;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public final class SignedObject
/*   */   implements Serializable
/*   */ {
/*   */   public SignedObject(Serializable object, PrivateKey signingKey, Signature signingEngine)
/*   */     throws IOException, InvalidKeyException, SignatureException
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public Object getObject() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 7 */   public byte[] getSignature() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 9 */   public boolean verify(PublicKey verificationKey, Signature verificationEngine) throws InvalidKeyException, SignatureException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.SignedObject
 * JD-Core Version:    0.6.0
 */