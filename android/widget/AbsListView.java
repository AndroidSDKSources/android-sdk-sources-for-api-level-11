/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Parcelable;
/*     */ import android.text.Editable;
/*     */ import android.text.TextWatcher;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.SparseBooleanArray;
/*     */ import android.view.ActionMode;
/*     */ import android.view.ActionMode.Callback;
/*     */ import android.view.ContextMenu.ContextMenuInfo;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup.LayoutParams;
/*     */ import android.view.ViewTreeObserver.OnGlobalLayoutListener;
/*     */ import android.view.ViewTreeObserver.OnTouchModeChangeListener;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public abstract class AbsListView extends AdapterView<ListAdapter>
/*     */   implements TextWatcher, ViewTreeObserver.OnGlobalLayoutListener, Filter.FilterListener, ViewTreeObserver.OnTouchModeChangeListener
/*     */ {
/*     */   public static final int TRANSCRIPT_MODE_DISABLED = 0;
/*     */   public static final int TRANSCRIPT_MODE_NORMAL = 1;
/*     */   public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;
/*     */   public static final int CHOICE_MODE_NONE = 0;
/*     */   public static final int CHOICE_MODE_SINGLE = 1;
/*     */   public static final int CHOICE_MODE_MULTIPLE = 2;
/*     */   public static final int CHOICE_MODE_MULTIPLE_MODAL = 3;
/*     */ 
/*     */   public AbsListView(Context context)
/*     */   {
/*  35 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  36 */   public AbsListView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  37 */   public AbsListView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  38 */   public void setOverScrollMode(int mode) { throw new RuntimeException("Stub!"); } 
/*  39 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); } 
/*  40 */   public int getCheckedItemCount() { throw new RuntimeException("Stub!"); } 
/*  41 */   public boolean isItemChecked(int position) { throw new RuntimeException("Stub!"); } 
/*  42 */   public int getCheckedItemPosition() { throw new RuntimeException("Stub!"); } 
/*  43 */   public SparseBooleanArray getCheckedItemPositions() { throw new RuntimeException("Stub!"); } 
/*  44 */   public long[] getCheckedItemIds() { throw new RuntimeException("Stub!"); } 
/*  45 */   public void clearChoices() { throw new RuntimeException("Stub!"); } 
/*  46 */   public void setItemChecked(int position, boolean value) { throw new RuntimeException("Stub!"); } 
/*  47 */   public boolean performItemClick(View view, int position, long id) { throw new RuntimeException("Stub!"); } 
/*  48 */   public int getChoiceMode() { throw new RuntimeException("Stub!"); } 
/*  49 */   public void setChoiceMode(int choiceMode) { throw new RuntimeException("Stub!"); } 
/*  50 */   public void setMultiChoiceModeListener(MultiChoiceModeListener listener) { throw new RuntimeException("Stub!"); } 
/*  51 */   public void setFastScrollEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  52 */   public void setFastScrollAlwaysVisible(boolean alwaysShow) { throw new RuntimeException("Stub!"); } 
/*  53 */   public boolean isFastScrollAlwaysVisible() { throw new RuntimeException("Stub!"); } 
/*  54 */   public int getVerticalScrollbarWidth() { throw new RuntimeException("Stub!"); } 
/*  55 */   public boolean isFastScrollEnabled() { throw new RuntimeException("Stub!"); } 
/*  56 */   public void setVerticalScrollbarPosition(int position) { throw new RuntimeException("Stub!"); } 
/*  57 */   public void setSmoothScrollbarEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  58 */   public boolean isSmoothScrollbarEnabled() { throw new RuntimeException("Stub!"); } 
/*  59 */   public void setOnScrollListener(OnScrollListener l) { throw new RuntimeException("Stub!"); } 
/*  60 */   public boolean isScrollingCacheEnabled() { throw new RuntimeException("Stub!"); } 
/*  61 */   public void setScrollingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  62 */   public void setTextFilterEnabled(boolean textFilterEnabled) { throw new RuntimeException("Stub!"); } 
/*  63 */   public boolean isTextFilterEnabled() { throw new RuntimeException("Stub!"); } 
/*  64 */   public void getFocusedRect(Rect r) { throw new RuntimeException("Stub!"); } 
/*  65 */   public boolean isStackFromBottom() { throw new RuntimeException("Stub!"); } 
/*  66 */   public void setStackFromBottom(boolean stackFromBottom) { throw new RuntimeException("Stub!"); } 
/*  67 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/*  68 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/*  69 */   public void setFilterText(String filterText) { throw new RuntimeException("Stub!"); } 
/*  70 */   public CharSequence getTextFilter() { throw new RuntimeException("Stub!"); } 
/*  71 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/*  72 */   public void requestLayout() { throw new RuntimeException("Stub!"); } 
/*  73 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); } 
/*  74 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); } 
/*  75 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); } 
/*  76 */   protected float getTopFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/*  77 */   protected float getBottomFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/*  78 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/*  79 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/*  80 */   protected void layoutChildren() { throw new RuntimeException("Stub!"); } 
/*  81 */   public View getSelectedView() { throw new RuntimeException("Stub!"); } 
/*  82 */   public int getListPaddingTop() { throw new RuntimeException("Stub!"); } 
/*  83 */   public int getListPaddingBottom() { throw new RuntimeException("Stub!"); } 
/*  84 */   public int getListPaddingLeft() { throw new RuntimeException("Stub!"); } 
/*  85 */   public int getListPaddingRight() { throw new RuntimeException("Stub!"); } 
/*  86 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/*  87 */   protected boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); } 
/*  88 */   protected int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); } 
/*  89 */   protected int getTopPaddingOffset() { throw new RuntimeException("Stub!"); } 
/*  90 */   protected int getRightPaddingOffset() { throw new RuntimeException("Stub!"); } 
/*  91 */   protected int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); } 
/*  92 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); } 
/*  93 */   public void setDrawSelectorOnTop(boolean onTop) { throw new RuntimeException("Stub!"); } 
/*  94 */   public void setSelector(int resID) { throw new RuntimeException("Stub!"); } 
/*  95 */   public void setSelector(Drawable sel) { throw new RuntimeException("Stub!"); } 
/*  96 */   public Drawable getSelector() { throw new RuntimeException("Stub!"); } 
/*  97 */   public void setScrollIndicators(View up, View down) { throw new RuntimeException("Stub!"); } 
/*  98 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/*  99 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 100 */   public boolean verifyDrawable(Drawable dr) { throw new RuntimeException("Stub!"); } 
/* 101 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 102 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 103 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 104 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); } 
/* 105 */   protected ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); } 
/* 106 */   public boolean showContextMenuForChild(View originalView) { throw new RuntimeException("Stub!"); } 
/* 107 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 108 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 109 */   protected void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); } 
/* 110 */   public int pointToPosition(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 111 */   public long pointToRowId(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 112 */   public void onTouchModeChanged(boolean isInTouchMode) { throw new RuntimeException("Stub!"); } 
/* 113 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 114 */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); } 
/* 115 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 116 */   public boolean onInterceptTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 117 */   public void addTouchables(ArrayList<View> views) { throw new RuntimeException("Stub!"); } 
/* 118 */   public void setFriction(float friction) { throw new RuntimeException("Stub!"); } 
/* 119 */   public void setVelocityScale(float scale) { throw new RuntimeException("Stub!"); } 
/* 120 */   public void smoothScrollToPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 121 */   public void smoothScrollToPositionFromTop(int position, int offset, int duration) { throw new RuntimeException("Stub!"); } 
/* 122 */   public void smoothScrollToPositionFromTop(int position, int offset) { throw new RuntimeException("Stub!"); } 
/* 123 */   public void smoothScrollToPosition(int position, int boundPosition) { throw new RuntimeException("Stub!"); } 
/* 124 */   public void smoothScrollBy(int distance, int duration) { throw new RuntimeException("Stub!"); } 
/* 125 */   public void invalidateViews() { throw new RuntimeException("Stub!"); } 
/* 126 */   protected void handleDataChanged() { throw new RuntimeException("Stub!"); } 
/* 127 */   protected void onDisplayHint(int hint) { throw new RuntimeException("Stub!"); } 
/* 128 */   protected boolean isInFilterMode() { throw new RuntimeException("Stub!"); } 
/* 129 */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) { throw new RuntimeException("Stub!"); } 
/* 130 */   public boolean checkInputConnectionProxy(View view) { throw new RuntimeException("Stub!"); } 
/* 131 */   public void clearTextFilter() { throw new RuntimeException("Stub!"); } 
/* 132 */   public boolean hasTextFilter() { throw new RuntimeException("Stub!"); } 
/* 133 */   public void onGlobalLayout() { throw new RuntimeException("Stub!"); } 
/* 134 */   public void beforeTextChanged(CharSequence s, int start, int count, int after) { throw new RuntimeException("Stub!"); } 
/* 135 */   public void onTextChanged(CharSequence s, int start, int before, int count) { throw new RuntimeException("Stub!"); } 
/* 136 */   public void afterTextChanged(Editable s) { throw new RuntimeException("Stub!"); } 
/* 137 */   public void onFilterComplete(int count) { throw new RuntimeException("Stub!"); } 
/* 138 */   protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 139 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 140 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 141 */   public void setTranscriptMode(int mode) { throw new RuntimeException("Stub!"); } 
/* 142 */   public int getTranscriptMode() { throw new RuntimeException("Stub!"); } 
/* 143 */   public int getSolidColor() { throw new RuntimeException("Stub!"); } 
/* 144 */   public void setCacheColorHint(int color) { throw new RuntimeException("Stub!"); } 
/* 145 */   public int getCacheColorHint() { throw new RuntimeException("Stub!"); } 
/* 146 */   public void reclaimViews(List<View> views) { throw new RuntimeException("Stub!"); } 
/* 147 */   public void setRemoteViewsAdapter(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 148 */   public boolean onRemoteAdapterConnected() { throw new RuntimeException("Stub!"); } 
/* 149 */   public void onRemoteAdapterDisconnected() { throw new RuntimeException("Stub!"); } 
/* 150 */   public void setRecyclerListener(RecyclerListener listener) { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static abstract interface RecyclerListener
/*     */   {
/*     */     public abstract void onMovedToScrapHeap(View paramView);
/*     */   }
/*     */ 
/*     */   public static class LayoutParams extends ViewGroup.LayoutParams
/*     */   {
/*     */     public LayoutParams(Context c, AttributeSet attrs)
/*     */     {
/*  26 */       super(); throw new RuntimeException("Stub!"); } 
/*  27 */     public LayoutParams(int w, int h) { super(); throw new RuntimeException("Stub!"); } 
/*  28 */     public LayoutParams(int w, int h, int viewType) { super(); throw new RuntimeException("Stub!"); } 
/*  29 */     public LayoutParams(ViewGroup.LayoutParams source) { super(); throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface MultiChoiceModeListener extends ActionMode.Callback
/*     */   {
/*     */     public abstract void onItemCheckedStateChanged(ActionMode paramActionMode, int paramInt, long paramLong, boolean paramBoolean);
/*     */   }
/*     */ 
/*     */   public static abstract interface SelectionBoundsAdjuster
/*     */   {
/*     */     public abstract void adjustListItemSelectionBounds(Rect paramRect);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnScrollListener
/*     */   {
/*     */     public static final int SCROLL_STATE_IDLE = 0;
/*     */     public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
/*     */     public static final int SCROLL_STATE_FLING = 2;
/*     */ 
/*     */     public abstract void onScrollStateChanged(AbsListView paramAbsListView, int paramInt);
/*     */ 
/*     */     public abstract void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3);
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.AbsListView
 * JD-Core Version:    0.6.0
 */