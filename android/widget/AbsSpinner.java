/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ 
/*    */ public abstract class AbsSpinner extends AdapterView<SpinnerAdapter>
/*    */ {
/*    */   public AbsSpinner(Context context)
/*    */   {
/*  5 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  6 */   public AbsSpinner(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public AbsSpinner(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public void setAdapter(SpinnerAdapter adapter) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setSelection(int position, boolean animate) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); } 
/* 13 */   public View getSelectedView() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void requestLayout() { throw new RuntimeException("Stub!"); } 
/* 15 */   public SpinnerAdapter getAdapter() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getCount() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int pointToPosition(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 18 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.AbsSpinner
 * JD-Core Version:    0.6.0
 */