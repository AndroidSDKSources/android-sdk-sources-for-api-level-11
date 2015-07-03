/*    */ package java.security;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.cert.Certificate;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public abstract class Signature extends SignatureSpi
/*    */ {
/*    */   protected static final int UNINITIALIZED = 0;
/*    */   protected static final int SIGN = 2;
/*    */   protected static final int VERIFY = 3;
/*    */   protected int state;
/*    */ 
/*    */   protected Signature(String algorithm)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static Signature getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static Signature getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static Signature getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void initVerify(PublicKey publicKey) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void initVerify(Certificate certificate) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final void initSign(PrivateKey privateKey) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 14 */   public final void initSign(PrivateKey privateKey, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 15 */   public final byte[] sign() throws SignatureException { throw new RuntimeException("Stub!"); } 
/* 16 */   public final int sign(byte[] outbuf, int offset, int len) throws SignatureException { throw new RuntimeException("Stub!"); } 
/* 17 */   public final boolean verify(byte[] signature) throws SignatureException { throw new RuntimeException("Stub!"); } 
/* 18 */   public final boolean verify(byte[] signature, int offset, int length) throws SignatureException { throw new RuntimeException("Stub!"); } 
/* 19 */   public final void update(byte b) throws SignatureException { throw new RuntimeException("Stub!"); } 
/* 20 */   public final void update(byte[] data) throws SignatureException { throw new RuntimeException("Stub!"); } 
/* 21 */   public final void update(byte[] data, int off, int len) throws SignatureException { throw new RuntimeException("Stub!"); } 
/* 22 */   public final void update(ByteBuffer data) throws SignatureException { throw new RuntimeException("Stub!"); } 
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 24 */   public final void setParameter(String param, Object value) throws InvalidParameterException { throw new RuntimeException("Stub!"); } 
/* 25 */   public final void setParameter(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 26 */   public final AlgorithmParameters getParameters() { throw new RuntimeException("Stub!"); } 
/* 27 */   public final Object getParameter(String param) throws InvalidParameterException { throw new RuntimeException("Stub!"); } 
/* 28 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.Signature
 * JD-Core Version:    0.6.0
 */