/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.Cursor;
/*    */ import android.view.View;
/*    */ 
/*    */ public class SimpleCursorAdapter extends ResourceCursorAdapter
/*    */ {
/*    */   public SimpleCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to)
/*    */   {
/* 13 */     super((Context)null, 0, (Cursor)null, 0); throw new RuntimeException("Stub!"); } 
/* 14 */   public SimpleCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) { super((Context)null, 0, (Cursor)null, 0); throw new RuntimeException("Stub!"); } 
/* 15 */   public void bindView(View view, Context context, Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 16 */   public ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setViewBinder(ViewBinder viewBinder) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setViewImage(ImageView v, String value) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setViewText(TextView v, String text) { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getStringConversionColumn() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setStringConversionColumn(int stringConversionColumn) { throw new RuntimeException("Stub!"); } 
/* 22 */   public CursorToStringConverter getCursorToStringConverter() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setCursorToStringConverter(CursorToStringConverter cursorToStringConverter) { throw new RuntimeException("Stub!"); } 
/* 24 */   public CharSequence convertToString(Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 25 */   public Cursor swapCursor(Cursor c) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void changeCursorAndColumns(Cursor c, String[] from, int[] to) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface CursorToStringConverter
/*    */   {
/*    */     public abstract CharSequence convertToString(Cursor paramCursor);
/*    */   }
/*    */ 
/*    */   public static abstract interface ViewBinder
/*    */   {
/*    */     public abstract boolean setViewValue(View paramView, Cursor paramCursor, int paramInt);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.SimpleCursorAdapter
 * JD-Core Version:    0.6.0
 */