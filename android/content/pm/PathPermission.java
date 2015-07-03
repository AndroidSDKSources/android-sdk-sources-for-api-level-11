/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.PatternMatcher;
/*    */ 
/*    */ public class PathPermission extends PatternMatcher
/*    */ {
/* 11 */   public static final Parcelable.Creator<PathPermission> CREATOR = null;
/*    */ 
/*    */   public PathPermission(String pattern, int type, String readPermission, String writePermission)
/*    */   {
/*  5 */     super((Parcel)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public PathPermission(Parcel src) { super((Parcel)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public String getReadPermission() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getWritePermission() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.pm.PathPermission
 * JD-Core Version:    0.6.0
 */