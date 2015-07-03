/*   */ package android.app.backup;
/*   */ 
/*   */ import android.content.Context;
/*   */ import android.os.ParcelFileDescriptor;
/*   */ 
/*   */ public class SharedPreferencesBackupHelper extends FileBackupHelperBase
/*   */   implements BackupHelper
/*   */ {
/*   */   public SharedPreferencesBackupHelper(Context context, String[] prefGroups)
/*   */   {
/* 6 */     throw new RuntimeException("Stub!"); } 
/* 7 */   public void performBackup(ParcelFileDescriptor oldState, BackupDataOutput data, ParcelFileDescriptor newState) { throw new RuntimeException("Stub!"); } 
/* 8 */   public void restoreEntity(BackupDataInputStream data) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.backup.SharedPreferencesBackupHelper
 * JD-Core Version:    0.6.0
 */