/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class GridView extends AbsListView
/*    */ {
/*    */   public static final int NO_STRETCH = 0;
/*    */   public static final int STRETCH_SPACING = 1;
/*    */   public static final int STRETCH_COLUMN_WIDTH = 2;
/*    */   public static final int STRETCH_SPACING_UNIFORM = 3;
/*    */   public static final int AUTO_FIT = -1;
/*    */ 
/*    */   public GridView(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public GridView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public GridView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   public ListAdapter getAdapter() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setRemoteViewsAdapter(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void smoothScrollToPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void smoothScrollByOffset(int offset) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void attachLayoutAnimationParameters(View child, ViewGroup.LayoutParams params, int index, int count) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void layoutChildren() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setHorizontalSpacing(int horizontalSpacing) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setVerticalSpacing(int verticalSpacing) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setStretchMode(int stretchMode) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getStretchMode() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setColumnWidth(int columnWidth) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setNumColumns(int numColumns) { throw new RuntimeException("Stub!"); } 
/* 29 */   public int getNumColumns() { throw new RuntimeException("Stub!"); } 
/* 30 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); } 
/* 31 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); } 
/* 32 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.GridView
 * JD-Core Version:    0.6.0
 */