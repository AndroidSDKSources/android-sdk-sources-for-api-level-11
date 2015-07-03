/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.net.Uri;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.View.OnClickListener;
/*    */ 
/*    */ public class QuickContactBadge extends ImageView
/*    */   implements View.OnClickListener
/*    */ {
/* 18 */   protected String[] mExcludeMimes = null;
/*    */ 
/*    */   public QuickContactBadge(Context context)
/*    */   {
/*  6 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  7 */   public QuickContactBadge(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  8 */   public QuickContactBadge(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/*  9 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setMode(int size) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setImageToDefault() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void assignContactUri(Uri contactUri) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void assignContactFromEmail(String emailAddress, boolean lazyLookup) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void assignContactFromPhone(String phoneNumber, boolean lazyLookup) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void onClick(View v) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setExcludeMimes(String[] excludeMimes) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.QuickContactBadge
 * JD-Core Version:    0.6.0
 */