/*    */ package android.gesture;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Set;
/*    */ 
/*    */ public abstract class GestureLibrary
/*    */ {
/*    */   protected final GestureStore mStore;
/*    */ 
/*    */   protected GestureLibrary()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean save();
/*    */ 
/*    */   public abstract boolean load();
/*    */ 
/*  7 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setOrientationStyle(int style) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getOrientationStyle() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setSequenceType(int type) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getSequenceType() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Set<String> getGestureEntries() { throw new RuntimeException("Stub!"); } 
/* 13 */   public ArrayList<Prediction> recognize(Gesture gesture) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void addGesture(String entryName, Gesture gesture) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void removeGesture(String entryName, Gesture gesture) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void removeEntry(String entryName) { throw new RuntimeException("Stub!"); } 
/* 17 */   public ArrayList<Gesture> getGestures(String entryName) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.gesture.GestureLibrary
 * JD-Core Version:    0.6.0
 */