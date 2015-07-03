/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class ComponentName
/*    */   implements Parcelable, Cloneable, Comparable<ComponentName>
/*    */ {
/* 26 */   public static final Parcelable.Creator<ComponentName> CREATOR = null;
/*    */ 
/*    */   public ComponentName(String pkg, String cls)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ComponentName(Context pkg, String cls) { throw new RuntimeException("Stub!"); } 
/*  7 */   public ComponentName(Context pkg, Class<?> cls) { throw new RuntimeException("Stub!"); } 
/*  8 */   public ComponentName(Parcel in) { throw new RuntimeException("Stub!"); } 
/*  9 */   public ComponentName clone() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getPackageName() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getClassName() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getShortClassName() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String flattenToString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String flattenToShortString() { throw new RuntimeException("Stub!"); } 
/* 15 */   public static ComponentName unflattenFromString(String str) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String toShortString() { throw new RuntimeException("Stub!"); } 
/* 17 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 20 */   public int compareTo(ComponentName that) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 23 */   public static void writeToParcel(ComponentName c, Parcel out) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static ComponentName readFromParcel(Parcel in) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.ComponentName
 * JD-Core Version:    0.6.0
 */