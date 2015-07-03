/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Rect;
/*    */ import android.text.TextWatcher;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ 
/*    */ public class DialerFilter extends RelativeLayout
/*    */ {
/*    */   public static final int DIGITS_AND_LETTERS = 1;
/*    */   public static final int DIGITS_AND_LETTERS_NO_DIGITS = 2;
/*    */   public static final int DIGITS_AND_LETTERS_NO_LETTERS = 3;
/*    */   public static final int DIGITS_ONLY = 4;
/*    */   public static final int LETTERS_ONLY = 5;
/*    */ 
/*    */   public DialerFilter(Context context)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  6 */   public DialerFilter(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isQwertyKeyboard() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getMode() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setMode(int newMode) { throw new RuntimeException("Stub!"); } 
/* 14 */   public CharSequence getLetters() { throw new RuntimeException("Stub!"); } 
/* 15 */   public CharSequence getDigits() { throw new RuntimeException("Stub!"); } 
/* 16 */   public CharSequence getFilterText() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void append(String text) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void clearText() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setLettersWatcher(TextWatcher watcher) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setDigitsWatcher(TextWatcher watcher) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setFilterWatcher(TextWatcher watcher) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void removeFilterWatcher(TextWatcher watcher) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void onModeChange(int oldMode, int newMode) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.DialerFilter
 * JD-Core Version:    0.6.0
 */