/*    */ package java.security;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public abstract class SignatureSpi
/*    */ {
/*    */   protected SecureRandom appRandom;
/*    */ 
/*    */   public SignatureSpi()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException;
/*    */ 
/*    */   protected abstract void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException;
/*    */ 
/*  7 */   protected void engineInitSign(PrivateKey privateKey, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void engineUpdate(byte paramByte) throws SignatureException;
/*    */ 
/*    */   protected abstract void engineUpdate(byte[] paramArrayOfByte, int paramInt1, int paramInt2) throws SignatureException;
/*    */ 
/* 10 */   protected void engineUpdate(ByteBuffer input) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract byte[] engineSign() throws SignatureException;
/*    */ 
/* 12 */   protected int engineSign(byte[] outbuf, int offset, int len) throws SignatureException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract boolean engineVerify(byte[] paramArrayOfByte) throws SignatureException;
/*    */ 
/* 14 */   protected boolean engineVerify(byte[] sigBytes, int offset, int length) throws SignatureException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void engineSetParameter(String paramString, Object paramObject) throws InvalidParameterException;
/*    */ 
/* 16 */   protected void engineSetParameter(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 17 */   protected AlgorithmParameters engineGetParameters() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract Object engineGetParameter(String paramString) throws InvalidParameterException;
/*    */ 
/* 19 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.SignatureSpi
 * JD-Core Version:    0.6.0
 */