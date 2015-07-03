/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ public class MultiAutoCompleteTextView extends AutoCompleteTextView
/*    */ {
/*    */   public MultiAutoCompleteTextView(Context context)
/*    */   {
/* 19 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   public MultiAutoCompleteTextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 21 */   public MultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyle) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 22 */   public void setTokenizer(Tokenizer t) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void performFiltering(CharSequence text, int keyCode) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean enoughToFilter() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void performValidation() { throw new RuntimeException("Stub!"); } 
/* 26 */   protected void performFiltering(CharSequence text, int start, int end, int keyCode) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected void replaceText(CharSequence text) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class CommaTokenizer
/*    */     implements MultiAutoCompleteTextView.Tokenizer
/*    */   {
/*    */     public CommaTokenizer()
/*    */     {
/* 14 */       throw new RuntimeException("Stub!"); } 
/* 15 */     public int findTokenStart(CharSequence text, int cursor) { throw new RuntimeException("Stub!"); } 
/* 16 */     public int findTokenEnd(CharSequence text, int cursor) { throw new RuntimeException("Stub!"); } 
/* 17 */     public CharSequence terminateToken(CharSequence text) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface Tokenizer
/*    */   {
/*    */     public abstract int findTokenStart(CharSequence paramCharSequence, int paramInt);
/*    */ 
/*    */     public abstract int findTokenEnd(CharSequence paramCharSequence, int paramInt);
/*    */ 
/*    */     public abstract CharSequence terminateToken(CharSequence paramCharSequence);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.MultiAutoCompleteTextView
 * JD-Core Version:    0.6.0
 */