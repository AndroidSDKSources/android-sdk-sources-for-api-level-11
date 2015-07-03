package android.view;

import android.graphics.drawable.Drawable;

public abstract interface SubMenu extends Menu
{
  public abstract SubMenu setHeaderTitle(int paramInt);

  public abstract SubMenu setHeaderTitle(CharSequence paramCharSequence);

  public abstract SubMenu setHeaderIcon(int paramInt);

  public abstract SubMenu setHeaderIcon(Drawable paramDrawable);

  public abstract SubMenu setHeaderView(View paramView);

  public abstract void clearHeader();

  public abstract SubMenu setIcon(int paramInt);

  public abstract SubMenu setIcon(Drawable paramDrawable);

  public abstract MenuItem getItem();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.SubMenu
 * JD-Core Version:    0.6.0
 */