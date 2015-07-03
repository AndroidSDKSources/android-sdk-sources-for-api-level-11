/*    */ package java.security;
/*    */ 
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public class AlgorithmParameterGenerator
/*    */ {
/*    */   protected AlgorithmParameterGenerator(AlgorithmParameterGeneratorSpi paramGenSpi, Provider provider, String algorithm)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  6 */   public static AlgorithmParameterGenerator getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static AlgorithmParameterGenerator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static AlgorithmParameterGenerator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void init(int size) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void init(int size, SecureRandom random) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void init(AlgorithmParameterSpec genParamSpec) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final void init(AlgorithmParameterSpec genParamSpec, SecureRandom random) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 14 */   public final AlgorithmParameters generateParameters() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.AlgorithmParameterGenerator
 * JD-Core Version:    0.6.0
 */