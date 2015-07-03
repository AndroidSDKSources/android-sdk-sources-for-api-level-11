/*    */ package javax.net.ssl;
/*    */ 
/*    */ public class SSLEngineResult
/*    */ {
/*    */   public SSLEngineResult(Status status, HandshakeStatus handshakeStatus, int bytesConsumed, int bytesProduced)
/*    */   {
/* 19 */     throw new RuntimeException("Stub!"); } 
/* 20 */   public final Status getStatus() { throw new RuntimeException("Stub!"); } 
/* 21 */   public final HandshakeStatus getHandshakeStatus() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final int bytesConsumed() { throw new RuntimeException("Stub!"); } 
/* 23 */   public final int bytesProduced() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Status
/*    */   {
/* 14 */     BUFFER_OVERFLOW, 
/* 15 */     BUFFER_UNDERFLOW, 
/* 16 */     CLOSED, 
/* 17 */     OK;
/*    */   }
/*    */ 
/*    */   public static enum HandshakeStatus
/*    */   {
/*  6 */     FINISHED, 
/*  7 */     NEED_TASK, 
/*  8 */     NEED_UNWRAP, 
/*  9 */     NEED_WRAP, 
/* 10 */     NOT_HANDSHAKING;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLEngineResult
 * JD-Core Version:    0.6.0
 */