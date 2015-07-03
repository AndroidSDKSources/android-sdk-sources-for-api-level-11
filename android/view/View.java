/*     */ package android.view;
/*     */ 
/*     */ import android.content.ClipData;
/*     */ import android.content.Context;
/*     */ import android.content.res.Configuration;
/*     */ import android.content.res.Resources;
/*     */ import android.content.res.TypedArray;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Matrix;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Point;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.graphics.drawable.Drawable.Callback;
/*     */ import android.os.Handler;
/*     */ import android.os.IBinder;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.SparseArray;
/*     */ import android.view.accessibility.AccessibilityEvent;
/*     */ import android.view.accessibility.AccessibilityEventSource;
/*     */ import android.view.animation.Animation;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class View
/*     */   implements Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource
/*     */ {
/*     */   protected static final String VIEW_LOG_TAG = "View";
/*     */   public static final int NO_ID = -1;
/*     */   public static final int VISIBLE = 0;
/*     */   public static final int INVISIBLE = 4;
/*     */   public static final int GONE = 8;
/*     */   public static final int DRAWING_CACHE_QUALITY_LOW = 524288;
/*     */   public static final int DRAWING_CACHE_QUALITY_HIGH = 1048576;
/*     */   public static final int DRAWING_CACHE_QUALITY_AUTO = 0;
/*     */   public static final int SCROLLBARS_INSIDE_OVERLAY = 0;
/*     */   public static final int SCROLLBARS_INSIDE_INSET = 16777216;
/*     */   public static final int SCROLLBARS_OUTSIDE_OVERLAY = 33554432;
/*     */   public static final int SCROLLBARS_OUTSIDE_INSET = 50331648;
/*     */   public static final int KEEP_SCREEN_ON = 67108864;
/*     */   public static final int SOUND_EFFECTS_ENABLED = 134217728;
/*     */   public static final int HAPTIC_FEEDBACK_ENABLED = 268435456;
/*     */   public static final int FOCUSABLES_ALL = 0;
/*     */   public static final int FOCUSABLES_TOUCH_MODE = 1;
/*     */   public static final int FOCUS_BACKWARD = 1;
/*     */   public static final int FOCUS_FORWARD = 2;
/*     */   public static final int FOCUS_LEFT = 17;
/*     */   public static final int FOCUS_UP = 33;
/*     */   public static final int FOCUS_RIGHT = 66;
/*     */   public static final int FOCUS_DOWN = 130;
/*     */   public static final int MEASURED_SIZE_MASK = 16777215;
/*     */   public static final int MEASURED_STATE_MASK = -16777216;
/*     */   public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
/*     */   public static final int MEASURED_STATE_TOO_SMALL = 16777216;
/* 445 */   protected static final int[] EMPTY_STATE_SET = null;
/* 446 */   protected static final int[] ENABLED_STATE_SET = null;
/* 447 */   protected static final int[] FOCUSED_STATE_SET = null;
/* 448 */   protected static final int[] SELECTED_STATE_SET = null;
/* 449 */   protected static final int[] WINDOW_FOCUSED_STATE_SET = null;
/* 450 */   protected static final int[] ENABLED_FOCUSED_STATE_SET = null;
/* 451 */   protected static final int[] ENABLED_SELECTED_STATE_SET = null;
/* 452 */   protected static final int[] ENABLED_WINDOW_FOCUSED_STATE_SET = null;
/* 453 */   protected static final int[] FOCUSED_SELECTED_STATE_SET = null;
/* 454 */   protected static final int[] FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 455 */   protected static final int[] SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 456 */   protected static final int[] ENABLED_FOCUSED_SELECTED_STATE_SET = null;
/* 457 */   protected static final int[] ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 458 */   protected static final int[] ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 459 */   protected static final int[] FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 460 */   protected static final int[] ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 461 */   protected static final int[] PRESSED_WINDOW_FOCUSED_STATE_SET = null;
/* 462 */   protected static final int[] PRESSED_SELECTED_STATE_SET = null;
/* 463 */   protected static final int[] PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 464 */   protected static final int[] PRESSED_FOCUSED_STATE_SET = null;
/* 465 */   protected static final int[] PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 466 */   protected static final int[] PRESSED_FOCUSED_SELECTED_STATE_SET = null;
/* 467 */   protected static final int[] PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 468 */   protected static final int[] PRESSED_ENABLED_STATE_SET = null;
/* 469 */   protected static final int[] PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET = null;
/* 470 */   protected static final int[] PRESSED_ENABLED_SELECTED_STATE_SET = null;
/* 471 */   protected static final int[] PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/* 472 */   protected static final int[] PRESSED_ENABLED_FOCUSED_STATE_SET = null;
/* 473 */   protected static final int[] PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
/* 474 */   protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET = null;
/* 475 */   protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
/*     */   public static final int OVER_SCROLL_ALWAYS = 0;
/*     */   public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
/*     */   public static final int OVER_SCROLL_NEVER = 2;
/*     */   public static final int STATUS_BAR_VISIBLE = 0;
/*     */   public static final int STATUS_BAR_HIDDEN = 1;
/*     */   public static final int SCROLLBAR_POSITION_DEFAULT = 0;
/*     */   public static final int SCROLLBAR_POSITION_LEFT = 1;
/*     */   public static final int SCROLLBAR_POSITION_RIGHT = 2;
/*     */   public static final int LAYER_TYPE_NONE = 0;
/*     */   public static final int LAYER_TYPE_SOFTWARE = 1;
/*     */   public static final int LAYER_TYPE_HARDWARE = 2;
/*     */ 
/*     */   public View(Context context)
/*     */   {
/*  68 */     throw new RuntimeException("Stub!"); } 
/*  69 */   public View(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/*  70 */   public View(Context context, AttributeSet attrs, int defStyle) { throw new RuntimeException("Stub!"); } 
/*  71 */   protected void initializeFadingEdge(TypedArray a) { throw new RuntimeException("Stub!"); } 
/*  72 */   public int getVerticalFadingEdgeLength() { throw new RuntimeException("Stub!"); } 
/*  73 */   public void setFadingEdgeLength(int length) { throw new RuntimeException("Stub!"); } 
/*  74 */   public int getHorizontalFadingEdgeLength() { throw new RuntimeException("Stub!"); } 
/*  75 */   public int getVerticalScrollbarWidth() { throw new RuntimeException("Stub!"); } 
/*  76 */   protected int getHorizontalScrollbarHeight() { throw new RuntimeException("Stub!"); } 
/*  77 */   protected void initializeScrollbars(TypedArray a) { throw new RuntimeException("Stub!"); } 
/*  78 */   public void setVerticalScrollbarPosition(int position) { throw new RuntimeException("Stub!"); } 
/*  79 */   public int getVerticalScrollbarPosition() { throw new RuntimeException("Stub!"); } 
/*  80 */   public void setOnFocusChangeListener(OnFocusChangeListener l) { throw new RuntimeException("Stub!"); } 
/*  81 */   public void addOnLayoutChangeListener(OnLayoutChangeListener listener) { throw new RuntimeException("Stub!"); } 
/*  82 */   public void removeOnLayoutChangeListener(OnLayoutChangeListener listener) { throw new RuntimeException("Stub!"); } 
/*  83 */   public OnFocusChangeListener getOnFocusChangeListener() { throw new RuntimeException("Stub!"); } 
/*  84 */   public void setOnClickListener(OnClickListener l) { throw new RuntimeException("Stub!"); } 
/*  85 */   public void setOnLongClickListener(OnLongClickListener l) { throw new RuntimeException("Stub!"); } 
/*  86 */   public void setOnCreateContextMenuListener(OnCreateContextMenuListener l) { throw new RuntimeException("Stub!"); } 
/*  87 */   public boolean performClick() { throw new RuntimeException("Stub!"); } 
/*  88 */   public boolean performLongClick() { throw new RuntimeException("Stub!"); } 
/*  89 */   public boolean showContextMenu() { throw new RuntimeException("Stub!"); } 
/*  90 */   public ActionMode startActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); } 
/*  91 */   public void setOnKeyListener(OnKeyListener l) { throw new RuntimeException("Stub!"); } 
/*  92 */   public void setOnTouchListener(OnTouchListener l) { throw new RuntimeException("Stub!"); } 
/*  93 */   public void setOnDragListener(OnDragListener l) { throw new RuntimeException("Stub!"); } 
/*  94 */   public boolean requestRectangleOnScreen(Rect rectangle) { throw new RuntimeException("Stub!"); } 
/*  95 */   public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); } 
/*  96 */   public void clearFocus() { throw new RuntimeException("Stub!"); } 
/*  97 */   public boolean hasFocus() { throw new RuntimeException("Stub!"); } 
/*  98 */   public boolean hasFocusable() { throw new RuntimeException("Stub!"); } 
/*  99 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 100 */   public void sendAccessibilityEvent(int eventType) { throw new RuntimeException("Stub!"); } 
/* 101 */   public void sendAccessibilityEventUnchecked(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 102 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 103 */   public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); } 
/* 104 */   public void setContentDescription(CharSequence contentDescription) { throw new RuntimeException("Stub!"); } 
/* 105 */   public boolean isFocused() { throw new RuntimeException("Stub!"); } 
/* 106 */   public View findFocus() { throw new RuntimeException("Stub!"); } 
/* 107 */   public void setScrollContainer(boolean isScrollContainer) { throw new RuntimeException("Stub!"); } 
/* 108 */   public int getDrawingCacheQuality() { throw new RuntimeException("Stub!"); } 
/* 109 */   public void setDrawingCacheQuality(int quality) { throw new RuntimeException("Stub!"); } 
/* 110 */   public boolean getKeepScreenOn() { throw new RuntimeException("Stub!"); } 
/* 111 */   public void setKeepScreenOn(boolean keepScreenOn) { throw new RuntimeException("Stub!"); } 
/* 112 */   public int getNextFocusLeftId() { throw new RuntimeException("Stub!"); } 
/* 113 */   public void setNextFocusLeftId(int nextFocusLeftId) { throw new RuntimeException("Stub!"); } 
/* 114 */   public int getNextFocusRightId() { throw new RuntimeException("Stub!"); } 
/* 115 */   public void setNextFocusRightId(int nextFocusRightId) { throw new RuntimeException("Stub!"); } 
/* 116 */   public int getNextFocusUpId() { throw new RuntimeException("Stub!"); } 
/* 117 */   public void setNextFocusUpId(int nextFocusUpId) { throw new RuntimeException("Stub!"); } 
/* 118 */   public int getNextFocusDownId() { throw new RuntimeException("Stub!"); } 
/* 119 */   public void setNextFocusDownId(int nextFocusDownId) { throw new RuntimeException("Stub!"); } 
/* 120 */   public int getNextFocusForwardId() { throw new RuntimeException("Stub!"); } 
/* 121 */   public void setNextFocusForwardId(int nextFocusForwardId) { throw new RuntimeException("Stub!"); } 
/* 122 */   public boolean isShown() { throw new RuntimeException("Stub!"); } 
/* 123 */   protected boolean fitSystemWindows(Rect insets) { throw new RuntimeException("Stub!"); } 
/* 124 */   public int getVisibility() { throw new RuntimeException("Stub!"); } 
/* 125 */   public void setVisibility(int visibility) { throw new RuntimeException("Stub!"); } 
/* 126 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); } 
/* 127 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 128 */   public void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); } 
/* 129 */   public void setFocusableInTouchMode(boolean focusableInTouchMode) { throw new RuntimeException("Stub!"); } 
/* 130 */   public void setSoundEffectsEnabled(boolean soundEffectsEnabled) { throw new RuntimeException("Stub!"); } 
/* 131 */   public boolean isSoundEffectsEnabled() { throw new RuntimeException("Stub!"); } 
/* 132 */   public void setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) { throw new RuntimeException("Stub!"); } 
/* 133 */   public boolean isHapticFeedbackEnabled() { throw new RuntimeException("Stub!"); } 
/* 134 */   public void setWillNotDraw(boolean willNotDraw) { throw new RuntimeException("Stub!"); } 
/* 135 */   public boolean willNotDraw() { throw new RuntimeException("Stub!"); } 
/* 136 */   public void setWillNotCacheDrawing(boolean willNotCacheDrawing) { throw new RuntimeException("Stub!"); } 
/* 137 */   public boolean willNotCacheDrawing() { throw new RuntimeException("Stub!"); } 
/* 138 */   public boolean isClickable() { throw new RuntimeException("Stub!"); } 
/* 139 */   public void setClickable(boolean clickable) { throw new RuntimeException("Stub!"); } 
/* 140 */   public boolean isLongClickable() { throw new RuntimeException("Stub!"); } 
/* 141 */   public void setLongClickable(boolean longClickable) { throw new RuntimeException("Stub!"); } 
/* 142 */   public void setPressed(boolean pressed) { throw new RuntimeException("Stub!"); } 
/* 143 */   protected void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); } 
/* 144 */   public boolean isPressed() { throw new RuntimeException("Stub!"); } 
/* 145 */   public boolean isSaveEnabled() { throw new RuntimeException("Stub!"); } 
/* 146 */   public void setSaveEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 147 */   public boolean getFilterTouchesWhenObscured() { throw new RuntimeException("Stub!"); } 
/* 148 */   public void setFilterTouchesWhenObscured(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 149 */   public boolean isSaveFromParentEnabled() { throw new RuntimeException("Stub!"); } 
/* 150 */   public void setSaveFromParentEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 151 */   public final boolean isFocusable() { throw new RuntimeException("Stub!"); } 
/* 152 */   public final boolean isFocusableInTouchMode() { throw new RuntimeException("Stub!"); } 
/* 153 */   public View focusSearch(int direction) { throw new RuntimeException("Stub!"); } 
/* 154 */   public boolean dispatchUnhandledMove(View focused, int direction) { throw new RuntimeException("Stub!"); } 
/* 155 */   public ArrayList<View> getFocusables(int direction) { throw new RuntimeException("Stub!"); } 
/* 156 */   public void addFocusables(ArrayList<View> views, int direction) { throw new RuntimeException("Stub!"); } 
/* 157 */   public void addFocusables(ArrayList<View> views, int direction, int focusableMode) { throw new RuntimeException("Stub!"); } 
/* 158 */   public ArrayList<View> getTouchables() { throw new RuntimeException("Stub!"); } 
/* 159 */   public void addTouchables(ArrayList<View> views) { throw new RuntimeException("Stub!"); } 
/* 160 */   public final boolean requestFocus() { throw new RuntimeException("Stub!"); } 
/* 161 */   public final boolean requestFocus(int direction) { throw new RuntimeException("Stub!"); } 
/* 162 */   public boolean requestFocus(int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 163 */   public final boolean requestFocusFromTouch() { throw new RuntimeException("Stub!"); } 
/* 164 */   public void onStartTemporaryDetach() { throw new RuntimeException("Stub!"); } 
/* 165 */   public void onFinishTemporaryDetach() { throw new RuntimeException("Stub!"); } 
/* 166 */   public KeyEvent.DispatcherState getKeyDispatcherState() { throw new RuntimeException("Stub!"); } 
/* 167 */   public boolean dispatchKeyEventPreIme(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 168 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 169 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 170 */   public boolean dispatchTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 171 */   public boolean onFilterTouchEventForSecurity(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 172 */   public boolean dispatchTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 173 */   public void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); } 
/* 174 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); } 
/* 175 */   public boolean hasWindowFocus() { throw new RuntimeException("Stub!"); } 
/* 176 */   protected void dispatchVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); } 
/* 177 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); } 
/* 178 */   public void dispatchDisplayHint(int hint) { throw new RuntimeException("Stub!"); } 
/* 179 */   protected void onDisplayHint(int hint) { throw new RuntimeException("Stub!"); } 
/* 180 */   public void dispatchWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); } 
/* 181 */   protected void onWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); } 
/* 182 */   public int getWindowVisibility() { throw new RuntimeException("Stub!"); } 
/* 183 */   public void getWindowVisibleDisplayFrame(Rect outRect) { throw new RuntimeException("Stub!"); } 
/* 184 */   public void dispatchConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 185 */   protected void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 186 */   public boolean isInTouchMode() { throw new RuntimeException("Stub!"); } 
/* 187 */   public final Context getContext() { throw new RuntimeException("Stub!"); } 
/* 188 */   public boolean onKeyPreIme(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 189 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 190 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 191 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 192 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 193 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 194 */   public boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); } 
/* 195 */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) { throw new RuntimeException("Stub!"); } 
/* 196 */   public boolean checkInputConnectionProxy(View view) { throw new RuntimeException("Stub!"); } 
/* 197 */   public void createContextMenu(ContextMenu menu) { throw new RuntimeException("Stub!"); } 
/* 198 */   protected ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); } 
/* 199 */   protected void onCreateContextMenu(ContextMenu menu) { throw new RuntimeException("Stub!"); } 
/* 200 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 201 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 202 */   public void cancelLongPress() { throw new RuntimeException("Stub!"); } 
/* 203 */   public void setTouchDelegate(TouchDelegate delegate) { throw new RuntimeException("Stub!"); } 
/* 204 */   public TouchDelegate getTouchDelegate() { throw new RuntimeException("Stub!"); } 
/* 205 */   public void bringToFront() { throw new RuntimeException("Stub!"); } 
/* 206 */   protected void onScrollChanged(int l, int t, int oldl, int oldt) { throw new RuntimeException("Stub!"); } 
/* 207 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); } 
/* 208 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 209 */   public final ViewParent getParent() { throw new RuntimeException("Stub!"); } 
/* 210 */   public final int getScrollX() { throw new RuntimeException("Stub!"); } 
/* 211 */   public final int getScrollY() { throw new RuntimeException("Stub!"); } 
/* 212 */   public final int getWidth() { throw new RuntimeException("Stub!"); } 
/* 213 */   public final int getHeight() { throw new RuntimeException("Stub!"); } 
/* 214 */   public void getDrawingRect(Rect outRect) { throw new RuntimeException("Stub!"); } 
/* 215 */   public final int getMeasuredWidth() { throw new RuntimeException("Stub!"); } 
/* 216 */   public final int getMeasuredWidthAndState() { throw new RuntimeException("Stub!"); } 
/* 217 */   public final int getMeasuredHeight() { throw new RuntimeException("Stub!"); } 
/* 218 */   public final int getMeasuredHeightAndState() { throw new RuntimeException("Stub!"); } 
/* 219 */   public final int getMeasuredState() { throw new RuntimeException("Stub!"); } 
/* 220 */   public Matrix getMatrix() { throw new RuntimeException("Stub!"); } 
/* 221 */   public float getRotation() { throw new RuntimeException("Stub!"); } 
/* 222 */   public void setRotation(float rotation) { throw new RuntimeException("Stub!"); } 
/* 223 */   public float getRotationY() { throw new RuntimeException("Stub!"); } 
/* 224 */   public void setRotationY(float rotationY) { throw new RuntimeException("Stub!"); } 
/* 225 */   public float getRotationX() { throw new RuntimeException("Stub!"); } 
/* 226 */   public void setRotationX(float rotationX) { throw new RuntimeException("Stub!"); } 
/* 227 */   public float getScaleX() { throw new RuntimeException("Stub!"); } 
/* 228 */   public void setScaleX(float scaleX) { throw new RuntimeException("Stub!"); } 
/* 229 */   public float getScaleY() { throw new RuntimeException("Stub!"); } 
/* 230 */   public void setScaleY(float scaleY) { throw new RuntimeException("Stub!"); } 
/* 231 */   public float getPivotX() { throw new RuntimeException("Stub!"); } 
/* 232 */   public void setPivotX(float pivotX) { throw new RuntimeException("Stub!"); } 
/* 233 */   public float getPivotY() { throw new RuntimeException("Stub!"); } 
/* 234 */   public void setPivotY(float pivotY) { throw new RuntimeException("Stub!"); } 
/* 235 */   public float getAlpha() { throw new RuntimeException("Stub!"); } 
/* 236 */   public void setAlpha(float alpha) { throw new RuntimeException("Stub!"); } 
/* 237 */   public final int getTop() { throw new RuntimeException("Stub!"); } 
/* 238 */   public final void setTop(int top) { throw new RuntimeException("Stub!"); } 
/* 239 */   public final int getBottom() { throw new RuntimeException("Stub!"); } 
/* 240 */   public boolean isDirty() { throw new RuntimeException("Stub!"); } 
/* 241 */   public final void setBottom(int bottom) { throw new RuntimeException("Stub!"); } 
/* 242 */   public final int getLeft() { throw new RuntimeException("Stub!"); } 
/* 243 */   public final void setLeft(int left) { throw new RuntimeException("Stub!"); } 
/* 244 */   public final int getRight() { throw new RuntimeException("Stub!"); } 
/* 245 */   public final void setRight(int right) { throw new RuntimeException("Stub!"); } 
/* 246 */   public float getX() { throw new RuntimeException("Stub!"); } 
/* 247 */   public void setX(float x) { throw new RuntimeException("Stub!"); } 
/* 248 */   public float getY() { throw new RuntimeException("Stub!"); } 
/* 249 */   public void setY(float y) { throw new RuntimeException("Stub!"); } 
/* 250 */   public float getTranslationX() { throw new RuntimeException("Stub!"); } 
/* 251 */   public void setTranslationX(float translationX) { throw new RuntimeException("Stub!"); } 
/* 252 */   public float getTranslationY() { throw new RuntimeException("Stub!"); } 
/* 253 */   public void setTranslationY(float translationY) { throw new RuntimeException("Stub!"); } 
/* 254 */   public void getHitRect(Rect outRect) { throw new RuntimeException("Stub!"); } 
/* 255 */   public void getFocusedRect(Rect r) { throw new RuntimeException("Stub!"); } 
/* 256 */   public boolean getGlobalVisibleRect(Rect r, Point globalOffset) { throw new RuntimeException("Stub!"); } 
/* 257 */   public final boolean getGlobalVisibleRect(Rect r) { throw new RuntimeException("Stub!"); } 
/* 258 */   public final boolean getLocalVisibleRect(Rect r) { throw new RuntimeException("Stub!"); } 
/* 259 */   public void offsetTopAndBottom(int offset) { throw new RuntimeException("Stub!"); } 
/* 260 */   public void offsetLeftAndRight(int offset) { throw new RuntimeException("Stub!"); } 
/* 261 */   public ViewGroup.LayoutParams getLayoutParams() { throw new RuntimeException("Stub!"); } 
/* 262 */   public void setLayoutParams(ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 263 */   public void scrollTo(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 264 */   public void scrollBy(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 265 */   protected boolean awakenScrollBars() { throw new RuntimeException("Stub!"); } 
/* 266 */   protected boolean awakenScrollBars(int startDelay) { throw new RuntimeException("Stub!"); } 
/* 267 */   protected boolean awakenScrollBars(int startDelay, boolean invalidate) { throw new RuntimeException("Stub!"); } 
/* 268 */   public void invalidate(Rect dirty) { throw new RuntimeException("Stub!"); } 
/* 269 */   public void invalidate(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 270 */   public void invalidate() { throw new RuntimeException("Stub!"); } 
/* 271 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); } 
/* 272 */   public Handler getHandler() { throw new RuntimeException("Stub!"); } 
/* 273 */   public boolean post(Runnable action) { throw new RuntimeException("Stub!"); } 
/* 274 */   public boolean postDelayed(Runnable action, long delayMillis) { throw new RuntimeException("Stub!"); } 
/* 275 */   public boolean removeCallbacks(Runnable action) { throw new RuntimeException("Stub!"); } 
/* 276 */   public void postInvalidate() { throw new RuntimeException("Stub!"); } 
/* 277 */   public void postInvalidate(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 278 */   public void postInvalidateDelayed(long delayMilliseconds) { throw new RuntimeException("Stub!"); } 
/* 279 */   public void postInvalidateDelayed(long delayMilliseconds, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 280 */   public void computeScroll() { throw new RuntimeException("Stub!"); } 
/* 281 */   public boolean isHorizontalFadingEdgeEnabled() { throw new RuntimeException("Stub!"); } 
/* 282 */   public void setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) { throw new RuntimeException("Stub!"); } 
/* 283 */   public boolean isVerticalFadingEdgeEnabled() { throw new RuntimeException("Stub!"); } 
/* 284 */   public void setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) { throw new RuntimeException("Stub!"); } 
/* 285 */   protected float getTopFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 286 */   protected float getBottomFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 287 */   protected float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 288 */   protected float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 289 */   public boolean isHorizontalScrollBarEnabled() { throw new RuntimeException("Stub!"); } 
/* 290 */   public void setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) { throw new RuntimeException("Stub!"); } 
/* 291 */   public boolean isVerticalScrollBarEnabled() { throw new RuntimeException("Stub!"); } 
/* 292 */   public void setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) { throw new RuntimeException("Stub!"); } 
/* 293 */   public void setScrollbarFadingEnabled(boolean fadeScrollbars) { throw new RuntimeException("Stub!"); } 
/* 294 */   public boolean isScrollbarFadingEnabled() { throw new RuntimeException("Stub!"); } 
/* 295 */   public void setScrollBarStyle(int style) { throw new RuntimeException("Stub!"); } 
/* 296 */   public int getScrollBarStyle() { throw new RuntimeException("Stub!"); } 
/* 297 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 298 */   protected int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); } 
/* 299 */   protected int computeHorizontalScrollExtent() { throw new RuntimeException("Stub!"); } 
/* 300 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 301 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); } 
/* 302 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); } 
/* 303 */   protected final void onDrawScrollBars(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 304 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 305 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 306 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 307 */   protected int getWindowAttachCount() { throw new RuntimeException("Stub!"); } 
/* 308 */   public IBinder getWindowToken() { throw new RuntimeException("Stub!"); } 
/* 309 */   public IBinder getApplicationWindowToken() { throw new RuntimeException("Stub!"); } 
/* 310 */   public void saveHierarchyState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 311 */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 312 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 313 */   public void restoreHierarchyState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 314 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); } 
/* 315 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 316 */   public long getDrawingTime() { throw new RuntimeException("Stub!"); } 
/* 317 */   public void setDuplicateParentStateEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 318 */   public boolean isDuplicateParentStateEnabled() { throw new RuntimeException("Stub!"); } 
/* 319 */   public void setLayerType(int layerType, Paint paint) { throw new RuntimeException("Stub!"); } 
/* 320 */   public int getLayerType() { throw new RuntimeException("Stub!"); } 
/* 321 */   public void setDrawingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 322 */   public boolean isDrawingCacheEnabled() { throw new RuntimeException("Stub!"); } 
/* 323 */   public Bitmap getDrawingCache() { throw new RuntimeException("Stub!"); } 
/* 324 */   public Bitmap getDrawingCache(boolean autoScale) { throw new RuntimeException("Stub!"); } 
/* 325 */   public void destroyDrawingCache() { throw new RuntimeException("Stub!"); } 
/* 326 */   public void setDrawingCacheBackgroundColor(int color) { throw new RuntimeException("Stub!"); } 
/* 327 */   public int getDrawingCacheBackgroundColor() { throw new RuntimeException("Stub!"); } 
/* 328 */   public void buildDrawingCache() { throw new RuntimeException("Stub!"); } 
/* 329 */   public void buildDrawingCache(boolean autoScale) { throw new RuntimeException("Stub!"); } 
/* 330 */   public boolean isInEditMode() { throw new RuntimeException("Stub!"); } 
/* 331 */   protected boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); } 
/* 332 */   protected int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 333 */   protected int getRightPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 334 */   protected int getTopPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 335 */   protected int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 336 */   public boolean isHardwareAccelerated() { throw new RuntimeException("Stub!"); } 
/* 337 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 338 */   public int getSolidColor() { throw new RuntimeException("Stub!"); } 
/* 339 */   public boolean isLayoutRequested() { throw new RuntimeException("Stub!"); } 
/* 340 */   public void layout(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 341 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 342 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); } 
/* 343 */   public Resources getResources() { throw new RuntimeException("Stub!"); } 
/* 344 */   public void invalidateDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 345 */   public void scheduleDrawable(Drawable who, Runnable what, long when) { throw new RuntimeException("Stub!"); } 
/* 346 */   public void unscheduleDrawable(Drawable who, Runnable what) { throw new RuntimeException("Stub!"); } 
/* 347 */   public void unscheduleDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 348 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 349 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 350 */   public void refreshDrawableState() { throw new RuntimeException("Stub!"); } 
/* 351 */   public final int[] getDrawableState() { throw new RuntimeException("Stub!"); } 
/* 352 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 353 */   protected static int[] mergeDrawableStates(int[] baseState, int[] additionalState) { throw new RuntimeException("Stub!"); } 
/* 354 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 355 */   public void setBackgroundColor(int color) { throw new RuntimeException("Stub!"); } 
/* 356 */   public void setBackgroundResource(int resid) { throw new RuntimeException("Stub!"); } 
/* 357 */   public void setBackgroundDrawable(Drawable d) { throw new RuntimeException("Stub!"); } 
/* 358 */   public Drawable getBackground() { throw new RuntimeException("Stub!"); } 
/* 359 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/* 360 */   public int getPaddingTop() { throw new RuntimeException("Stub!"); } 
/* 361 */   public int getPaddingBottom() { throw new RuntimeException("Stub!"); } 
/* 362 */   public int getPaddingLeft() { throw new RuntimeException("Stub!"); } 
/* 363 */   public int getPaddingRight() { throw new RuntimeException("Stub!"); } 
/* 364 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/* 365 */   protected void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/* 366 */   public boolean isSelected() { throw new RuntimeException("Stub!"); } 
/* 367 */   public void setActivated(boolean activated) { throw new RuntimeException("Stub!"); } 
/* 368 */   protected void dispatchSetActivated(boolean activated) { throw new RuntimeException("Stub!"); } 
/* 369 */   public boolean isActivated() { throw new RuntimeException("Stub!"); } 
/* 370 */   public ViewTreeObserver getViewTreeObserver() { throw new RuntimeException("Stub!"); } 
/* 371 */   public View getRootView() { throw new RuntimeException("Stub!"); } 
/* 372 */   public void getLocationOnScreen(int[] location) { throw new RuntimeException("Stub!"); } 
/* 373 */   public void getLocationInWindow(int[] location) { throw new RuntimeException("Stub!"); } 
/* 374 */   public final View findViewById(int id) { throw new RuntimeException("Stub!"); } 
/* 375 */   public final View findViewWithTag(Object tag) { throw new RuntimeException("Stub!"); } 
/* 376 */   public void setId(int id) { throw new RuntimeException("Stub!"); } 
/* 377 */   public int getId() { throw new RuntimeException("Stub!"); } 
/* 378 */   public Object getTag() { throw new RuntimeException("Stub!"); } 
/* 379 */   public void setTag(Object tag) { throw new RuntimeException("Stub!"); } 
/* 380 */   public Object getTag(int key) { throw new RuntimeException("Stub!"); } 
/* 381 */   public void setTag(int key, Object tag) { throw new RuntimeException("Stub!"); } 
/* 382 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 383 */   public void requestLayout() { throw new RuntimeException("Stub!"); } 
/* 384 */   public void forceLayout() { throw new RuntimeException("Stub!"); } 
/* 385 */   public final void measure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 386 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 387 */   protected final void setMeasuredDimension(int measuredWidth, int measuredHeight) { throw new RuntimeException("Stub!"); } 
/* 388 */   public static int combineMeasuredStates(int curState, int newState) { throw new RuntimeException("Stub!"); } 
/* 389 */   public static int resolveSize(int size, int measureSpec) { throw new RuntimeException("Stub!"); } 
/* 390 */   public static int resolveSizeAndState(int size, int measureSpec, int childMeasuredState) { throw new RuntimeException("Stub!"); } 
/* 391 */   public static int getDefaultSize(int size, int measureSpec) { throw new RuntimeException("Stub!"); } 
/* 392 */   protected int getSuggestedMinimumHeight() { throw new RuntimeException("Stub!"); } 
/* 393 */   protected int getSuggestedMinimumWidth() { throw new RuntimeException("Stub!"); } 
/* 394 */   public void setMinimumHeight(int minHeight) { throw new RuntimeException("Stub!"); } 
/* 395 */   public void setMinimumWidth(int minWidth) { throw new RuntimeException("Stub!"); } 
/* 396 */   public Animation getAnimation() { throw new RuntimeException("Stub!"); } 
/* 397 */   public void startAnimation(Animation animation) { throw new RuntimeException("Stub!"); } 
/* 398 */   public void clearAnimation() { throw new RuntimeException("Stub!"); } 
/* 399 */   public void setAnimation(Animation animation) { throw new RuntimeException("Stub!"); } 
/* 400 */   protected void onAnimationStart() { throw new RuntimeException("Stub!"); } 
/* 401 */   protected void onAnimationEnd() { throw new RuntimeException("Stub!"); } 
/* 402 */   protected boolean onSetAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 403 */   public void playSoundEffect(int soundConstant) { throw new RuntimeException("Stub!"); } 
/* 404 */   public boolean performHapticFeedback(int feedbackConstant) { throw new RuntimeException("Stub!"); } 
/* 405 */   public boolean performHapticFeedback(int feedbackConstant, int flags) { throw new RuntimeException("Stub!"); } 
/* 406 */   public void setSystemUiVisibility(int visibility) { throw new RuntimeException("Stub!"); } 
/* 407 */   public int getSystemUiVisibility() { throw new RuntimeException("Stub!"); } 
/* 408 */   public void setOnSystemUiVisibilityChangeListener(OnSystemUiVisibilityChangeListener l) { throw new RuntimeException("Stub!"); } 
/* 409 */   public void dispatchSystemUiVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); } 
/* 410 */   public final boolean startDrag(ClipData data, DragShadowBuilder shadowBuilder, Object myLocalState, int flags) { throw new RuntimeException("Stub!"); } 
/* 411 */   public boolean onDragEvent(DragEvent event) { throw new RuntimeException("Stub!"); } 
/* 412 */   public boolean dispatchDragEvent(DragEvent event) { throw new RuntimeException("Stub!"); } 
/* 413 */   public static View inflate(Context context, int resource, ViewGroup root) { throw new RuntimeException("Stub!"); } 
/* 414 */   protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) { throw new RuntimeException("Stub!"); } 
/* 415 */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); } 
/* 416 */   public int getOverScrollMode() { throw new RuntimeException("Stub!"); } 
/* 417 */   public void setOverScrollMode(int overScrollMode) { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static class BaseSavedState extends AbsSavedState
/*     */   {
/*  66 */     public static final Parcelable.Creator<BaseSavedState> CREATOR = null;
/*     */ 
/*     */     public BaseSavedState(Parcel source)
/*     */     {
/*  63 */       super(); throw new RuntimeException("Stub!"); } 
/*  64 */     public BaseSavedState(Parcelable superState) { super(); throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface OnSystemUiVisibilityChangeListener
/*     */   {
/*     */     public abstract void onSystemUiVisibilityChange(int paramInt);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnCreateContextMenuListener
/*     */   {
/*     */     public abstract void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnClickListener
/*     */   {
/*     */     public abstract void onClick(View paramView);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnFocusChangeListener
/*     */   {
/*     */     public abstract void onFocusChange(View paramView, boolean paramBoolean);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnDragListener
/*     */   {
/*     */     public abstract boolean onDrag(View paramView, DragEvent paramDragEvent);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnLongClickListener
/*     */   {
/*     */     public abstract boolean onLongClick(View paramView);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnTouchListener
/*     */   {
/*     */     public abstract boolean onTouch(View paramView, MotionEvent paramMotionEvent);
/*     */   }
/*     */ 
/*     */   public static abstract interface OnKeyListener
/*     */   {
/*     */     public abstract boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent);
/*     */   }
/*     */ 
/*     */   public static class MeasureSpec
/*     */   {
/*     */     public static final int UNSPECIFIED = 0;
/*     */     public static final int EXACTLY = 1073741824;
/*     */     public static final int AT_MOST = -2147483648;
/*     */ 
/*     */     public MeasureSpec()
/*     */     {
/*  19 */       throw new RuntimeException("Stub!"); } 
/*  20 */     public static int makeMeasureSpec(int size, int mode) { throw new RuntimeException("Stub!"); } 
/*  21 */     public static int getMode(int measureSpec) { throw new RuntimeException("Stub!"); } 
/*  22 */     public static int getSize(int measureSpec) { throw new RuntimeException("Stub!"); } 
/*  23 */     public static String toString(int measureSpec) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class DragShadowBuilder
/*     */   {
/*     */     public DragShadowBuilder(View view)
/*     */     {
/*  11 */       throw new RuntimeException("Stub!"); } 
/*  12 */     public DragShadowBuilder() { throw new RuntimeException("Stub!"); } 
/*  13 */     public final View getView() { throw new RuntimeException("Stub!"); } 
/*  14 */     public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint) { throw new RuntimeException("Stub!"); } 
/*  15 */     public void onDrawShadow(Canvas canvas) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface OnLayoutChangeListener
/*     */   {
/*     */     public abstract void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.View
 * JD-Core Version:    0.6.0
 */