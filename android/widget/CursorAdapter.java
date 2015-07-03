/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.Cursor;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ 
/*    */ public abstract class CursorAdapter extends BaseAdapter
/*    */   implements Filterable
/*    */ {
/*    */   public static final int FLAG_AUTO_REQUERY = 1;
/*    */   public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
/*    */ 
/*    */   public CursorAdapter(Context context, Cursor c)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public CursorAdapter(Context context, Cursor c, boolean autoRequery) { throw new RuntimeException("Stub!"); } 
/*  8 */   public CursorAdapter(Context context, Cursor c, int flags) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void init(Context context, Cursor c, boolean autoRequery) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Cursor getCursor() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getCount() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Object getItem(int position) { throw new RuntimeException("Stub!"); } 
/* 13 */   public long getItemId(int position) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean hasStableIds() { throw new RuntimeException("Stub!"); } 
/* 15 */   public View getView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 16 */   public View getDropDownView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
/*    */ 
/* 18 */   public View newDropDownView(Context context, Cursor cursor, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void bindView(View paramView, Context paramContext, Cursor paramCursor);
/*    */ 
/* 20 */   public void changeCursor(Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Cursor swapCursor(Cursor newCursor) { throw new RuntimeException("Stub!"); } 
/* 22 */   public CharSequence convertToString(Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 23 */   public Cursor runQueryOnBackgroundThread(CharSequence constraint) { throw new RuntimeException("Stub!"); } 
/* 24 */   public Filter getFilter() { throw new RuntimeException("Stub!"); } 
/* 25 */   public FilterQueryProvider getFilterQueryProvider() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected void onContentChanged() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.CursorAdapter
 * JD-Core Version:    0.6.0
 */