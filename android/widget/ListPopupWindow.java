/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ public class ListPopupWindow
/*    */ {
/*    */   public static final int POSITION_PROMPT_ABOVE = 0;
/*    */   public static final int POSITION_PROMPT_BELOW = 1;
/*    */   public static final int MATCH_PARENT = -1;
/*    */   public static final int WRAP_CONTENT = -2;
/*    */   public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
/*    */   public static final int INPUT_METHOD_NEEDED = 1;
/*    */   public static final int INPUT_METHOD_NOT_NEEDED = 2;
/*    */ 
/*    */   public ListPopupWindow(Context context)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public ListPopupWindow(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/*  6 */   public ListPopupWindow(Context context, AttributeSet attrs, int defStyleAttr) { throw new RuntimeException("Stub!"); } 
/*  7 */   public ListPopupWindow(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setPromptPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getPromptPosition() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setModal(boolean modal) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isModal() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setSoftInputMode(int mode) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getSoftInputMode() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setListSelector(Drawable selector) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Drawable getBackground() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setBackgroundDrawable(Drawable d) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setAnimationStyle(int animationStyle) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getAnimationStyle() { throw new RuntimeException("Stub!"); } 
/* 20 */   public View getAnchorView() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setAnchorView(View anchor) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getHorizontalOffset() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setHorizontalOffset(int offset) { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getVerticalOffset() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setVerticalOffset(int offset) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getWidth() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setWidth(int width) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setContentWidth(int width) { throw new RuntimeException("Stub!"); } 
/* 29 */   public int getHeight() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setHeight(int height) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setOnItemClickListener(AdapterView.OnItemClickListener clickListener) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener selectedListener) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setPromptView(View prompt) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void postShow() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void show() { throw new RuntimeException("Stub!"); } 
/* 36 */   public void dismiss() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setOnDismissListener(PopupWindow.OnDismissListener listener) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setInputMethodMode(int mode) { throw new RuntimeException("Stub!"); } 
/* 39 */   public int getInputMethodMode() { throw new RuntimeException("Stub!"); } 
/* 40 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void clearListSelection() { throw new RuntimeException("Stub!"); } 
/* 42 */   public boolean isShowing() { throw new RuntimeException("Stub!"); } 
/* 43 */   public boolean isInputMethodNotNeeded() { throw new RuntimeException("Stub!"); } 
/* 44 */   public boolean performItemClick(int position) { throw new RuntimeException("Stub!"); } 
/* 45 */   public Object getSelectedItem() { throw new RuntimeException("Stub!"); } 
/* 46 */   public int getSelectedItemPosition() { throw new RuntimeException("Stub!"); } 
/* 47 */   public long getSelectedItemId() { throw new RuntimeException("Stub!"); } 
/* 48 */   public View getSelectedView() { throw new RuntimeException("Stub!"); } 
/* 49 */   public ListView getListView() { throw new RuntimeException("Stub!"); } 
/* 50 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 52 */   public boolean onKeyPreIme(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.ListPopupWindow
 * JD-Core Version:    0.6.0
 */