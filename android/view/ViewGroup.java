/*     */ package android.view;
/*     */ 
/*     */ import android.animation.LayoutTransition;
/*     */ import android.content.Context;
/*     */ import android.content.res.Configuration;
/*     */ import android.content.res.TypedArray;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Point;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Region;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.SparseArray;
/*     */ import android.view.accessibility.AccessibilityEvent;
/*     */ import android.view.animation.Animation.AnimationListener;
/*     */ import android.view.animation.LayoutAnimationController;
/*     */ import android.view.animation.LayoutAnimationController.AnimationParameters;
/*     */ import android.view.animation.Transformation;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public abstract class ViewGroup extends View
/*     */   implements ViewParent, ViewManager
/*     */ {
/*     */   public static final int FOCUS_BEFORE_DESCENDANTS = 131072;
/*     */   public static final int FOCUS_AFTER_DESCENDANTS = 262144;
/*     */   public static final int FOCUS_BLOCK_DESCENDANTS = 393216;
/*     */   public static final int PERSISTENT_NO_CACHE = 0;
/*     */   public static final int PERSISTENT_ANIMATION_CACHE = 1;
/*     */   public static final int PERSISTENT_SCROLLING_CACHE = 2;
/*     */   public static final int PERSISTENT_ALL_CACHES = 3;
/*     */   protected static final int CLIP_TO_PADDING_MASK = 34;
/*     */ 
/*     */   public ViewGroup(Context context)
/*     */   {
/*  37 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  38 */   public ViewGroup(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  39 */   public ViewGroup(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  40 */   public int getDescendantFocusability() { throw new RuntimeException("Stub!"); } 
/*  41 */   public void setDescendantFocusability(int focusability) { throw new RuntimeException("Stub!"); } 
/*  42 */   public void requestChildFocus(View child, View focused) { throw new RuntimeException("Stub!"); } 
/*  43 */   public void focusableViewAvailable(View v) { throw new RuntimeException("Stub!"); } 
/*  44 */   public boolean showContextMenuForChild(View originalView) { throw new RuntimeException("Stub!"); } 
/*  45 */   public ActionMode startActionModeForChild(View originalView, ActionMode.Callback callback) { throw new RuntimeException("Stub!"); } 
/*  46 */   public View focusSearch(View focused, int direction) { throw new RuntimeException("Stub!"); } 
/*  47 */   public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); } 
/*  48 */   public boolean dispatchUnhandledMove(View focused, int direction) { throw new RuntimeException("Stub!"); } 
/*  49 */   public void clearChildFocus(View child) { throw new RuntimeException("Stub!"); } 
/*  50 */   public void clearFocus() { throw new RuntimeException("Stub!"); } 
/*  51 */   public View getFocusedChild() { throw new RuntimeException("Stub!"); } 
/*  52 */   public boolean hasFocus() { throw new RuntimeException("Stub!"); } 
/*  53 */   public View findFocus() { throw new RuntimeException("Stub!"); } 
/*  54 */   public boolean hasFocusable() { throw new RuntimeException("Stub!"); } 
/*  55 */   public void addFocusables(ArrayList<View> views, int direction) { throw new RuntimeException("Stub!"); } 
/*  56 */   public void addFocusables(ArrayList<View> views, int direction, int focusableMode) { throw new RuntimeException("Stub!"); } 
/*  57 */   public void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); } 
/*  58 */   public void addTouchables(ArrayList<View> views) { throw new RuntimeException("Stub!"); } 
/*  59 */   public void dispatchDisplayHint(int hint) { throw new RuntimeException("Stub!"); } 
/*  60 */   protected void dispatchVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); } 
/*  61 */   public void dispatchWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); } 
/*  62 */   public void dispatchConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/*  63 */   public void recomputeViewAttributes(View child) { throw new RuntimeException("Stub!"); } 
/*  64 */   public void bringChildToFront(View child) { throw new RuntimeException("Stub!"); } 
/*  65 */   public boolean dispatchDragEvent(DragEvent event) { throw new RuntimeException("Stub!"); } 
/*  66 */   public void dispatchSystemUiVisibilityChanged(int visible) { throw new RuntimeException("Stub!"); } 
/*  67 */   public boolean dispatchKeyEventPreIme(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  68 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  69 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  70 */   public boolean dispatchTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/*  71 */   public boolean dispatchTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/*  72 */   public void setMotionEventSplittingEnabled(boolean split) { throw new RuntimeException("Stub!"); } 
/*  73 */   public boolean isMotionEventSplittingEnabled() { throw new RuntimeException("Stub!"); } 
/*  74 */   public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) { throw new RuntimeException("Stub!"); } 
/*  75 */   public boolean onInterceptTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/*  76 */   public boolean requestFocus(int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/*  77 */   protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/*  78 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/*  79 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/*  80 */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/*  81 */   protected void dispatchFreezeSelfOnly(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/*  82 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/*  83 */   protected void dispatchThawSelfOnly(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/*  84 */   protected void setChildrenDrawingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  85 */   protected void onAnimationStart() { throw new RuntimeException("Stub!"); } 
/*  86 */   protected void onAnimationEnd() { throw new RuntimeException("Stub!"); } 
/*  87 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/*  88 */   protected int getChildDrawingOrder(int childCount, int i) { throw new RuntimeException("Stub!"); } 
/*  89 */   protected boolean drawChild(Canvas canvas, View child, long drawingTime) { throw new RuntimeException("Stub!"); } 
/*  90 */   public void setClipChildren(boolean clipChildren) { throw new RuntimeException("Stub!"); } 
/*  91 */   public void setClipToPadding(boolean clipToPadding) { throw new RuntimeException("Stub!"); } 
/*  92 */   public void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/*  93 */   public void dispatchSetActivated(boolean activated) { throw new RuntimeException("Stub!"); } 
/*  94 */   protected void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); } 
/*  95 */   protected void setStaticTransformationsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  96 */   protected boolean getChildStaticTransformation(View child, Transformation t) { throw new RuntimeException("Stub!"); } 
/*  97 */   public void addView(View child) { throw new RuntimeException("Stub!"); } 
/*  98 */   public void addView(View child, int index) { throw new RuntimeException("Stub!"); } 
/*  99 */   public void addView(View child, int width, int height) { throw new RuntimeException("Stub!"); } 
/* 100 */   public void addView(View child, LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 101 */   public void addView(View child, int index, LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 102 */   public void updateViewLayout(View view, LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 103 */   protected boolean checkLayoutParams(LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 104 */   public void setOnHierarchyChangeListener(OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 105 */   protected boolean addViewInLayout(View child, int index, LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 106 */   protected boolean addViewInLayout(View child, int index, LayoutParams params, boolean preventRequestLayout) { throw new RuntimeException("Stub!"); } 
/* 107 */   protected void cleanupLayoutState(View child) { throw new RuntimeException("Stub!"); } 
/* 108 */   protected void attachLayoutAnimationParameters(View child, LayoutParams params, int index, int count) { throw new RuntimeException("Stub!"); } 
/* 109 */   public void removeView(View view) { throw new RuntimeException("Stub!"); } 
/* 110 */   public void removeViewInLayout(View view) { throw new RuntimeException("Stub!"); } 
/* 111 */   public void removeViewsInLayout(int start, int count) { throw new RuntimeException("Stub!"); } 
/* 112 */   public void removeViewAt(int index) { throw new RuntimeException("Stub!"); } 
/* 113 */   public void removeViews(int start, int count) { throw new RuntimeException("Stub!"); } 
/* 114 */   public void setLayoutTransition(LayoutTransition transition) { throw new RuntimeException("Stub!"); } 
/* 115 */   public LayoutTransition getLayoutTransition() { throw new RuntimeException("Stub!"); } 
/* 116 */   public void removeAllViews() { throw new RuntimeException("Stub!"); } 
/* 117 */   public void removeAllViewsInLayout() { throw new RuntimeException("Stub!"); } 
/* 118 */   protected void removeDetachedView(View child, boolean animate) { throw new RuntimeException("Stub!"); } 
/* 119 */   protected void attachViewToParent(View child, int index, LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 120 */   protected void detachViewFromParent(View child) { throw new RuntimeException("Stub!"); } 
/* 121 */   protected void detachViewFromParent(int index) { throw new RuntimeException("Stub!"); } 
/* 122 */   protected void detachViewsFromParent(int start, int count) { throw new RuntimeException("Stub!"); } 
/* 123 */   protected void detachAllViewsFromParent() { throw new RuntimeException("Stub!"); } 
/* 124 */   public final void invalidateChild(View child, Rect dirty) { throw new RuntimeException("Stub!"); } 
/* 125 */   public ViewParent invalidateChildInParent(int[] location, Rect dirty) { throw new RuntimeException("Stub!"); } 
/* 126 */   public final void offsetDescendantRectToMyCoords(View descendant, Rect rect) { throw new RuntimeException("Stub!"); } 
/* 127 */   public final void offsetRectIntoDescendantCoords(View descendant, Rect rect) { throw new RuntimeException("Stub!"); } 
/* 128 */   public boolean getChildVisibleRect(View child, Rect r, Point offset) { throw new RuntimeException("Stub!"); } 
/* 129 */   public final void layout(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/*     */   protected abstract void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */ 
/* 131 */   protected boolean canAnimate() { throw new RuntimeException("Stub!"); } 
/* 132 */   public void startLayoutAnimation() { throw new RuntimeException("Stub!"); } 
/* 133 */   public void scheduleLayoutAnimation() { throw new RuntimeException("Stub!"); } 
/* 134 */   public void setLayoutAnimation(LayoutAnimationController controller) { throw new RuntimeException("Stub!"); } 
/* 135 */   public LayoutAnimationController getLayoutAnimation() { throw new RuntimeException("Stub!"); } 
/* 136 */   public boolean isAnimationCacheEnabled() { throw new RuntimeException("Stub!"); } 
/* 137 */   public void setAnimationCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 138 */   public boolean isAlwaysDrawnWithCacheEnabled() { throw new RuntimeException("Stub!"); } 
/* 139 */   public void setAlwaysDrawnWithCacheEnabled(boolean always) { throw new RuntimeException("Stub!"); } 
/* 140 */   protected boolean isChildrenDrawnWithCacheEnabled() { throw new RuntimeException("Stub!"); } 
/* 141 */   protected void setChildrenDrawnWithCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 142 */   protected boolean isChildrenDrawingOrderEnabled() { throw new RuntimeException("Stub!"); } 
/* 143 */   protected void setChildrenDrawingOrderEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 144 */   public int getPersistentDrawingCache() { throw new RuntimeException("Stub!"); } 
/* 145 */   public void setPersistentDrawingCache(int drawingCacheToKeep) { throw new RuntimeException("Stub!"); } 
/* 146 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 147 */   protected LayoutParams generateLayoutParams(LayoutParams p) { throw new RuntimeException("Stub!"); } 
/* 148 */   protected LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 149 */   protected void debug(int depth) { throw new RuntimeException("Stub!"); } 
/* 150 */   public int indexOfChild(View child) { throw new RuntimeException("Stub!"); } 
/* 151 */   public int getChildCount() { throw new RuntimeException("Stub!"); } 
/* 152 */   public View getChildAt(int index) { throw new RuntimeException("Stub!"); } 
/* 153 */   protected void measureChildren(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 154 */   protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 155 */   protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) { throw new RuntimeException("Stub!"); } 
/* 156 */   public static int getChildMeasureSpec(int spec, int padding, int childDimension) { throw new RuntimeException("Stub!"); } 
/* 157 */   public void clearDisappearingChildren() { throw new RuntimeException("Stub!"); } 
/* 158 */   public void startViewTransition(View view) { throw new RuntimeException("Stub!"); } 
/* 159 */   public void endViewTransition(View view) { throw new RuntimeException("Stub!"); } 
/* 160 */   public boolean gatherTransparentRegion(Region region) { throw new RuntimeException("Stub!"); } 
/* 161 */   public void requestTransparentRegion(View child) { throw new RuntimeException("Stub!"); } 
/* 162 */   protected boolean fitSystemWindows(Rect insets) { throw new RuntimeException("Stub!"); } 
/* 163 */   public Animation.AnimationListener getLayoutAnimationListener() { throw new RuntimeException("Stub!"); } 
/* 164 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 165 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 166 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 167 */   public void setAddStatesFromChildren(boolean addsStates) { throw new RuntimeException("Stub!"); } 
/* 168 */   public boolean addStatesFromChildren() { throw new RuntimeException("Stub!"); } 
/* 169 */   public void childDrawableStateChanged(View child) { throw new RuntimeException("Stub!"); } 
/* 170 */   public void setLayoutAnimationListener(Animation.AnimationListener animationListener) { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static class MarginLayoutParams extends ViewGroup.LayoutParams
/*     */   {
/*     */     public int leftMargin;
/*     */     public int topMargin;
/*     */     public int rightMargin;
/*     */     public int bottomMargin;
/*     */ 
/*     */     public MarginLayoutParams(Context c, AttributeSet attrs)
/*     */     {
/*  27 */       super(); throw new RuntimeException("Stub!"); } 
/*  28 */     public MarginLayoutParams(int width, int height) { super(); throw new RuntimeException("Stub!"); } 
/*  29 */     public MarginLayoutParams(MarginLayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/*  30 */     public MarginLayoutParams(ViewGroup.LayoutParams source) { super(); throw new RuntimeException("Stub!"); } 
/*  31 */     public void setMargins(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class LayoutParams
/*     */   {
/*     */     public static final int FILL_PARENT = -1;
/*     */     public static final int MATCH_PARENT = -1;
/*     */     public static final int WRAP_CONTENT = -2;
/*     */     public int width;
/*     */     public int height;
/*     */     public LayoutAnimationController.AnimationParameters layoutAnimationParameters;
/*     */ 
/*     */     public LayoutParams(Context c, AttributeSet attrs)
/*     */     {
/*  13 */       throw new RuntimeException("Stub!"); } 
/*  14 */     public LayoutParams(int width, int height) { throw new RuntimeException("Stub!"); } 
/*  15 */     public LayoutParams(LayoutParams source) { throw new RuntimeException("Stub!"); } 
/*  16 */     protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface OnHierarchyChangeListener
/*     */   {
/*     */     public abstract void onChildViewAdded(View paramView1, View paramView2);
/*     */ 
/*     */     public abstract void onChildViewRemoved(View paramView1, View paramView2);
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.ViewGroup
 * JD-Core Version:    0.6.0
 */