/*    */ package android.text.method;
/*    */ 
/*    */ import android.graphics.Rect;
/*    */ import android.text.Editable;
/*    */ import android.text.TextWatcher;
/*    */ import android.view.View;
/*    */ 
/*    */ public class PasswordTransformationMethod
/*    */   implements TransformationMethod, TextWatcher
/*    */ {
/*    */   public PasswordTransformationMethod()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public CharSequence getTransformation(CharSequence source, View view) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static PasswordTransformationMethod getInstance() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void beforeTextChanged(CharSequence s, int start, int count, int after) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onTextChanged(CharSequence s, int start, int before, int count) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void afterTextChanged(Editable s) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onFocusChanged(View view, CharSequence sourceText, boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.PasswordTransformationMethod
 * JD-Core Version:    0.6.0
 */