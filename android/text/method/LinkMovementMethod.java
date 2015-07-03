/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.widget.TextView;
/*    */ 
/*    */ public class LinkMovementMethod extends ScrollingMovementMethod
/*    */ {
/*    */   public LinkMovementMethod()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected boolean handleMovementKey(TextView widget, Spannable buffer, int keyCode, int movementMetaState, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected boolean up(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected boolean down(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected boolean left(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected boolean right(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void initialize(TextView widget, Spannable text) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onTakeFocus(TextView view, Spannable text, int dir) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static MovementMethod getInstance() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.LinkMovementMethod
 * JD-Core Version:    0.6.0
 */