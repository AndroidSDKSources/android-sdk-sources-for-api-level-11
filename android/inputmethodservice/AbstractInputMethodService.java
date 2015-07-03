/*    */ package android.inputmethodservice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.KeyEvent.Callback;
/*    */ import android.view.KeyEvent.DispatcherState;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.inputmethod.InputMethod;
/*    */ import android.view.inputmethod.InputMethod.SessionCallback;
/*    */ import android.view.inputmethod.InputMethodSession;
/*    */ import android.view.inputmethod.InputMethodSession.EventCallback;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public abstract class AbstractInputMethodService extends Service
/*    */   implements KeyEvent.Callback
/*    */ {
/*    */   public AbstractInputMethodService()
/*    */   {
/* 25 */     throw new RuntimeException("Stub!"); } 
/* 26 */   public KeyEvent.DispatcherState getKeyDispatcherState() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract AbstractInputMethodImpl onCreateInputMethodInterface();
/*    */ 
/*    */   public abstract AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface();
/*    */ 
/* 29 */   protected void dump(FileDescriptor fd, PrintWriter fout, String[] args) { throw new RuntimeException("Stub!"); } 
/* 30 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract class AbstractInputMethodSessionImpl
/*    */     implements InputMethodSession
/*    */   {
/*    */     public AbstractInputMethodSessionImpl()
/*    */     {
/* 17 */       throw new RuntimeException("Stub!"); } 
/* 18 */     public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 19 */     public boolean isRevoked() { throw new RuntimeException("Stub!"); } 
/* 20 */     public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 21 */     public void revokeSelf() { throw new RuntimeException("Stub!"); } 
/* 22 */     public void dispatchKeyEvent(int seq, KeyEvent event, InputMethodSession.EventCallback callback) { throw new RuntimeException("Stub!"); } 
/* 23 */     public void dispatchTrackballEvent(int seq, MotionEvent event, InputMethodSession.EventCallback callback) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public abstract class AbstractInputMethodImpl
/*    */     implements InputMethod
/*    */   {
/*    */     public AbstractInputMethodImpl()
/*    */     {
/*  9 */       throw new RuntimeException("Stub!"); } 
/* 10 */     public void createSession(InputMethod.SessionCallback callback) { throw new RuntimeException("Stub!"); } 
/* 11 */     public void setSessionEnabled(InputMethodSession session, boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 12 */     public void revokeSession(InputMethodSession session) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.inputmethodservice.AbstractInputMethodService
 * JD-Core Version:    0.6.0
 */