/*    */ package android.speech;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ 
/*    */ public class SpeechRecognizer
/*    */ {
/*    */   public static final String RESULTS_RECOGNITION = "results_recognition";
/*    */   public static final int ERROR_NETWORK_TIMEOUT = 1;
/*    */   public static final int ERROR_NETWORK = 2;
/*    */   public static final int ERROR_AUDIO = 3;
/*    */   public static final int ERROR_SERVER = 4;
/*    */   public static final int ERROR_CLIENT = 5;
/*    */   public static final int ERROR_SPEECH_TIMEOUT = 6;
/*    */   public static final int ERROR_NO_MATCH = 7;
/*    */   public static final int ERROR_RECOGNIZER_BUSY = 8;
/*    */   public static final int ERROR_INSUFFICIENT_PERMISSIONS = 9;
/*    */ 
/*    */   SpeechRecognizer()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static boolean isRecognitionAvailable(Context context) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static SpeechRecognizer createSpeechRecognizer(Context context) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static SpeechRecognizer createSpeechRecognizer(Context context, ComponentName serviceComponent) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setRecognitionListener(RecognitionListener listener) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void startListening(Intent recognizerIntent) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void stopListening() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void cancel() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void destroy() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.speech.SpeechRecognizer
 * JD-Core Version:    0.6.0
 */