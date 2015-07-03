/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.SpanWatcher;
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ public class TextKeyListener extends BaseKeyListener
/*    */   implements SpanWatcher
/*    */ {
/*    */   public TextKeyListener(Capitalize cap, boolean autotext)
/*    */   {
/* 13 */     throw new RuntimeException("Stub!"); } 
/* 14 */   public static TextKeyListener getInstance(boolean autotext, Capitalize cap) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static TextKeyListener getInstance() { throw new RuntimeException("Stub!"); } 
/* 16 */   public static boolean shouldCap(Capitalize cap, CharSequence cs, int off) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getInputType() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean onKeyUp(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean onKeyOther(View view, Editable content, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static void clear(Editable e) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onSpanAdded(Spannable s, Object what, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void onSpanRemoved(Spannable s, Object what, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void onSpanChanged(Spannable s, Object what, int start, int end, int st, int en) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void release() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Capitalize
/*    */   {
/*  8 */     CHARACTERS, 
/*  9 */     NONE, 
/* 10 */     SENTENCES, 
/* 11 */     WORDS;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.TextKeyListener
 * JD-Core Version:    0.6.0
 */