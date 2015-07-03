/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ public class Spinner extends AbsSpinner
/*    */   implements DialogInterface.OnClickListener
/*    */ {
/*    */   public static final int MODE_DIALOG = 0;
/*    */   public static final int MODE_DROPDOWN = 1;
/*    */ 
/*    */   public Spinner(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public Spinner(Context context, int mode) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public Spinner(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   public Spinner(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   public Spinner(Context context, AttributeSet attrs, int defStyle, int mode) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setAdapter(SpinnerAdapter adapter) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getBaseline() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setOnItemClickListener(AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean performClick() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void onClick(DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setPrompt(CharSequence prompt) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setPromptId(int promptId) { throw new RuntimeException("Stub!"); } 
/* 22 */   public CharSequence getPrompt() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.Spinner
 * JD-Core Version:    0.6.0
 */