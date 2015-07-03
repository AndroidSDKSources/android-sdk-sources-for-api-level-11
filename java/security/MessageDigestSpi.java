/*    */ package java.security;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public abstract class MessageDigestSpi
/*    */ {
/*    */   public MessageDigestSpi()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   protected int engineGetDigestLength() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void engineUpdate(byte paramByte);
/*    */ 
/*    */   protected abstract void engineUpdate(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
/*    */ 
/*  8 */   protected void engineUpdate(ByteBuffer input) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract byte[] engineDigest();
/*    */ 
/* 10 */   protected int engineDigest(byte[] buf, int offset, int len) throws DigestException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void engineReset();
/*    */ 
/* 12 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.MessageDigestSpi
 * JD-Core Version:    0.6.0
 */