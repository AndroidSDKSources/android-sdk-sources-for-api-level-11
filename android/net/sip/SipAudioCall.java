/*    */ package android.net.sip;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Message;
/*    */ 
/*    */ public class SipAudioCall
/*    */ {
/*    */   public SipAudioCall(Context context, SipProfile localProfile)
/*    */   {
/* 18 */     throw new RuntimeException("Stub!"); } 
/* 19 */   public void setListener(Listener listener) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setListener(Listener listener, boolean callbackImmediately) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isInCall() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isOnHold() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 24 */   public SipProfile getLocalProfile() { throw new RuntimeException("Stub!"); } 
/* 25 */   public SipProfile getPeerProfile() { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getState() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void attachCall(SipSession session, String sessionDescription) throws SipException { throw new RuntimeException("Stub!"); } 
/* 28 */   public void makeCall(SipProfile peerProfile, SipSession sipSession, int timeout) throws SipException { throw new RuntimeException("Stub!"); } 
/* 29 */   public void endCall() throws SipException { throw new RuntimeException("Stub!"); } 
/* 30 */   public void holdCall(int timeout) throws SipException { throw new RuntimeException("Stub!"); } 
/* 31 */   public void answerCall(int timeout) throws SipException { throw new RuntimeException("Stub!"); } 
/* 32 */   public void continueCall(int timeout) throws SipException { throw new RuntimeException("Stub!"); } 
/* 33 */   public void toggleMute() { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean isMuted() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setSpeakerMode(boolean speakerMode) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void sendDtmf(int code) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void sendDtmf(int code, Message result) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void startAudio() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Listener
/*    */   {
/*    */     public Listener()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public void onReadyToCall(SipAudioCall call) { throw new RuntimeException("Stub!"); } 
/*  8 */     public void onCalling(SipAudioCall call) { throw new RuntimeException("Stub!"); } 
/*  9 */     public void onRinging(SipAudioCall call, SipProfile caller) { throw new RuntimeException("Stub!"); } 
/* 10 */     public void onRingingBack(SipAudioCall call) { throw new RuntimeException("Stub!"); } 
/* 11 */     public void onCallEstablished(SipAudioCall call) { throw new RuntimeException("Stub!"); } 
/* 12 */     public void onCallEnded(SipAudioCall call) { throw new RuntimeException("Stub!"); } 
/* 13 */     public void onCallBusy(SipAudioCall call) { throw new RuntimeException("Stub!"); } 
/* 14 */     public void onCallHeld(SipAudioCall call) { throw new RuntimeException("Stub!"); } 
/* 15 */     public void onError(SipAudioCall call, int errorCode, String errorMessage) { throw new RuntimeException("Stub!"); } 
/* 16 */     public void onChanged(SipAudioCall call) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.sip.SipAudioCall
 * JD-Core Version:    0.6.0
 */