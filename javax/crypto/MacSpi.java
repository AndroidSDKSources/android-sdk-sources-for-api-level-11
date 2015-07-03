/*    */ package javax.crypto;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public abstract class MacSpi
/*    */ {
/*    */   public MacSpi()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract int engineGetMacLength();
/*    */ 
/*    */   protected abstract void engineInit(Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException;
/*    */ 
/*    */   protected abstract void engineUpdate(byte paramByte);
/*    */ 
/*    */   protected abstract void engineUpdate(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
/*    */ 
/*  9 */   protected void engineUpdate(ByteBuffer input) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract byte[] engineDoFinal();
/*    */ 
/*    */   protected abstract void engineReset();
/*    */ 
/* 12 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.MacSpi
 * JD-Core Version:    0.6.0
 */