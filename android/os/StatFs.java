/*   */ package android.os;
/*   */ 
/*   */ public class StatFs
/*   */ {
/*   */   public StatFs(String path)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void restat(String path) { throw new RuntimeException("Stub!"); } 
/* 6 */   protected void finalize() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public native int getBlockSize();
/*   */ 
/*   */   public native int getBlockCount();
/*   */ 
/*   */   public native int getFreeBlocks();
/*   */ 
/*   */   public native int getAvailableBlocks();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.StatFs
 * JD-Core Version:    0.6.0
 */