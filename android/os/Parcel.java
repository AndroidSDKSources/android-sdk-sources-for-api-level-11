/*     */ package android.os;
/*     */ 
/*     */ import android.util.SparseArray;
/*     */ import android.util.SparseBooleanArray;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ public final class Parcel
/*     */ {
/* 107 */   public static final Parcelable.Creator<String> STRING_CREATOR = null;
/*     */ 
/*     */   Parcel()
/*     */   {
/*   4 */     throw new RuntimeException("Stub!"); } 
/*   5 */   public static Parcel obtain() { throw new RuntimeException("Stub!"); } 
/*   6 */   public final void recycle() { throw new RuntimeException("Stub!"); } 
/*     */   public final native int dataSize();
/*     */ 
/*     */   public final native int dataAvail();
/*     */ 
/*     */   public final native int dataPosition();
/*     */ 
/*     */   public final native int dataCapacity();
/*     */ 
/*     */   public final native void setDataSize(int paramInt);
/*     */ 
/*     */   public final native void setDataPosition(int paramInt);
/*     */ 
/*     */   public final native void setDataCapacity(int paramInt);
/*     */ 
/*     */   public final native byte[] marshall();
/*     */ 
/*     */   public final native void unmarshall(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
/*     */ 
/*     */   public final native void appendFrom(Parcel paramParcel, int paramInt1, int paramInt2);
/*     */ 
/*     */   public final native boolean hasFileDescriptors();
/*     */ 
/*     */   public final native void writeInterfaceToken(String paramString);
/*     */ 
/*     */   public final native void enforceInterface(String paramString);
/*     */ 
/*  20 */   public final void writeByteArray(byte[] b) { throw new RuntimeException("Stub!"); } 
/*  21 */   public final void writeByteArray(byte[] b, int offset, int len) { throw new RuntimeException("Stub!"); } 
/*     */   public final native void writeInt(int paramInt);
/*     */ 
/*     */   public final native void writeLong(long paramLong);
/*     */ 
/*     */   public final native void writeFloat(float paramFloat);
/*     */ 
/*     */   public final native void writeDouble(double paramDouble);
/*     */ 
/*     */   public final native void writeString(String paramString);
/*     */ 
/*     */   public final native void writeStrongBinder(IBinder paramIBinder);
/*     */ 
/*  28 */   public final void writeStrongInterface(IInterface val) { throw new RuntimeException("Stub!"); } 
/*     */   public final native void writeFileDescriptor(FileDescriptor paramFileDescriptor);
/*     */ 
/*  30 */   public final void writeByte(byte val) { throw new RuntimeException("Stub!"); } 
/*  31 */   public final void writeMap(Map val) { throw new RuntimeException("Stub!"); } 
/*  32 */   public final void writeBundle(Bundle val) { throw new RuntimeException("Stub!"); } 
/*  33 */   public final void writeList(List val) { throw new RuntimeException("Stub!"); } 
/*  34 */   public final void writeArray(Object[] val) { throw new RuntimeException("Stub!"); } 
/*  35 */   public final void writeSparseArray(SparseArray<Object> val) { throw new RuntimeException("Stub!"); } 
/*  36 */   public final void writeSparseBooleanArray(SparseBooleanArray val) { throw new RuntimeException("Stub!"); } 
/*  37 */   public final void writeBooleanArray(boolean[] val) { throw new RuntimeException("Stub!"); } 
/*  38 */   public final boolean[] createBooleanArray() { throw new RuntimeException("Stub!"); } 
/*  39 */   public final void readBooleanArray(boolean[] val) { throw new RuntimeException("Stub!"); } 
/*  40 */   public final void writeCharArray(char[] val) { throw new RuntimeException("Stub!"); } 
/*  41 */   public final char[] createCharArray() { throw new RuntimeException("Stub!"); } 
/*  42 */   public final void readCharArray(char[] val) { throw new RuntimeException("Stub!"); } 
/*  43 */   public final void writeIntArray(int[] val) { throw new RuntimeException("Stub!"); } 
/*  44 */   public final int[] createIntArray() { throw new RuntimeException("Stub!"); } 
/*  45 */   public final void readIntArray(int[] val) { throw new RuntimeException("Stub!"); } 
/*  46 */   public final void writeLongArray(long[] val) { throw new RuntimeException("Stub!"); } 
/*  47 */   public final long[] createLongArray() { throw new RuntimeException("Stub!"); } 
/*  48 */   public final void readLongArray(long[] val) { throw new RuntimeException("Stub!"); } 
/*  49 */   public final void writeFloatArray(float[] val) { throw new RuntimeException("Stub!"); } 
/*  50 */   public final float[] createFloatArray() { throw new RuntimeException("Stub!"); } 
/*  51 */   public final void readFloatArray(float[] val) { throw new RuntimeException("Stub!"); } 
/*  52 */   public final void writeDoubleArray(double[] val) { throw new RuntimeException("Stub!"); } 
/*  53 */   public final double[] createDoubleArray() { throw new RuntimeException("Stub!"); } 
/*  54 */   public final void readDoubleArray(double[] val) { throw new RuntimeException("Stub!"); } 
/*  55 */   public final void writeStringArray(String[] val) { throw new RuntimeException("Stub!"); } 
/*  56 */   public final String[] createStringArray() { throw new RuntimeException("Stub!"); } 
/*  57 */   public final void readStringArray(String[] val) { throw new RuntimeException("Stub!"); } 
/*  58 */   public final void writeBinderArray(IBinder[] val) { throw new RuntimeException("Stub!"); } 
/*  59 */   public final IBinder[] createBinderArray() { throw new RuntimeException("Stub!"); } 
/*  60 */   public final void readBinderArray(IBinder[] val) { throw new RuntimeException("Stub!"); } 
/*  61 */   public final <T extends Parcelable> void writeTypedList(List<T> val) { throw new RuntimeException("Stub!"); } 
/*  62 */   public final void writeStringList(List<String> val) { throw new RuntimeException("Stub!"); } 
/*  63 */   public final void writeBinderList(List<IBinder> val) { throw new RuntimeException("Stub!"); } 
/*  64 */   public final <T extends Parcelable> void writeTypedArray(T[] val, int parcelableFlags) { throw new RuntimeException("Stub!"); } 
/*  65 */   public final void writeValue(Object v) { throw new RuntimeException("Stub!"); } 
/*  66 */   public final void writeParcelable(Parcelable p, int parcelableFlags) { throw new RuntimeException("Stub!"); } 
/*  67 */   public final void writeSerializable(Serializable s) { throw new RuntimeException("Stub!"); } 
/*  68 */   public final void writeException(Exception e) { throw new RuntimeException("Stub!"); } 
/*  69 */   public final void writeNoException() { throw new RuntimeException("Stub!"); } 
/*  70 */   public final void readException() { throw new RuntimeException("Stub!"); } 
/*  71 */   public final void readException(int code, String msg) { throw new RuntimeException("Stub!"); } 
/*     */   public final native int readInt();
/*     */ 
/*     */   public final native long readLong();
/*     */ 
/*     */   public final native float readFloat();
/*     */ 
/*     */   public final native double readDouble();
/*     */ 
/*     */   public final native String readString();
/*     */ 
/*     */   public final native IBinder readStrongBinder();
/*     */ 
/*  78 */   public final ParcelFileDescriptor readFileDescriptor() { throw new RuntimeException("Stub!"); } 
/*  79 */   public final byte readByte() { throw new RuntimeException("Stub!"); } 
/*  80 */   public final void readMap(Map outVal, ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/*  81 */   public final void readList(List outVal, ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/*  82 */   public final HashMap readHashMap(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/*  83 */   public final Bundle readBundle() { throw new RuntimeException("Stub!"); } 
/*  84 */   public final Bundle readBundle(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/*     */   public final native byte[] createByteArray();
/*     */ 
/*  86 */   public final void readByteArray(byte[] val) { throw new RuntimeException("Stub!"); } 
/*  87 */   public final ArrayList readArrayList(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/*  88 */   public final Object[] readArray(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/*  89 */   public final SparseArray readSparseArray(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/*  90 */   public final SparseBooleanArray readSparseBooleanArray() { throw new RuntimeException("Stub!"); } 
/*  91 */   public final <T> ArrayList<T> createTypedArrayList(Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); } 
/*  92 */   public final <T> void readTypedList(List<T> list, Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); } 
/*  93 */   public final ArrayList<String> createStringArrayList() { throw new RuntimeException("Stub!"); } 
/*  94 */   public final ArrayList<IBinder> createBinderArrayList() { throw new RuntimeException("Stub!"); } 
/*  95 */   public final void readStringList(List<String> list) { throw new RuntimeException("Stub!"); } 
/*  96 */   public final void readBinderList(List<IBinder> list) { throw new RuntimeException("Stub!"); } 
/*  97 */   public final <T> T[] createTypedArray(Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); } 
/*  98 */   public final <T> void readTypedArray(T[] val, Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); } 
/*  99 */   public final <T extends Parcelable> void writeParcelableArray(T[] value, int parcelableFlags) { throw new RuntimeException("Stub!"); } 
/* 100 */   public final Object readValue(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/* 101 */   public final <T extends Parcelable> T readParcelable(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/* 102 */   public final Parcelable[] readParcelableArray(ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/* 103 */   public final Serializable readSerializable() { throw new RuntimeException("Stub!"); } 
/* 104 */   protected static final Parcel obtain(int obj) { throw new RuntimeException("Stub!"); } 
/* 105 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.Parcel
 * JD-Core Version:    0.6.0
 */