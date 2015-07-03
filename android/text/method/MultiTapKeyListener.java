/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.SpanWatcher;
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ public class MultiTapKeyListener extends BaseKeyListener
/*    */   implements SpanWatcher
/*    */ {
/*    */   public MultiTapKeyListener(TextKeyListener.Capitalize cap, boolean autotext)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static MultiTapKeyListener getInstance(boolean autotext, TextKeyListener.Capitalize cap) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getInputType() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onSpanChanged(Spannable buf, Object what, int s, int e, int start, int stop) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onSpanAdded(Spannable s, Object what, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onSpanRemoved(Spannable s, Object what, int start, int end) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.MultiTapKeyListener
 * JD-Core Version:    0.6.0
 */