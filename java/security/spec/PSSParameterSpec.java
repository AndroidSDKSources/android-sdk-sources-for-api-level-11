/*    */ package java.security.spec;
/*    */ 
/*    */ public class PSSParameterSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/* 13 */   public static final PSSParameterSpec DEFAULT = null;
/*    */ 
/*    */   public PSSParameterSpec(int saltLen)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PSSParameterSpec(String mdName, String mgfName, AlgorithmParameterSpec mgfSpec, int saltLen, int trailerField) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getSaltLength() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getDigestAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getMGFAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 10 */   public AlgorithmParameterSpec getMGFParameters() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getTrailerField() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.spec.PSSParameterSpec
 * JD-Core Version:    0.6.0
 */