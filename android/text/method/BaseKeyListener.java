/*    */ package android.text.method;
/*    */ 
/*    */ import android.text.Editable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ public abstract class BaseKeyListener extends MetaKeyKeyListener
/*    */   implements KeyListener
/*    */ {
/*    */   public BaseKeyListener()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean backspace(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean forwardDelete(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean onKeyOther(View view, Editable content, KeyEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.BaseKeyListener
 * JD-Core Version:    0.6.0
 */