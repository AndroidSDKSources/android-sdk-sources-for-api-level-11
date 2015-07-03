/*    */ package android.os;
/*    */ 
/*    */ import android.util.SparseArray;
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Set;
/*    */ 
/*    */ public final class Bundle
/*    */   implements Parcelable, Cloneable
/*    */ {
/* 93 */   public static final Bundle EMPTY = null; public static final Parcelable.Creator<Bundle> CREATOR = null;
/*    */ 
/*    */   public Bundle()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Bundle(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/*  7 */   public Bundle(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Bundle(Bundle b) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setClassLoader(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/* 10 */   public ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean containsKey(String key) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Object get(String key) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void remove(String key) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void putAll(Bundle map) { throw new RuntimeException("Stub!"); } 
/* 19 */   public Set<String> keySet() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean hasFileDescriptors() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void putBoolean(String key, boolean value) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void putByte(String key, byte value) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void putChar(String key, char value) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void putShort(String key, short value) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void putInt(String key, int value) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void putLong(String key, long value) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void putFloat(String key, float value) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void putDouble(String key, double value) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void putString(String key, String value) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void putCharSequence(String key, CharSequence value) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void putParcelable(String key, Parcelable value) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void putParcelableArray(String key, Parcelable[] value) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void putParcelableArrayList(String key, ArrayList<? extends Parcelable> value) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void putSparseParcelableArray(String key, SparseArray<? extends Parcelable> value) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void putIntegerArrayList(String key, ArrayList<Integer> value) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void putStringArrayList(String key, ArrayList<String> value) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void putCharSequenceArrayList(String key, ArrayList<CharSequence> value) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void putSerializable(String key, Serializable value) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void putBooleanArray(String key, boolean[] value) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void putByteArray(String key, byte[] value) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void putShortArray(String key, short[] value) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void putCharArray(String key, char[] value) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void putIntArray(String key, int[] value) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void putLongArray(String key, long[] value) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void putFloatArray(String key, float[] value) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void putDoubleArray(String key, double[] value) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void putStringArray(String key, String[] value) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void putCharSequenceArray(String key, CharSequence[] value) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void putBundle(String key, Bundle value) { throw new RuntimeException("Stub!"); } 
/* 50 */   public boolean getBoolean(String key) { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean getBoolean(String key, boolean defaultValue) { throw new RuntimeException("Stub!"); } 
/* 52 */   public byte getByte(String key) { throw new RuntimeException("Stub!"); } 
/* 53 */   public Byte getByte(String key, byte defaultValue) { throw new RuntimeException("Stub!"); } 
/* 54 */   public char getChar(String key) { throw new RuntimeException("Stub!"); } 
/* 55 */   public char getChar(String key, char defaultValue) { throw new RuntimeException("Stub!"); } 
/* 56 */   public short getShort(String key) { throw new RuntimeException("Stub!"); } 
/* 57 */   public short getShort(String key, short defaultValue) { throw new RuntimeException("Stub!"); } 
/* 58 */   public int getInt(String key) { throw new RuntimeException("Stub!"); } 
/* 59 */   public int getInt(String key, int defaultValue) { throw new RuntimeException("Stub!"); } 
/* 60 */   public long getLong(String key) { throw new RuntimeException("Stub!"); } 
/* 61 */   public long getLong(String key, long defaultValue) { throw new RuntimeException("Stub!"); } 
/* 62 */   public float getFloat(String key) { throw new RuntimeException("Stub!"); } 
/* 63 */   public float getFloat(String key, float defaultValue) { throw new RuntimeException("Stub!"); } 
/* 64 */   public double getDouble(String key) { throw new RuntimeException("Stub!"); } 
/* 65 */   public double getDouble(String key, double defaultValue) { throw new RuntimeException("Stub!"); } 
/* 66 */   public String getString(String key) { throw new RuntimeException("Stub!"); } 
/* 67 */   public CharSequence getCharSequence(String key) { throw new RuntimeException("Stub!"); } 
/* 68 */   public Bundle getBundle(String key) { throw new RuntimeException("Stub!"); } 
/* 69 */   public <T extends Parcelable> T getParcelable(String key) { throw new RuntimeException("Stub!"); } 
/* 70 */   public Parcelable[] getParcelableArray(String key) { throw new RuntimeException("Stub!"); } 
/* 71 */   public <T extends Parcelable> ArrayList<T> getParcelableArrayList(String key) { throw new RuntimeException("Stub!"); } 
/* 72 */   public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(String key) { throw new RuntimeException("Stub!"); } 
/* 73 */   public Serializable getSerializable(String key) { throw new RuntimeException("Stub!"); } 
/* 74 */   public ArrayList<Integer> getIntegerArrayList(String key) { throw new RuntimeException("Stub!"); } 
/* 75 */   public ArrayList<String> getStringArrayList(String key) { throw new RuntimeException("Stub!"); } 
/* 76 */   public ArrayList<CharSequence> getCharSequenceArrayList(String key) { throw new RuntimeException("Stub!"); } 
/* 77 */   public boolean[] getBooleanArray(String key) { throw new RuntimeException("Stub!"); } 
/* 78 */   public byte[] getByteArray(String key) { throw new RuntimeException("Stub!"); } 
/* 79 */   public short[] getShortArray(String key) { throw new RuntimeException("Stub!"); } 
/* 80 */   public char[] getCharArray(String key) { throw new RuntimeException("Stub!"); } 
/* 81 */   public int[] getIntArray(String key) { throw new RuntimeException("Stub!"); } 
/* 82 */   public long[] getLongArray(String key) { throw new RuntimeException("Stub!"); } 
/* 83 */   public float[] getFloatArray(String key) { throw new RuntimeException("Stub!"); } 
/* 84 */   public double[] getDoubleArray(String key) { throw new RuntimeException("Stub!"); } 
/* 85 */   public String[] getStringArray(String key) { throw new RuntimeException("Stub!"); } 
/* 86 */   public CharSequence[] getCharSequenceArray(String key) { throw new RuntimeException("Stub!"); } 
/* 87 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 88 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); } 
/* 89 */   public void readFromParcel(Parcel parcel) { throw new RuntimeException("Stub!"); } 
/* 90 */   public synchronized String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.Bundle
 * JD-Core Version:    0.6.0
 */