/*    */ package java.text;
/*    */ 
/*    */ public final class Bidi
/*    */ {
/*    */   public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = -2;
/*    */   public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = -1;
/*    */   public static final int DIRECTION_LEFT_TO_RIGHT = 0;
/*    */   public static final int DIRECTION_RIGHT_TO_LEFT = 1;
/*    */ 
/*    */   public Bidi(AttributedCharacterIterator paragraph)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Bidi(char[] text, int textStart, byte[] embeddings, int embStart, int paragraphLength, int flags) { throw new RuntimeException("Stub!"); } 
/*  6 */   public Bidi(String paragraph, int flags) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean baseIsLeftToRight() { throw new RuntimeException("Stub!"); } 
/*  8 */   public Bidi createLineBidi(int lineStart, int lineLimit) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getBaseLevel() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getLength() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getLevelAt(int offset) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getRunCount() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getRunLevel(int run) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getRunLimit(int run) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getRunStart(int run) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean isLeftToRight() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isMixed() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isRightToLeft() { throw new RuntimeException("Stub!"); } 
/* 19 */   public static void reorderVisually(byte[] levels, int levelStart, Object[] objects, int objectStart, int count) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static boolean requiresBidi(char[] text, int start, int limit) { throw new RuntimeException("Stub!"); } 
/* 21 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.text.Bidi
 * JD-Core Version:    0.6.0
 */