package android.widget;

public abstract interface SectionIndexer
{
  public abstract Object[] getSections();

  public abstract int getPositionForSection(int paramInt);

  public abstract int getSectionForPosition(int paramInt);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.SectionIndexer
 * JD-Core Version:    0.6.0
 */