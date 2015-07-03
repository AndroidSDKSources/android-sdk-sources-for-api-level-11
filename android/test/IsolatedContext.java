/*    */ package android.test;
/*    */ 
/*    */ import android.content.BroadcastReceiver;
/*    */ import android.content.ContentResolver;
/*    */ import android.content.Context;
/*    */ import android.content.ContextWrapper;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentFilter;
/*    */ import android.content.ServiceConnection;
/*    */ import android.net.Uri;
/*    */ import java.io.File;
/*    */ import java.util.List;
/*    */ 
/*    */ public class IsolatedContext extends ContextWrapper
/*    */ {
/*    */   public IsolatedContext(ContentResolver resolver, Context targetContext)
/*    */   {
/*  5 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public List<Intent> getAndClearBroadcastIntents() { throw new RuntimeException("Stub!"); } 
/*  7 */   public ContentResolver getContentResolver() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean bindService(Intent service, ServiceConnection conn, int flags) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void unregisterReceiver(BroadcastReceiver receiver) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void sendBroadcast(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void sendOrderedBroadcast(Intent intent, String receiverPermission) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Object getSystemService(String name) { throw new RuntimeException("Stub!"); } 
/* 16 */   public File getFilesDir() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.IsolatedContext
 * JD-Core Version:    0.6.0
 */