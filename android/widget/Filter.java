/*    */ package android.widget;
/*    */ 
/*    */ public abstract class Filter
/*    */ {
/*    */   public Filter()
/*    */   {
/* 14 */     throw new RuntimeException("Stub!"); } 
/* 15 */   public final void filter(CharSequence constraint) { throw new RuntimeException("Stub!"); } 
/* 16 */   public final void filter(CharSequence constraint, FilterListener listener) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract FilterResults performFiltering(CharSequence paramCharSequence);
/*    */ 
/*    */   protected abstract void publishResults(CharSequence paramCharSequence, FilterResults paramFilterResults);
/*    */ 
/* 19 */   public CharSequence convertResultToString(Object resultValue) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface FilterListener
/*    */   {
/*    */     public abstract void onFilterComplete(int paramInt);
/*    */   }
/*    */ 
/*    */   protected static class FilterResults
/*    */   {
/*    */     public Object values;
/*    */     public int count;
/*    */ 
/*    */     public FilterResults()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.Filter
 * JD-Core Version:    0.6.0
 */