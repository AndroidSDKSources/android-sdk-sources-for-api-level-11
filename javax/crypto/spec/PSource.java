/*    */ package javax.crypto.spec;
/*    */ 
/*    */ public class PSource
/*    */ {
/*    */   protected PSource(String pSrcName)
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public String getAlgorithm() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class PSpecified extends PSource
/*    */   {
/* 10 */     public static final PSpecified DEFAULT = null;
/*    */ 
/*    */     public PSpecified(byte[] p)
/*    */     {
/*  7 */       super(); throw new RuntimeException("Stub!"); } 
/*  8 */     public byte[] getValue() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.spec.PSource
 * JD-Core Version:    0.6.0
 */