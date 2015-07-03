/*   */ package android.app.backup;
/*   */ 
/*   */ import java.io.IOException;
/*   */ 
/*   */ public class BackupDataInput
/*   */ {
/*   */   BackupDataInput()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public boolean readNextHeader() throws IOException { throw new RuntimeException("Stub!"); } 
/* 6 */   public String getKey() { throw new RuntimeException("Stub!"); } 
/* 7 */   public int getDataSize() { throw new RuntimeException("Stub!"); } 
/* 8 */   public int readEntityData(byte[] data, int offset, int size) throws IOException { throw new RuntimeException("Stub!"); } 
/* 9 */   public void skipEntityData() throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.backup.BackupDataInput
 * JD-Core Version:    0.6.0
 */