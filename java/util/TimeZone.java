/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class TimeZone
/*    */   implements Serializable, Cloneable
/*    */ {
/*    */   public static final int SHORT = 0;
/*    */   public static final int LONG = 1;
/*    */ 
/*    */   public TimeZone()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static synchronized String[] getAvailableIDs() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static synchronized String[] getAvailableIDs(int offsetMillis) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static synchronized TimeZone getDefault() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final String getDisplayName() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final String getDisplayName(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final String getDisplayName(boolean daylightTime, int style) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getDisplayName(boolean daylightTime, int style, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getID() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getDSTSavings() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getOffset(long time) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int getOffset(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*    */ 
/*    */   public abstract int getRawOffset();
/*    */ 
/* 19 */   public static synchronized TimeZone getTimeZone(String id) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean hasSameRules(TimeZone timeZone) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean inDaylightTime(Date paramDate);
/*    */ 
/* 22 */   public static synchronized void setDefault(TimeZone timeZone) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setID(String id) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract void setRawOffset(int paramInt);
/*    */ 
/*    */   public abstract boolean useDaylightTime();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.TimeZone
 * JD-Core Version:    0.6.0
 */