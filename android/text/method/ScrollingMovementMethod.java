/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Spannable;
/*    */ import android.view.MotionEvent;
/*    */ import android.widget.TextView;
/*    */ 
/*    */ public class ScrollingMovementMethod extends BaseMovementMethod
/*    */   implements MovementMethod
/*    */ {
/*    */   public ScrollingMovementMethod()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   protected boolean left(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected boolean right(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected boolean up(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected boolean down(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected boolean pageUp(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected boolean pageDown(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected boolean top(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected boolean bottom(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected boolean lineStart(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected boolean lineEnd(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected boolean home(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected boolean end(TextView widget, Spannable buffer) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void onTakeFocus(TextView widget, Spannable text, int dir) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static MovementMethod getInstance() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.ScrollingMovementMethod
 * JD-Core Version:    0.6.0
 */