/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ public abstract class MetaKeyKeyListener
/*    */ {
/*    */   public static final int META_SHIFT_ON = 1;
/*    */   public static final int META_ALT_ON = 2;
/*    */   public static final int META_SYM_ON = 4;
/*    */   public static final int META_CAP_LOCKED = 256;
/*    */   public static final int META_ALT_LOCKED = 512;
/*    */   public static final int META_SYM_LOCKED = 1024;
/*    */ 
/*    */   public MetaKeyKeyListener()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static void resetMetaState(Spannable text) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static final int getMetaState(CharSequence text) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final int getMetaState(CharSequence text, int meta) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static void adjustMetaAfterKeypress(Spannable content) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static boolean isMetaTracker(CharSequence text, Object what) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static boolean isSelectingMetaTracker(CharSequence text, Object what) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected static void resetLockedMeta(Spannable content) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean onKeyUp(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void clearMetaKeyState(View view, Editable content, int states) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static void clearMetaKeyState(Editable content, int states) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static long resetLockedMeta(long state) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static final int getMetaState(long state) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static final int getMetaState(long state, int meta) { throw new RuntimeException("Stub!"); } 
/* 19 */   public static long adjustMetaAfterKeypress(long state) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static long handleKeyDown(long state, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static long handleKeyUp(long state, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 22 */   public long clearMetaKeyState(long state, int which) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.MetaKeyKeyListener
 * JD-Core Version:    0.6.0
 */