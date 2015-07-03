/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.ColorStateList;
/*     */ import android.content.res.TypedArray;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Typeface;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.text.Editable;
/*     */ import android.text.Editable.Factory;
/*     */ import android.text.InputFilter;
/*     */ import android.text.Layout;
/*     */ import android.text.Spannable.Factory;
/*     */ import android.text.TextPaint;
/*     */ import android.text.TextUtils.TruncateAt;
/*     */ import android.text.TextWatcher;
/*     */ import android.text.method.KeyListener;
/*     */ import android.text.method.MovementMethod;
/*     */ import android.text.method.TransformationMethod;
/*     */ import android.text.style.URLSpan;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ActionMode.Callback;
/*     */ import android.view.ContextMenu;
/*     */ import android.view.DragEvent;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.View.BaseSavedState;
/*     */ import android.view.ViewTreeObserver.OnPreDrawListener;
/*     */ import android.view.accessibility.AccessibilityEvent;
/*     */ import android.view.inputmethod.CompletionInfo;
/*     */ import android.view.inputmethod.CorrectionInfo;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.ExtractedText;
/*     */ import android.view.inputmethod.ExtractedTextRequest;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import java.io.IOException;
/*     */ import org.xmlpull.v1.XmlPullParserException;
/*     */ 
/*     */ @RemoteViews.RemoteView
/*     */ public class TextView extends View
/*     */   implements ViewTreeObserver.OnPreDrawListener
/*     */ {
/*     */   public TextView(Context context)
/*     */   {
/*  26 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  27 */   public TextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  28 */   public TextView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  29 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  30 */   public void setTypeface(Typeface tf, int style) { throw new RuntimeException("Stub!"); } 
/*  31 */   protected boolean getDefaultEditable() { throw new RuntimeException("Stub!"); } 
/*  32 */   protected MovementMethod getDefaultMovementMethod() { throw new RuntimeException("Stub!"); } 
/*  33 */   public CharSequence getText() { throw new RuntimeException("Stub!"); } 
/*  34 */   public int length() { throw new RuntimeException("Stub!"); } 
/*  35 */   public Editable getEditableText() { throw new RuntimeException("Stub!"); } 
/*  36 */   public int getLineHeight() { throw new RuntimeException("Stub!"); } 
/*  37 */   public final Layout getLayout() { throw new RuntimeException("Stub!"); } 
/*  38 */   public final KeyListener getKeyListener() { throw new RuntimeException("Stub!"); } 
/*  39 */   public void setKeyListener(KeyListener input) { throw new RuntimeException("Stub!"); } 
/*  40 */   public final MovementMethod getMovementMethod() { throw new RuntimeException("Stub!"); } 
/*  41 */   public final void setMovementMethod(MovementMethod movement) { throw new RuntimeException("Stub!"); } 
/*  42 */   public final TransformationMethod getTransformationMethod() { throw new RuntimeException("Stub!"); } 
/*  43 */   public final void setTransformationMethod(TransformationMethod method) { throw new RuntimeException("Stub!"); } 
/*  44 */   public int getCompoundPaddingTop() { throw new RuntimeException("Stub!"); } 
/*  45 */   public int getCompoundPaddingBottom() { throw new RuntimeException("Stub!"); } 
/*  46 */   public int getCompoundPaddingLeft() { throw new RuntimeException("Stub!"); } 
/*  47 */   public int getCompoundPaddingRight() { throw new RuntimeException("Stub!"); } 
/*  48 */   public int getExtendedPaddingTop() { throw new RuntimeException("Stub!"); } 
/*  49 */   public int getExtendedPaddingBottom() { throw new RuntimeException("Stub!"); } 
/*  50 */   public int getTotalPaddingLeft() { throw new RuntimeException("Stub!"); } 
/*  51 */   public int getTotalPaddingRight() { throw new RuntimeException("Stub!"); } 
/*  52 */   public int getTotalPaddingTop() { throw new RuntimeException("Stub!"); } 
/*  53 */   public int getTotalPaddingBottom() { throw new RuntimeException("Stub!"); } 
/*  54 */   public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) { throw new RuntimeException("Stub!"); } 
/*  55 */   public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/*  56 */   public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) { throw new RuntimeException("Stub!"); } 
/*  57 */   public Drawable[] getCompoundDrawables() { throw new RuntimeException("Stub!"); } 
/*  58 */   public void setCompoundDrawablePadding(int pad) { throw new RuntimeException("Stub!"); } 
/*  59 */   public int getCompoundDrawablePadding() { throw new RuntimeException("Stub!"); } 
/*  60 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); } 
/*  61 */   public final int getAutoLinkMask() { throw new RuntimeException("Stub!"); } 
/*  62 */   public void setTextAppearance(Context context, int resid) { throw new RuntimeException("Stub!"); } 
/*  63 */   public float getTextSize() { throw new RuntimeException("Stub!"); } 
/*  64 */   public void setTextSize(float size) { throw new RuntimeException("Stub!"); } 
/*  65 */   public void setTextSize(int unit, float size) { throw new RuntimeException("Stub!"); } 
/*  66 */   public float getTextScaleX() { throw new RuntimeException("Stub!"); } 
/*  67 */   public void setTextScaleX(float size) { throw new RuntimeException("Stub!"); } 
/*  68 */   public void setTypeface(Typeface tf) { throw new RuntimeException("Stub!"); } 
/*  69 */   public Typeface getTypeface() { throw new RuntimeException("Stub!"); } 
/*  70 */   public void setTextColor(int color) { throw new RuntimeException("Stub!"); } 
/*  71 */   public void setTextColor(ColorStateList colors) { throw new RuntimeException("Stub!"); } 
/*  72 */   public final ColorStateList getTextColors() { throw new RuntimeException("Stub!"); } 
/*  73 */   public final int getCurrentTextColor() { throw new RuntimeException("Stub!"); } 
/*  74 */   public void setHighlightColor(int color) { throw new RuntimeException("Stub!"); } 
/*  75 */   public void setShadowLayer(float radius, float dx, float dy, int color) { throw new RuntimeException("Stub!"); } 
/*  76 */   public TextPaint getPaint() { throw new RuntimeException("Stub!"); } 
/*  77 */   public final void setAutoLinkMask(int mask) { throw new RuntimeException("Stub!"); } 
/*  78 */   public final void setLinksClickable(boolean whether) { throw new RuntimeException("Stub!"); } 
/*  79 */   public final boolean getLinksClickable() { throw new RuntimeException("Stub!"); } 
/*  80 */   public URLSpan[] getUrls() { throw new RuntimeException("Stub!"); } 
/*  81 */   public final void setHintTextColor(int color) { throw new RuntimeException("Stub!"); } 
/*  82 */   public final void setHintTextColor(ColorStateList colors) { throw new RuntimeException("Stub!"); } 
/*  83 */   public final ColorStateList getHintTextColors() { throw new RuntimeException("Stub!"); } 
/*  84 */   public final int getCurrentHintTextColor() { throw new RuntimeException("Stub!"); } 
/*  85 */   public final void setLinkTextColor(int color) { throw new RuntimeException("Stub!"); } 
/*  86 */   public final void setLinkTextColor(ColorStateList colors) { throw new RuntimeException("Stub!"); } 
/*  87 */   public final ColorStateList getLinkTextColors() { throw new RuntimeException("Stub!"); } 
/*  88 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); } 
/*  89 */   public int getGravity() { throw new RuntimeException("Stub!"); } 
/*  90 */   public int getPaintFlags() { throw new RuntimeException("Stub!"); } 
/*  91 */   public void setPaintFlags(int flags) { throw new RuntimeException("Stub!"); } 
/*  92 */   public void setHorizontallyScrolling(boolean whether) { throw new RuntimeException("Stub!"); } 
/*  93 */   public void setMinLines(int minlines) { throw new RuntimeException("Stub!"); } 
/*  94 */   public void setMinHeight(int minHeight) { throw new RuntimeException("Stub!"); } 
/*  95 */   public void setMaxLines(int maxlines) { throw new RuntimeException("Stub!"); } 
/*  96 */   public void setMaxHeight(int maxHeight) { throw new RuntimeException("Stub!"); } 
/*  97 */   public void setLines(int lines) { throw new RuntimeException("Stub!"); } 
/*  98 */   public void setHeight(int pixels) { throw new RuntimeException("Stub!"); } 
/*  99 */   public void setMinEms(int minems) { throw new RuntimeException("Stub!"); } 
/* 100 */   public void setMinWidth(int minpixels) { throw new RuntimeException("Stub!"); } 
/* 101 */   public void setMaxEms(int maxems) { throw new RuntimeException("Stub!"); } 
/* 102 */   public void setMaxWidth(int maxpixels) { throw new RuntimeException("Stub!"); } 
/* 103 */   public void setEms(int ems) { throw new RuntimeException("Stub!"); } 
/* 104 */   public void setWidth(int pixels) { throw new RuntimeException("Stub!"); } 
/* 105 */   public void setLineSpacing(float add, float mult) { throw new RuntimeException("Stub!"); } 
/* 106 */   public final void append(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 107 */   public void append(CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 108 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 109 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 110 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); } 
/* 111 */   public void setFreezesText(boolean freezesText) { throw new RuntimeException("Stub!"); } 
/* 112 */   public boolean getFreezesText() { throw new RuntimeException("Stub!"); } 
/* 113 */   public final void setEditableFactory(Editable.Factory factory) { throw new RuntimeException("Stub!"); } 
/* 114 */   public final void setSpannableFactory(Spannable.Factory factory) { throw new RuntimeException("Stub!"); } 
/* 115 */   public final void setText(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 116 */   public final void setTextKeepState(CharSequence text) { throw new RuntimeException("Stub!"); } 
/* 117 */   public void setText(CharSequence text, BufferType type) { throw new RuntimeException("Stub!"); } 
/* 118 */   public final void setText(char[] text, int start, int len) { throw new RuntimeException("Stub!"); } 
/* 119 */   public final void setTextKeepState(CharSequence text, BufferType type) { throw new RuntimeException("Stub!"); } 
/* 120 */   public final void setText(int resid) { throw new RuntimeException("Stub!"); } 
/* 121 */   public final void setText(int resid, BufferType type) { throw new RuntimeException("Stub!"); } 
/* 122 */   public final void setHint(CharSequence hint) { throw new RuntimeException("Stub!"); } 
/* 123 */   public final void setHint(int resid) { throw new RuntimeException("Stub!"); } 
/* 124 */   public CharSequence getHint() { throw new RuntimeException("Stub!"); } 
/* 125 */   public void setInputType(int type) { throw new RuntimeException("Stub!"); } 
/* 126 */   public void setRawInputType(int type) { throw new RuntimeException("Stub!"); } 
/* 127 */   public int getInputType() { throw new RuntimeException("Stub!"); } 
/* 128 */   public void setImeOptions(int imeOptions) { throw new RuntimeException("Stub!"); } 
/* 129 */   public int getImeOptions() { throw new RuntimeException("Stub!"); } 
/* 130 */   public void setImeActionLabel(CharSequence label, int actionId) { throw new RuntimeException("Stub!"); } 
/* 131 */   public CharSequence getImeActionLabel() { throw new RuntimeException("Stub!"); } 
/* 132 */   public int getImeActionId() { throw new RuntimeException("Stub!"); } 
/* 133 */   public void setOnEditorActionListener(OnEditorActionListener l) { throw new RuntimeException("Stub!"); } 
/* 134 */   public void onEditorAction(int actionCode) { throw new RuntimeException("Stub!"); } 
/* 135 */   public void setPrivateImeOptions(String type) { throw new RuntimeException("Stub!"); } 
/* 136 */   public String getPrivateImeOptions() { throw new RuntimeException("Stub!"); } 
/* 137 */   public void setInputExtras(int xmlResId) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/* 138 */   public Bundle getInputExtras(boolean create) { throw new RuntimeException("Stub!"); } 
/* 139 */   public CharSequence getError() { throw new RuntimeException("Stub!"); } 
/* 140 */   public void setError(CharSequence error) { throw new RuntimeException("Stub!"); } 
/* 141 */   public void setError(CharSequence error, Drawable icon) { throw new RuntimeException("Stub!"); } 
/* 142 */   protected boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 143 */   public void setFilters(InputFilter[] filters) { throw new RuntimeException("Stub!"); } 
/* 144 */   public InputFilter[] getFilters() { throw new RuntimeException("Stub!"); } 
/* 145 */   public boolean onPreDraw() { throw new RuntimeException("Stub!"); } 
/* 146 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 147 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 148 */   protected boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); } 
/* 149 */   protected int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 150 */   protected int getTopPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 151 */   protected int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 152 */   protected int getRightPaddingOffset() { throw new RuntimeException("Stub!"); } 
/* 153 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 154 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); } 
/* 155 */   public void invalidateDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 156 */   protected boolean onSetAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 157 */   public boolean isTextSelectable() { throw new RuntimeException("Stub!"); } 
/* 158 */   public void setTextIsSelectable(boolean selectable) { throw new RuntimeException("Stub!"); } 
/* 159 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); } 
/* 160 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 161 */   public void getFocusedRect(Rect r) { throw new RuntimeException("Stub!"); } 
/* 162 */   public int getLineCount() { throw new RuntimeException("Stub!"); } 
/* 163 */   public int getLineBounds(int line, Rect bounds) { throw new RuntimeException("Stub!"); } 
/* 164 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 165 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 166 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 167 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 168 */   public boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); } 
/* 169 */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) { throw new RuntimeException("Stub!"); } 
/* 170 */   public boolean extractText(ExtractedTextRequest request, ExtractedText outText) { throw new RuntimeException("Stub!"); } 
/* 171 */   public void setExtractedText(ExtractedText text) { throw new RuntimeException("Stub!"); } 
/* 172 */   public void onCommitCompletion(CompletionInfo text) { throw new RuntimeException("Stub!"); } 
/* 173 */   public void onCommitCorrection(CorrectionInfo info) { throw new RuntimeException("Stub!"); } 
/* 174 */   public void beginBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 175 */   public void endBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 176 */   public void onBeginBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 177 */   public void onEndBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 178 */   public boolean onPrivateIMECommand(String action, Bundle data) { throw new RuntimeException("Stub!"); } 
/* 179 */   public void setIncludeFontPadding(boolean includepad) { throw new RuntimeException("Stub!"); } 
/* 180 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 181 */   public boolean bringPointIntoView(int offset) { throw new RuntimeException("Stub!"); } 
/* 182 */   public boolean moveCursorToVisibleOffset() { throw new RuntimeException("Stub!"); } 
/* 183 */   public void computeScroll() { throw new RuntimeException("Stub!"); } 
/* 184 */   public void debug(int depth) { throw new RuntimeException("Stub!"); } 
/* 185 */   public int getSelectionStart() { throw new RuntimeException("Stub!"); } 
/* 186 */   public int getSelectionEnd() { throw new RuntimeException("Stub!"); } 
/* 187 */   public boolean hasSelection() { throw new RuntimeException("Stub!"); } 
/* 188 */   public void setSingleLine() { throw new RuntimeException("Stub!"); } 
/* 189 */   public void setSingleLine(boolean singleLine) { throw new RuntimeException("Stub!"); } 
/* 190 */   public void setEllipsize(TextUtils.TruncateAt where) { throw new RuntimeException("Stub!"); } 
/* 191 */   public void setMarqueeRepeatLimit(int marqueeLimit) { throw new RuntimeException("Stub!"); } 
/* 192 */   public TextUtils.TruncateAt getEllipsize() { throw new RuntimeException("Stub!"); } 
/* 193 */   public void setSelectAllOnFocus(boolean selectAllOnFocus) { throw new RuntimeException("Stub!"); } 
/* 194 */   public void setCursorVisible(boolean visible) { throw new RuntimeException("Stub!"); } 
/* 195 */   protected void onTextChanged(CharSequence text, int start, int before, int after) { throw new RuntimeException("Stub!"); } 
/* 196 */   protected void onSelectionChanged(int selStart, int selEnd) { throw new RuntimeException("Stub!"); } 
/* 197 */   public void addTextChangedListener(TextWatcher watcher) { throw new RuntimeException("Stub!"); } 
/* 198 */   public void removeTextChangedListener(TextWatcher watcher) { throw new RuntimeException("Stub!"); } 
/* 199 */   public void onStartTemporaryDetach() { throw new RuntimeException("Stub!"); } 
/* 200 */   public void onFinishTemporaryDetach() { throw new RuntimeException("Stub!"); } 
/* 201 */   protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); } 
/* 202 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); } 
/* 203 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); } 
/* 204 */   public void clearComposingText() { throw new RuntimeException("Stub!"); } 
/* 205 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); } 
/* 206 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 207 */   public boolean didTouchFocusSelect() { throw new RuntimeException("Stub!"); } 
/* 208 */   public void cancelLongPress() { throw new RuntimeException("Stub!"); } 
/* 209 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 210 */   public void setScroller(Scroller s) { throw new RuntimeException("Stub!"); } 
/* 211 */   protected float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 212 */   protected float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); } 
/* 213 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 214 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); } 
/* 215 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); } 
/* 216 */   public static ColorStateList getTextColors(Context context, TypedArray attrs) { throw new RuntimeException("Stub!"); } 
/* 217 */   public static int getTextColor(Context context, TypedArray attrs, int def) { throw new RuntimeException("Stub!"); } 
/* 218 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 219 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 220 */   protected void onCreateContextMenu(ContextMenu menu) { throw new RuntimeException("Stub!"); } 
/* 221 */   public boolean isInputMethodTarget() { throw new RuntimeException("Stub!"); } 
/* 222 */   public boolean onTextContextMenuItem(int id) { throw new RuntimeException("Stub!"); } 
/* 223 */   public boolean performLongClick() { throw new RuntimeException("Stub!"); } 
/* 224 */   public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) { throw new RuntimeException("Stub!"); } 
/* 225 */   public ActionMode.Callback getCustomSelectionActionModeCallback() { throw new RuntimeException("Stub!"); } 
/* 226 */   public boolean onDragEvent(DragEvent event) { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static enum BufferType
/*     */   {
/*  22 */     EDITABLE, 
/*  23 */     NORMAL, 
/*  24 */     SPANNABLE;
/*     */   }
/*     */ 
/*     */   public static class SavedState extends View.BaseSavedState
/*     */   {
/*  18 */     public static final Parcelable.Creator<SavedState> CREATOR = null;
/*     */ 
/*     */     SavedState()
/*     */     {
/*  14 */       super(); throw new RuntimeException("Stub!"); } 
/*  15 */     public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/*  16 */     public String toString() { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface OnEditorActionListener
/*     */   {
/*     */     public abstract boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent);
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.TextView
 * JD-Core Version:    0.6.0
 */