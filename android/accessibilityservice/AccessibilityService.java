/*    */ package android.accessibilityservice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ 
/*    */ public abstract class AccessibilityService extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.accessibilityservice.AccessibilityService";
/*    */ 
/*    */   public AccessibilityService()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void onAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);
/*    */ 
/*    */   public abstract void onInterrupt();
/*    */ 
/*  8 */   protected void onServiceConnected() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final void setServiceInfo(AccessibilityServiceInfo info) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.accessibilityservice.AccessibilityService
 * JD-Core Version:    0.6.0
 */