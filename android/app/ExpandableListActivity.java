/*    */ package android.app;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.view.ContextMenu;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
/*    */ import android.view.View;
/*    */ import android.view.View.OnCreateContextMenuListener;
/*    */ import android.widget.ExpandableListAdapter;
/*    */ import android.widget.ExpandableListView;
/*    */ import android.widget.ExpandableListView.OnChildClickListener;
/*    */ import android.widget.ExpandableListView.OnGroupCollapseListener;
/*    */ import android.widget.ExpandableListView.OnGroupExpandListener;
/*    */ 
/*    */ public class ExpandableListActivity extends Activity
/*    */   implements View.OnCreateContextMenuListener, ExpandableListView.OnChildClickListener, ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener
/*    */ {
/*    */   public ExpandableListActivity()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onGroupCollapse(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onGroupExpand(int groupPosition) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void onRestoreInstanceState(Bundle state) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onContentChanged() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setListAdapter(ExpandableListAdapter adapter) { throw new RuntimeException("Stub!"); } 
/* 14 */   public ExpandableListView getExpandableListView() { throw new RuntimeException("Stub!"); } 
/* 15 */   public ExpandableListAdapter getExpandableListAdapter() { throw new RuntimeException("Stub!"); } 
/* 16 */   public long getSelectedId() { throw new RuntimeException("Stub!"); } 
/* 17 */   public long getSelectedPosition() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean setSelectedChild(int groupPosition, int childPosition, boolean shouldExpandGroup) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setSelectedGroup(int groupPosition) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.ExpandableListActivity
 * JD-Core Version:    0.6.0
 */