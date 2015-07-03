/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.InputFilter;
/*    */ import android.text.Spannable;
/*    */ import android.text.Spanned;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ public abstract class NumberKeyListener extends BaseKeyListener
/*    */   implements InputFilter
/*    */ {
/*    */   public NumberKeyListener()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract char[] getAcceptedChars();
/*    */ 
/*  8 */   protected int lookup(KeyEvent event, Spannable content) { throw new RuntimeException("Stub!"); } 
/*  9 */   public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected static boolean ok(char[] accept, char c) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.NumberKeyListener
 * JD-Core Version:    0.6.0
 */