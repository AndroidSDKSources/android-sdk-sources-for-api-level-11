/*    */ package android.speech;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.os.RemoteException;
/*    */ 
/*    */ public abstract class RecognitionService extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.speech.RecognitionService";
/*    */   public static final String SERVICE_META_DATA = "android.speech";
/*    */ 
/*    */   public RecognitionService()
/*    */   {
/* 17 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void onStartListening(Intent paramIntent, Callback paramCallback);
/*    */ 
/*    */   protected abstract void onCancel(Callback paramCallback);
/*    */ 
/*    */   protected abstract void onStopListening(Callback paramCallback);
/*    */ 
/* 21 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onDestroy() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public class Callback
/*    */   {
/*    */     Callback()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public void beginningOfSpeech() throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  9 */     public void bufferReceived(byte[] buffer) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 10 */     public void endOfSpeech() throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 11 */     public void error(int error) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 12 */     public void partialResults(Bundle partialResults) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 13 */     public void readyForSpeech(Bundle params) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 14 */     public void results(Bundle results) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 15 */     public void rmsChanged(float rmsdB) throws RemoteException { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.speech.RecognitionService
 * JD-Core Version:    0.6.0
 */