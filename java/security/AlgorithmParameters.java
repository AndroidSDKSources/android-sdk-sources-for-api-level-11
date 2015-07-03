/*    */ package java.security;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ import java.security.spec.InvalidParameterSpecException;
/*    */ 
/*    */ public class AlgorithmParameters
/*    */ {
/*    */   protected AlgorithmParameters(AlgorithmParametersSpi algPramSpi, Provider provider, String algorithm)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static AlgorithmParameters getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static AlgorithmParameters getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static AlgorithmParameters getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  8 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void init(AlgorithmParameterSpec paramSpec) throws InvalidParameterSpecException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void init(byte[] params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void init(byte[] params, String format) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final <T extends AlgorithmParameterSpec> T getParameterSpec(Class<T> paramSpec) throws InvalidParameterSpecException { throw new RuntimeException("Stub!"); } 
/* 14 */   public final byte[] getEncoded() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public final byte[] getEncoded(String format) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public final String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.AlgorithmParameters
 * JD-Core Version:    0.6.0
 */