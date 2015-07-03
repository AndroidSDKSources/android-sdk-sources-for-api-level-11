/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.Cursor;
/*    */ import android.view.View;
/*    */ 
/*    */ public abstract class SimpleCursorTreeAdapter extends ResourceCursorTreeAdapter
/*    */ {
/*    */   public SimpleCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, String[] groupFrom, int[] groupTo, int childLayout, int lastChildLayout, String[] childFrom, int[] childTo)
/*    */   {
/*  9 */     super((Context)null, (Cursor)null, 0, 0); throw new RuntimeException("Stub!"); } 
/* 10 */   public SimpleCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, String[] groupFrom, int[] groupTo, int childLayout, String[] childFrom, int[] childTo) { super((Context)null, (Cursor)null, 0, 0); throw new RuntimeException("Stub!"); } 
/* 11 */   public SimpleCursorTreeAdapter(Context context, Cursor cursor, int groupLayout, String[] groupFrom, int[] groupTo, int childLayout, String[] childFrom, int[] childTo) { super((Context)null, (Cursor)null, 0, 0); throw new RuntimeException("Stub!"); } 
/* 12 */   public ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setViewBinder(ViewBinder viewBinder) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void bindChildView(View view, Context context, Cursor cursor, boolean isLastChild) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void bindGroupView(View view, Context context, Cursor cursor, boolean isExpanded) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void setViewImage(ImageView v, String value) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setViewText(TextView v, String text) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface ViewBinder
/*    */   {
/*    */     public abstract boolean setViewValue(View paramView, Cursor paramCursor, int paramInt);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.SimpleCursorTreeAdapter
 * JD-Core Version:    0.6.0
 */