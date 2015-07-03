/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class SimpleAdapter extends BaseAdapter
/*    */   implements Filterable
/*    */ {
/*    */   public SimpleAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to)
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public int getCount() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Object getItem(int position) { throw new RuntimeException("Stub!"); } 
/* 13 */   public long getItemId(int position) { throw new RuntimeException("Stub!"); } 
/* 14 */   public View getView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setDropDownViewResource(int resource) { throw new RuntimeException("Stub!"); } 
/* 16 */   public View getDropDownView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 17 */   public ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setViewBinder(ViewBinder viewBinder) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setViewImage(ImageView v, int value) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setViewImage(ImageView v, String value) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setViewText(TextView v, String text) { throw new RuntimeException("Stub!"); } 
/* 22 */   public Filter getFilter() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface ViewBinder
/*    */   {
/*    */     public abstract boolean setViewValue(View paramView, Object paramObject, String paramString);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.SimpleAdapter
 * JD-Core Version:    0.6.0
 */