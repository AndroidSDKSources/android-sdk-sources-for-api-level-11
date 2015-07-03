/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.SparseArray;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
/*    */ import android.view.View;
/*    */ import android.view.View.OnClickListener;
/*    */ import android.view.ViewGroup;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ 
/*    */ public abstract class AdapterView<T extends Adapter> extends ViewGroup
/*    */ {
/*    */   public static final int ITEM_VIEW_TYPE_IGNORE = -1;
/*    */   public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;
/*    */   public static final int INVALID_POSITION = -1;
/*    */   public static final long INVALID_ROW_ID = -9223372036854775808L;
/*    */ 
/*    */   public AdapterView(Context context)
/*    */   {
/* 26 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 27 */   public AdapterView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 28 */   public AdapterView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 29 */   public void setOnItemClickListener(OnItemClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 30 */   public final OnItemClickListener getOnItemClickListener() { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean performItemClick(View view, int position, long id) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setOnItemLongClickListener(OnItemLongClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 33 */   public final OnItemLongClickListener getOnItemLongClickListener() { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setOnItemSelectedListener(OnItemSelectedListener listener) { throw new RuntimeException("Stub!"); } 
/* 35 */   public final OnItemSelectedListener getOnItemSelectedListener() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract T getAdapter();
/*    */ 
/*    */   public abstract void setAdapter(T paramT);
/*    */ 
/* 38 */   public void addView(View child) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void addView(View child, int index) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void addView(View child, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void removeView(View child) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void removeViewAt(int index) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void removeAllViews() { throw new RuntimeException("Stub!"); } 
/* 45 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 46 */   public int getSelectedItemPosition() { throw new RuntimeException("Stub!"); } 
/* 47 */   public long getSelectedItemId() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract View getSelectedView();
/*    */ 
/* 49 */   public Object getSelectedItem() { throw new RuntimeException("Stub!"); } 
/* 50 */   public int getCount() { throw new RuntimeException("Stub!"); } 
/* 51 */   public int getPositionForView(View view) { throw new RuntimeException("Stub!"); } 
/* 52 */   public int getFirstVisiblePosition() { throw new RuntimeException("Stub!"); } 
/* 53 */   public int getLastVisiblePosition() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void setSelection(int paramInt);
/*    */ 
/* 55 */   public void setEmptyView(View emptyView) { throw new RuntimeException("Stub!"); } 
/* 56 */   public View getEmptyView() { throw new RuntimeException("Stub!"); } 
/* 57 */   public void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void setFocusableInTouchMode(boolean focusable) { throw new RuntimeException("Stub!"); } 
/* 59 */   public Object getItemAtPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 60 */   public long getItemIdAtPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 61 */   public void setOnClickListener(View.OnClickListener l) { throw new RuntimeException("Stub!"); } 
/* 62 */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 63 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 64 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 65 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 66 */   protected boolean canAnimate() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class AdapterContextMenuInfo
/*    */     implements ContextMenu.ContextMenuInfo
/*    */   {
/*    */     public View targetView;
/*    */     public int position;
/*    */     public long id;
/*    */ 
/*    */     public AdapterContextMenuInfo(View targetView, int position, long id)
/*    */     {
/* 21 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface OnItemSelectedListener
/*    */   {
/*    */     public abstract void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong);
/*    */ 
/*    */     public abstract void onNothingSelected(AdapterView<?> paramAdapterView);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnItemLongClickListener
/*    */   {
/*    */     public abstract boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnItemClickListener
/*    */   {
/*    */     public abstract void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.AdapterView
 * JD-Core Version:    0.6.0
 */