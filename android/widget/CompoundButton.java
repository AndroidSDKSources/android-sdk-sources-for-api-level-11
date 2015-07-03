/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ 
/*    */ public abstract class CompoundButton extends Button
/*    */   implements Checkable
/*    */ {
/*    */   public CompoundButton(Context context)
/*    */   {
/* 10 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public CompoundButton(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public CompoundButton(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 13 */   public void toggle() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean performClick() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isChecked() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setChecked(boolean checked) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setOnCheckedChangeListener(OnCheckedChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setButtonDrawable(int resid) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setButtonDrawable(Drawable d) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 22 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 24 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 26 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnCheckedChangeListener
/*    */   {
/*    */     public abstract void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.CompoundButton
 * JD-Core Version:    0.6.0
 */