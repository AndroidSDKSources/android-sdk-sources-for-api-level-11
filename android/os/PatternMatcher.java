/*    */ package android.os;
/*    */ 
/*    */ public class PatternMatcher
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int PATTERN_LITERAL = 0;
/*    */   public static final int PATTERN_PREFIX = 1;
/*    */   public static final int PATTERN_SIMPLE_GLOB = 2;
/* 17 */   public static final Parcelable.Creator<PatternMatcher> CREATOR = null;
/*    */ 
/*    */   public PatternMatcher(String pattern, int type)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PatternMatcher(Parcel src) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final String getPath() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final int getType() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean match(String str) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.PatternMatcher
 * JD-Core Version:    0.6.0
 */