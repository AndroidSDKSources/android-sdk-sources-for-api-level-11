/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class SimpleExpandableListAdapter extends BaseExpandableListAdapter
/*    */ {
/*    */   public SimpleExpandableListAdapter(Context context, List<? extends Map<String, ?>> groupData, int groupLayout, String[] groupFrom, int[] groupTo, List<? extends List<? extends Map<String, ?>>> childData, int childLayout, String[] childFrom, int[] childTo)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SimpleExpandableListAdapter(Context context, List<? extends Map<String, ?>> groupData, int expandedGroupLayout, int collapsedGroupLayout, String[] groupFrom, int[] groupTo, List<? extends List<? extends Map<String, ?>>> childData, int childLayout, String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); } 
/*  7 */   public SimpleExpandableListAdapter(Context context, List<? extends Map<String, ?>> groupData, int expandedGroupLayout, int collapsedGroupLayout, String[] groupFrom, int[] groupTo, List<? extends List<? extends Map<String, ?>>> childData, int childLayout, int lastChildLayout, String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Object getChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); } 
/*  9 */   public long getChildId(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); } 
/* 10 */   public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 11 */   public View newChildView(boolean isLastChild, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getChildrenCount(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Object getGroup(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getGroupCount() { throw new RuntimeException("Stub!"); } 
/* 15 */   public long getGroupId(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 16 */   public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 17 */   public View newGroupView(boolean isExpanded, ViewGroup parent) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isChildSelectable(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean hasStableIds() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.SimpleExpandableListAdapter
 * JD-Core Version:    0.6.0
 */