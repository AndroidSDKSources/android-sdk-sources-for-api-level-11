/*    */ package android.widget;
/*    */ 
/*    */ import android.database.DataSetObserver;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class HeaderViewListAdapter
/*    */   implements WrapperListAdapter, Filterable
/*    */ {
/*    */   public HeaderViewListAdapter(ArrayList<ListView.FixedViewInfo> headerViewInfos, ArrayList<ListView.FixedViewInfo> footerViewInfos, ListAdapter adapter)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int getHeadersCount() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getFootersCount() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean removeHeader(View v) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean removeFooter(View v) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getCount() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean areAllItemsEnabled() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isEnabled(int position) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Object getItem(int position) { throw new RuntimeException("Stub!"); } 
/* 15 */   public long getItemId(int position) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean hasStableIds() { throw new RuntimeException("Stub!"); } 
/* 17 */   public View getView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 18 */   public int getItemViewType(int position) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getViewTypeCount() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); } 
/* 22 */   public Filter getFilter() { throw new RuntimeException("Stub!"); } 
/* 23 */   public ListAdapter getWrappedAdapter() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.HeaderViewListAdapter
 * JD-Core Version:    0.6.0
 */