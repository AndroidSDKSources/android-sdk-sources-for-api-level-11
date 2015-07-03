/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.Cursor;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ 
/*    */ public abstract class CursorTreeAdapter extends BaseExpandableListAdapter
/*    */   implements Filterable
/*    */ {
/*    */   public CursorTreeAdapter(Cursor cursor, Context context)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public CursorTreeAdapter(Cursor cursor, Context context, boolean autoRequery) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract Cursor getChildrenCursor(Cursor paramCursor);
/*    */ 
/*  9 */   public void setGroupCursor(Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setChildrenCursor(int groupPosition, Cursor childrenCursor) { throw new RuntimeException("Stub!"); } 
/* 11 */   public Cursor getChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); } 
/* 12 */   public long getChildId(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getChildrenCount(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Cursor getGroup(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getGroupCount() { throw new RuntimeException("Stub!"); } 
/* 16 */   public long getGroupId(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 17 */   public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract View newGroupView(Context paramContext, Cursor paramCursor, boolean paramBoolean, ViewGroup paramViewGroup);
/*    */ 
/*    */   protected abstract void bindGroupView(View paramView, Context paramContext, Cursor paramCursor, boolean paramBoolean);
/*    */ 
/* 20 */   public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract View newChildView(Context paramContext, Cursor paramCursor, boolean paramBoolean, ViewGroup paramViewGroup);
/*    */ 
/*    */   protected abstract void bindChildView(View paramView, Context paramContext, Cursor paramCursor, boolean paramBoolean);
/*    */ 
/* 23 */   public boolean isChildSelectable(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean hasStableIds() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void notifyDataSetChanged() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void notifyDataSetChanged(boolean releaseCursors) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void onGroupCollapsed(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 29 */   public String convertToString(Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 30 */   public Cursor runQueryOnBackgroundThread(CharSequence constraint) { throw new RuntimeException("Stub!"); } 
/* 31 */   public Filter getFilter() { throw new RuntimeException("Stub!"); } 
/* 32 */   public FilterQueryProvider getFilterQueryProvider() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void changeCursor(Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 35 */   public Cursor getCursor() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.CursorTreeAdapter
 * JD-Core Version:    0.6.0
 */