/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.Collection;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ 
/*    */ public class ArrayAdapter<T> extends BaseAdapter
/*    */   implements Filterable
/*    */ {
/*    */   public ArrayAdapter(Context context, int textViewResourceId)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public ArrayAdapter(Context context, int resource, int textViewResourceId) { throw new RuntimeException("Stub!"); } 
/*  8 */   public ArrayAdapter(Context context, int textViewResourceId, T[] objects) { throw new RuntimeException("Stub!"); } 
/*  9 */   public ArrayAdapter(Context context, int resource, int textViewResourceId, T[] objects) { throw new RuntimeException("Stub!"); } 
/* 10 */   public ArrayAdapter(Context context, int textViewResourceId, List<T> objects) { throw new RuntimeException("Stub!"); } 
/* 11 */   public ArrayAdapter(Context context, int resource, int textViewResourceId, List<T> objects) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void add(T object) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void addAll(Collection<? extends T> collection) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void addAll(T[] items) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void insert(T object, int index) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void remove(T object) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void sort(Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void notifyDataSetChanged() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setNotifyOnChange(boolean notifyOnChange) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Context getContext() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getCount() { throw new RuntimeException("Stub!"); } 
/* 23 */   public T getItem(int position) { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getPosition(T item) { throw new RuntimeException("Stub!"); } 
/* 25 */   public long getItemId(int position) { throw new RuntimeException("Stub!"); } 
/* 26 */   public View getView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setDropDownViewResource(int resource) { throw new RuntimeException("Stub!"); } 
/* 28 */   public View getDropDownView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static ArrayAdapter<CharSequence> createFromResource(Context context, int textArrayResId, int textViewResId) { throw new RuntimeException("Stub!"); } 
/* 30 */   public Filter getFilter() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.ArrayAdapter
 * JD-Core Version:    0.6.0
 */