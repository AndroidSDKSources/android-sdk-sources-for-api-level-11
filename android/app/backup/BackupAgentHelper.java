/*   */ package android.app.backup;
/*   */ 
/*   */ import android.os.ParcelFileDescriptor;
/*   */ import java.io.IOException;
/*   */ 
/*   */ public class BackupAgentHelper extends BackupAgent
/*   */ {
/*   */   public BackupAgentHelper()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void onBackup(ParcelFileDescriptor oldState, BackupDataOutput data, ParcelFileDescriptor newState) throws IOException { throw new RuntimeException("Stub!"); } 
/* 7 */   public void onRestore(BackupDataInput data, int appVersionCode, ParcelFileDescriptor newState) throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public void addHelper(String keyPrefix, BackupHelper helper) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.backup.BackupAgentHelper
 * JD-Core Version:    0.6.0
 */