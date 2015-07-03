/*   */ package java.security;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ import java.security.spec.InvalidParameterSpecException;
/*   */ 
/*   */ public abstract class AlgorithmParametersSpi
/*   */ {
/*   */   public AlgorithmParametersSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract void engineInit(AlgorithmParameterSpec paramAlgorithmParameterSpec)
/*   */     throws InvalidParameterSpecException;
/*   */ 
/*   */   protected abstract void engineInit(byte[] paramArrayOfByte)
/*   */     throws IOException;
/*   */ 
/*   */   protected abstract void engineInit(byte[] paramArrayOfByte, String paramString)
/*   */     throws IOException;
/*   */ 
/*   */   protected abstract <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> paramClass)
/*   */     throws InvalidParameterSpecException;
/*   */ 
/*   */   protected abstract byte[] engineGetEncoded()
/*   */     throws IOException;
/*   */ 
/*   */   protected abstract byte[] engineGetEncoded(String paramString)
/*   */     throws IOException;
/*   */ 
/*   */   protected abstract String engineToString();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.AlgorithmParametersSpi
 * JD-Core Version:    0.6.0
 */