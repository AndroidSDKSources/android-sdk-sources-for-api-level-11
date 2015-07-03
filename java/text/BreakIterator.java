/*    */ package java.text;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public abstract class BreakIterator
/*    */   implements Cloneable
/*    */ {
/*    */   public static final int DONE = -1;
/*    */ 
/*    */   protected BreakIterator()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static BreakIterator getCharacterInstance() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static BreakIterator getCharacterInstance(Locale where) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static BreakIterator getLineInstance() { throw new RuntimeException("Stub!"); } 
/* 10 */   public static BreakIterator getLineInstance(Locale where) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static BreakIterator getSentenceInstance() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static BreakIterator getSentenceInstance(Locale where) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static BreakIterator getWordInstance() { throw new RuntimeException("Stub!"); } 
/* 14 */   public static BreakIterator getWordInstance(Locale where) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isBoundary(int offset) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int preceding(int offset) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setText(String newText) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int current();
/*    */ 
/*    */   public abstract int first();
/*    */ 
/*    */   public abstract int following(int paramInt);
/*    */ 
/*    */   public abstract CharacterIterator getText();
/*    */ 
/*    */   public abstract int last();
/*    */ 
/*    */   public abstract int next();
/*    */ 
/*    */   public abstract int next(int paramInt);
/*    */ 
/*    */   public abstract int previous();
/*    */ 
/*    */   public abstract void setText(CharacterIterator paramCharacterIterator);
/*    */ 
/* 27 */   public Object clone() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.text.BreakIterator
 * JD-Core Version:    0.6.0
 */