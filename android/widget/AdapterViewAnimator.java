/*    */ package android.widget;
/*    */ 
/*    */ import android.animation.ObjectAnimator;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ public abstract class AdapterViewAnimator extends AdapterView<Adapter>
/*    */ {
/*    */   public AdapterViewAnimator(Context context)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  6 */   public AdapterViewAnimator(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public void setDisplayedChild(int whichChild) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getDisplayedChild() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void showNext() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void showPrevious() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 16 */   public View getCurrentView() { throw new RuntimeException("Stub!"); } 
/* 17 */   public ObjectAnimator getInAnimation() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setInAnimation(ObjectAnimator inAnimation) { throw new RuntimeException("Stub!"); } 
/* 19 */   public ObjectAnimator getOutAnimation() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setOutAnimation(ObjectAnimator outAnimation) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setInAnimation(Context context, int resourceID) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setOutAnimation(Context context, int resourceID) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setAnimateFirstView(boolean animate) { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 25 */   public Adapter getAdapter() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setAdapter(Adapter adapter) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setRemoteViewsAdapter(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); } 
/* 29 */   public View getSelectedView() { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean onRemoteAdapterConnected() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void onRemoteAdapterDisconnected() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void advance() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void fyiWillBeAdvancedByHostKThx() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.AdapterViewAnimator
 * JD-Core Version:    0.6.0
 */