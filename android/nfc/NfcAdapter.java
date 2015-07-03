/*    */ package android.nfc;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.app.PendingIntent;
/*    */ import android.content.Context;
/*    */ import android.content.IntentFilter;
/*    */ 
/*    */ public final class NfcAdapter
/*    */ {
/*    */   public static final String ACTION_NDEF_DISCOVERED = "android.nfc.action.NDEF_DISCOVERED";
/*    */   public static final String ACTION_TECH_DISCOVERED = "android.nfc.action.TECH_DISCOVERED";
/*    */   public static final String ACTION_TAG_DISCOVERED = "android.nfc.action.TAG_DISCOVERED";
/*    */   public static final String EXTRA_TAG = "android.nfc.extra.TAG";
/*    */   public static final String EXTRA_NDEF_MESSAGES = "android.nfc.extra.NDEF_MESSAGES";
/*    */   public static final String EXTRA_ID = "android.nfc.extra.ID";
/*    */ 
/*    */   NfcAdapter()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static NfcAdapter getDefaultAdapter(Context context) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static NfcAdapter getDefaultAdapter() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void enableForegroundDispatch(Activity activity, PendingIntent intent, IntentFilter[] filters, String[][] techLists) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void disableForegroundDispatch(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void enableForegroundNdefPush(Activity activity, NdefMessage msg) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void disableForegroundNdefPush(Activity activity) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.nfc.NfcAdapter
 * JD-Core Version:    0.6.0
 */