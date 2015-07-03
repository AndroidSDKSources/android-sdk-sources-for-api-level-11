package java.text;

public abstract interface CharacterIterator extends Cloneable
{
  public static final char DONE = '￿';

  public abstract Object clone();

  public abstract char current();

  public abstract char first();

  public abstract int getBeginIndex();

  public abstract int getEndIndex();

  public abstract int getIndex();

  public abstract char last();

  public abstract char next();

  public abstract char previous();

  public abstract char setIndex(int paramInt);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.text.CharacterIterator
 * JD-Core Version:    0.6.0
 */