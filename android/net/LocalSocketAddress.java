/*    */ package android.net;
/*    */ 
/*    */ public class LocalSocketAddress
/*    */ {
/*    */   public LocalSocketAddress(String name, Namespace namespace)
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public LocalSocketAddress(String name) { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 13 */   public Namespace getNamespace() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Namespace
/*    */   {
/*  6 */     ABSTRACT, 
/*  7 */     FILESYSTEM, 
/*  8 */     RESERVED;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.LocalSocketAddress
 * JD-Core Version:    0.6.0
 */