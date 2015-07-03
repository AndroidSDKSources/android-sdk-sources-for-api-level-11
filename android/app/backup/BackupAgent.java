/*   */ package android.app.backup;
/*   */ 
/*   */ import android.content.Context;
/*   */ import android.content.ContextWrapper;
/*   */ import android.os.ParcelFileDescriptor;
/*   */ import java.io.IOException;
/*   */ 
/*   */ public abstract class BackupAgent extends ContextWrapper
/*   */ {
/*   */   public BackupAgent()
/*   */   {
/* 5 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void onDestroy() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void onBackup(ParcelFileDescriptor paramParcelFileDescriptor1, BackupDataOutput paramBackupDataOutput, ParcelFileDescriptor paramParcelFileDescriptor2)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract void onRestore(BackupDataInput paramBackupDataInput, int paramInt, ParcelFileDescriptor paramParcelFileDescriptor)
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.backup.BackupAgent
 * JD-Core Version:    0.6.0
 */