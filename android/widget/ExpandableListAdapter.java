package android.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract interface ExpandableListAdapter
{
  public abstract void registerDataSetObserver(DataSetObserver paramDataSetObserver);

  public abstract void unregisterDataSetObserver(DataSetObserver paramDataSetObserver);

  public abstract int getGroupCount();

  public abstract int getChildrenCount(int paramInt);

  public abstract Object getGroup(int paramInt);

  public abstract Object getChild(int paramInt1, int paramInt2);

  public abstract long getGroupId(int paramInt);

  public abstract long getChildId(int paramInt1, int paramInt2);

  public abstract boolean hasStableIds();

  public abstract View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup);

  public abstract View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup);

  public abstract boolean isChildSelectable(int paramInt1, int paramInt2);

  public abstract boolean areAllItemsEnabled();

  public abstract boolean isEmpty();

  public abstract void onGroupExpanded(int paramInt);

  public abstract void onGroupCollapsed(int paramInt);

  public abstract long getCombinedChildId(long paramLong1, long paramLong2);

  public abstract long getCombinedGroupId(long paramLong);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.ExpandableListAdapter
 * JD-Core Version:    0.6.0
 */