/*    */ package java.nio.channels;
/*    */ 
/*    */ public abstract class SelectionKey
/*    */ {
/*    */   public static final int OP_ACCEPT = 16;
/*    */   public static final int OP_CONNECT = 8;
/*    */   public static final int OP_READ = 1;
/*    */   public static final int OP_WRITE = 4;
/*    */ 
/*    */   protected SelectionKey()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final Object attach(Object anObject) { throw new RuntimeException("Stub!"); } 
/*  6 */   public final Object attachment() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void cancel();
/*    */ 
/*    */   public abstract SelectableChannel channel();
/*    */ 
/*    */   public abstract int interestOps();
/*    */ 
/*    */   public abstract SelectionKey interestOps(int paramInt);
/*    */ 
/* 11 */   public final boolean isAcceptable() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final boolean isConnectable() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final boolean isReadable() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isValid();
/*    */ 
/* 15 */   public final boolean isWritable() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract int readyOps();
/*    */ 
/*    */   public abstract Selector selector();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.SelectionKey
 * JD-Core Version:    0.6.0
 */