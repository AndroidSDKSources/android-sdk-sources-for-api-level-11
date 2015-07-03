/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public final class Locale
/*    */   implements Cloneable, Serializable
/*    */ {
/* 52 */   public static final Locale CANADA = null; public static final Locale CANADA_FRENCH = null; public static final Locale CHINA = null; public static final Locale CHINESE = null; public static final Locale ENGLISH = null; public static final Locale FRANCE = null; public static final Locale FRENCH = null; public static final Locale GERMAN = null; public static final Locale GERMANY = null; public static final Locale ITALIAN = null; public static final Locale ITALY = null; public static final Locale JAPAN = null; public static final Locale JAPANESE = null; public static final Locale KOREA = null; public static final Locale KOREAN = null; public static final Locale PRC = null; public static final Locale ROOT = null; public static final Locale SIMPLIFIED_CHINESE = null; public static final Locale TAIWAN = null; public static final Locale TRADITIONAL_CHINESE = null; public static final Locale UK = null; public static final Locale US = null;
/*    */ 
/*    */   public Locale(String language)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Locale(String language, String country) { throw new RuntimeException("Stub!"); } 
/*  7 */   public Locale(String language, String country, String variant) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getCountry() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static Locale getDefault() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final String getDisplayCountry() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getDisplayCountry(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 15 */   public final String getDisplayLanguage() { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getDisplayLanguage(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 17 */   public final String getDisplayName() { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getDisplayName(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 19 */   public final String getDisplayVariant() { throw new RuntimeException("Stub!"); } 
/* 20 */   public String getDisplayVariant(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 21 */   public String getISO3Country() { throw new RuntimeException("Stub!"); } 
/* 22 */   public String getISO3Language() { throw new RuntimeException("Stub!"); } 
/* 23 */   public static String[] getISOCountries() { throw new RuntimeException("Stub!"); } 
/* 24 */   public static String[] getISOLanguages() { throw new RuntimeException("Stub!"); } 
/* 25 */   public String getLanguage() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String getVariant() { throw new RuntimeException("Stub!"); } 
/* 27 */   public synchronized int hashCode() { throw new RuntimeException("Stub!"); } 
/* 28 */   public static synchronized void setDefault(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 29 */   public final String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Locale
 * JD-Core Version:    0.6.0
 */