/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.widget.TextView;
/*    */ 
/*    */ public class ArrowKeyMovementMethod extends BaseMovementMethod
/*    */   implements MovementMethod
/*    */ {
/*    */   public ArrowKeyMovementMethod()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   protected boolean handleMovementKey(TextView widget, Spannable buffer, int keyCode, int movementMetaState, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected boolean left(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected boolean right(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected boolean up(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected boolean down(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected boolean pageUp(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected boolean pageDown(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected boolean top(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected boolean bottom(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected boolean lineStart(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected boolean lineEnd(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected boolean home(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected boolean end(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean canSelectArbitrarily() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void initialize(TextView widget, Spannable text) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void onTakeFocus(TextView view, Spannable text, int dir) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static MovementMethod getInstance() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.ArrowKeyMovementMethod
 * JD-Core Version:    0.6.0
 */