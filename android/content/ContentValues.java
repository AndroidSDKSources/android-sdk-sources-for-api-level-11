/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Set;
/*    */ 
/*    */ public final class ContentValues
/*    */   implements Parcelable
/*    */ {
/*    */   public static final String TAG = "ContentValues";
/* 42 */   public static final Parcelable.Creator<ContentValues> CREATOR = null;
/*    */ 
/*    */   public ContentValues()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ContentValues(int size) { throw new RuntimeException("Stub!"); } 
/*  7 */   public ContentValues(ContentValues from) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void put(String key, String value) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void putAll(ContentValues other) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void put(String key, Byte value) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void put(String key, Short value) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void put(String key, Integer value) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void put(String key, Long value) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void put(String key, Float value) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void put(String key, Double value) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void put(String key, Boolean value) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void put(String key, byte[] value) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void putNull(String key) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void remove(String key) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean containsKey(String key) { throw new RuntimeException("Stub!"); } 
/* 25 */   public Object get(String key) { throw new RuntimeException("Stub!"); } 
/* 26 */   public String getAsString(String key) { throw new RuntimeException("Stub!"); } 
/* 27 */   public Long getAsLong(String key) { throw new RuntimeException("Stub!"); } 
/* 28 */   public Integer getAsInteger(String key) { throw new RuntimeException("Stub!"); } 
/* 29 */   public Short getAsShort(String key) { throw new RuntimeException("Stub!"); } 
/* 30 */   public Byte getAsByte(String key) { throw new RuntimeException("Stub!"); } 
/* 31 */   public Double getAsDouble(String key) { throw new RuntimeException("Stub!"); } 
/* 32 */   public Float getAsFloat(String key) { throw new RuntimeException("Stub!"); } 
/* 33 */   public Boolean getAsBoolean(String key) { throw new RuntimeException("Stub!"); } 
/* 34 */   public byte[] getAsByteArray(String key) { throw new RuntimeException("Stub!"); } 
/* 35 */   public Set<Map.Entry<String, Object>> valueSet() { throw new RuntimeException("Stub!"); } 
/* 36 */   public Set<String> keySet() { throw new RuntimeException("Stub!"); } 
/* 37 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); } 
/* 39 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.ContentValues
 * JD-Core Version:    0.6.0
 */