/*    */ package android.app.admin;
/*    */ 
/*    */ import android.content.BroadcastReceiver;
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ 
/*    */ public class DeviceAdminReceiver extends BroadcastReceiver
/*    */ {
/*    */   public static final String ACTION_DEVICE_ADMIN_ENABLED = "android.app.action.DEVICE_ADMIN_ENABLED";
/*    */   public static final String ACTION_DEVICE_ADMIN_DISABLE_REQUESTED = "android.app.action.DEVICE_ADMIN_DISABLE_REQUESTED";
/*    */   public static final String EXTRA_DISABLE_WARNING = "android.app.extra.DISABLE_WARNING";
/*    */   public static final String ACTION_DEVICE_ADMIN_DISABLED = "android.app.action.DEVICE_ADMIN_DISABLED";
/*    */   public static final String ACTION_PASSWORD_CHANGED = "android.app.action.ACTION_PASSWORD_CHANGED";
/*    */   public static final String ACTION_PASSWORD_FAILED = "android.app.action.ACTION_PASSWORD_FAILED";
/*    */   public static final String ACTION_PASSWORD_SUCCEEDED = "android.app.action.ACTION_PASSWORD_SUCCEEDED";
/*    */   public static final String ACTION_PASSWORD_EXPIRING = "android.app.action.ACTION_PASSWORD_EXPIRING";
/*    */   public static final String DEVICE_ADMIN_META_DATA = "android.app.device_admin";
/*    */ 
/*    */   public DeviceAdminReceiver()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public DevicePolicyManager getManager(Context context) { throw new RuntimeException("Stub!"); } 
/*  7 */   public ComponentName getWho(Context context) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void onEnabled(Context context, Intent intent) { throw new RuntimeException("Stub!"); } 
/*  9 */   public CharSequence onDisableRequested(Context context, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onDisabled(Context context, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onPasswordChanged(Context context, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onPasswordFailed(Context context, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onPasswordSucceeded(Context context, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void onPasswordExpiring(Context context, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void onReceive(Context context, Intent intent) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.admin.DeviceAdminReceiver
 * JD-Core Version:    0.6.0
 */