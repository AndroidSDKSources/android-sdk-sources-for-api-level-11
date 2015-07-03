/*   */ package android.telephony;
/*   */ 
/*   */ import android.app.PendingIntent;
/*   */ import java.util.ArrayList;
/*   */ 
/*   */ public final class SmsManager
/*   */ {
/*   */   public static final int STATUS_ON_ICC_FREE = 0;
/*   */   public static final int STATUS_ON_ICC_READ = 1;
/*   */   public static final int STATUS_ON_ICC_UNREAD = 3;
/*   */   public static final int STATUS_ON_ICC_SENT = 5;
/*   */   public static final int STATUS_ON_ICC_UNSENT = 7;
/*   */   public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
/*   */   public static final int RESULT_ERROR_RADIO_OFF = 2;
/*   */   public static final int RESULT_ERROR_NULL_PDU = 3;
/*   */   public static final int RESULT_ERROR_NO_SERVICE = 4;
/*   */ 
/*   */   SmsManager()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void sendTextMessage(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); } 
/* 6 */   public ArrayList<String> divideMessage(String text) { throw new RuntimeException("Stub!"); } 
/* 7 */   public void sendMultipartTextMessage(String destinationAddress, String scAddress, ArrayList<String> parts, ArrayList<PendingIntent> sentIntents, ArrayList<PendingIntent> deliveryIntents) { throw new RuntimeException("Stub!"); } 
/* 8 */   public void sendDataMessage(String destinationAddress, String scAddress, short destinationPort, byte[] data, PendingIntent sentIntent, PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); } 
/* 9 */   public static SmsManager getDefault() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.telephony.SmsManager
 * JD-Core Version:    0.6.0
 */