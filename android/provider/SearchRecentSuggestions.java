/*   */ package android.provider;
/*   */ 
/*   */ import android.content.ContentResolver;
/*   */ import android.content.Context;
/*   */ 
/*   */ public class SearchRecentSuggestions
/*   */ {
/* 8 */   public static final String[] QUERIES_PROJECTION_1LINE = null;
/* 9 */   public static final String[] QUERIES_PROJECTION_2LINE = null;
/*   */   public static final int QUERIES_PROJECTION_DATE_INDEX = 1;
/*   */   public static final int QUERIES_PROJECTION_QUERY_INDEX = 2;
/*   */   public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = 3;
/*   */   public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = 4;
/*   */ 
/*   */   public SearchRecentSuggestions(Context context, String authority, int mode)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void saveRecentQuery(String queryString, String line2) { throw new RuntimeException("Stub!"); } 
/* 6 */   public void clearHistory() { throw new RuntimeException("Stub!"); } 
/* 7 */   protected void truncateHistory(ContentResolver cr, int maxEntries) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.provider.SearchRecentSuggestions
 * JD-Core Version:    0.6.0
 */