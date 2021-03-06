package android.os;

public abstract interface Parcelable
{
  public static final int PARCELABLE_WRITE_RETURN_VALUE = 1;
  public static final int CONTENTS_FILE_DESCRIPTOR = 1;

  public abstract int describeContents();

  public abstract void writeToParcel(Parcel paramParcel, int paramInt);

  public static abstract interface Creator<T>
  {
    public abstract T createFromParcel(Parcel paramParcel);

    public abstract T[] newArray(int paramInt);
  }
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.Parcelable
 * JD-Core Version:    0.6.0
 */