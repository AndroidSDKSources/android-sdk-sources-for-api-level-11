/*   */ package java.nio.channels;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.nio.channels.spi.SelectorProvider;
/*   */ import java.util.Set;
/*   */ 
/*   */ public abstract class Selector
/*   */ {
/*   */   protected Selector()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static Selector open() throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void close()
/*   */     throws IOException;
/*   */ 
/*   */   public abstract boolean isOpen();
/*   */ 
/*   */   public abstract Set<SelectionKey> keys();
/*   */ 
/*   */   public abstract SelectorProvider provider();
/*   */ 
/*   */   public abstract int select()
/*   */     throws IOException;
/*   */ 
/*   */   public abstract int select(long paramLong)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract Set<SelectionKey> selectedKeys();
/*   */ 
/*   */   public abstract int selectNow()
/*   */     throws IOException;
/*   */ 
/*   */   public abstract Selector wakeup();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.Selector
 * JD-Core Version:    0.6.0
 */