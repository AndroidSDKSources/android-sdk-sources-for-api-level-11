/*    */ package android.widget;
/*    */ 
/*    */ import android.database.DataSetObserver;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ 
/*    */ public abstract class BaseAdapter
/*    */   implements ListAdapter, SpinnerAdapter
/*    */ {
/*    */   public BaseAdapter()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean hasStableIds() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void notifyDataSetChanged() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean areAllItemsEnabled() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isEnabled(int position) { throw new RuntimeException("Stub!"); } 
/* 13 */   public View getDropDownView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getItemViewType(int position) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getViewTypeCount() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean isEmpty() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.BaseAdapter
 * JD-Core Version:    0.6.0
 */