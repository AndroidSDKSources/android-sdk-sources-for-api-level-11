/*    */ package android.view;
/*    */ 
/*    */ public final class ViewTreeObserver
/*    */ {
/*    */   ViewTreeObserver()
/*    */   {
/* 24 */     throw new RuntimeException("Stub!"); } 
/* 25 */   public void addOnGlobalFocusChangeListener(OnGlobalFocusChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void removeOnGlobalFocusChangeListener(OnGlobalFocusChangeListener victim) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void addOnGlobalLayoutListener(OnGlobalLayoutListener listener) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void removeGlobalOnLayoutListener(OnGlobalLayoutListener victim) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void addOnPreDrawListener(OnPreDrawListener listener) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void removeOnPreDrawListener(OnPreDrawListener victim) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void addOnScrollChangedListener(OnScrollChangedListener listener) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void removeOnScrollChangedListener(OnScrollChangedListener victim) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void addOnTouchModeChangeListener(OnTouchModeChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void removeOnTouchModeChangeListener(OnTouchModeChangeListener victim) { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean isAlive() { throw new RuntimeException("Stub!"); } 
/* 36 */   public final void dispatchOnGlobalLayout() { throw new RuntimeException("Stub!"); } 
/* 37 */   public final boolean dispatchOnPreDraw() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnScrollChangedListener
/*    */   {
/*    */     public abstract void onScrollChanged();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnTouchModeChangeListener
/*    */   {
/*    */     public abstract void onTouchModeChanged(boolean paramBoolean);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnPreDrawListener
/*    */   {
/*    */     public abstract boolean onPreDraw();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnGlobalLayoutListener
/*    */   {
/*    */     public abstract void onGlobalLayout();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnGlobalFocusChangeListener
/*    */   {
/*    */     public abstract void onGlobalFocusChanged(View paramView1, View paramView2);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.ViewTreeObserver
 * JD-Core Version:    0.6.0
 */