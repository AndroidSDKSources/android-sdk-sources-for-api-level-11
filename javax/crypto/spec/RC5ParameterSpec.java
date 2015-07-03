/*    */ package javax.crypto.spec;
/*    */ 
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public class RC5ParameterSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/*    */   public RC5ParameterSpec(int version, int rounds, int wordSize)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public RC5ParameterSpec(int version, int rounds, int wordSize, byte[] iv) { throw new RuntimeException("Stub!"); } 
/*  7 */   public RC5ParameterSpec(int version, int rounds, int wordSize, byte[] iv, int offset) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getVersion() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getRounds() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getWordSize() { throw new RuntimeException("Stub!"); } 
/* 11 */   public byte[] getIV() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int hashCode() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.spec.RC5ParameterSpec
 * JD-Core Version:    0.6.0
 */