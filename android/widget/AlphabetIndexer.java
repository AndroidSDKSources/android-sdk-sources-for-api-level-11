/*    */ package android.widget;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.database.DataSetObserver;
/*    */ 
/*    */ public class AlphabetIndexer extends DataSetObserver
/*    */   implements SectionIndexer
/*    */ {
/*    */   protected Cursor mDataCursor;
/*    */   protected int mColumnIndex;
/*    */   protected CharSequence mAlphabet;
/*    */ 
/*    */   public AlphabetIndexer(Cursor cursor, int sortedColumnIndex, CharSequence alphabet)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public Object[] getSections() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setCursor(Cursor cursor) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected int compare(String word, String letter) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getPositionForSection(int sectionIndex) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getSectionForPosition(int position) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onChanged() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onInvalidated() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.AlphabetIndexer
 * JD-Core Version:    0.6.0
 */