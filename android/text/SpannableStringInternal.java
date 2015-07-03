/*    */ package android.text;
/*    */ 
/*    */ abstract class SpannableStringInternal
/*    */ {
/*    */   SpannableStringInternal()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final int length() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final char charAt(int i) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final String toString() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final void getChars(int start, int end, char[] dest, int off) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getSpanStart(Object what) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getSpanEnd(Object what) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getSpanFlags(Object what) { throw new RuntimeException("Stub!"); } 
/* 12 */   public <T> T[] getSpans(int queryStart, int queryEnd, Class<T> kind) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int nextSpanTransition(int start, int limit, Class kind) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.SpannableStringInternal
 * JD-Core Version:    0.6.0
 */