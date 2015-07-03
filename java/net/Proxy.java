/*    */ package java.net;
/*    */ 
/*    */ public class Proxy
/*    */ {
/* 17 */   public static final Proxy NO_PROXY = null;
/*    */ 
/*    */   public Proxy(Type type, SocketAddress sa)
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public Type type() { throw new RuntimeException("Stub!"); } 
/* 12 */   public SocketAddress address() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 15 */   public final int hashCode() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Type
/*    */   {
/*  6 */     DIRECT, 
/*  7 */     HTTP, 
/*  8 */     SOCKS;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.Proxy
 * JD-Core Version:    0.6.0
 */