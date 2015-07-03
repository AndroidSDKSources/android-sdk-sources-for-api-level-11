/*    */ package android.gesture;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class GestureStore
/*    */ {
/*    */   public static final int SEQUENCE_INVARIANT = 1;
/*    */   public static final int SEQUENCE_SENSITIVE = 2;
/*    */   public static final int ORIENTATION_INVARIANT = 1;
/*    */   public static final int ORIENTATION_SENSITIVE = 2;
/*    */ 
/*    */   public GestureStore()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void setOrientationStyle(int style) { throw new RuntimeException("Stub!"); } 
/*  6 */   public int getOrientationStyle() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setSequenceType(int type) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getSequenceType() { throw new RuntimeException("Stub!"); } 
/*  9 */   public Set<String> getGestureEntries() { throw new RuntimeException("Stub!"); } 
/* 10 */   public ArrayList<Prediction> recognize(Gesture gesture) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void addGesture(String entryName, Gesture gesture) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void removeGesture(String entryName, Gesture gesture) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void removeEntry(String entryName) { throw new RuntimeException("Stub!"); } 
/* 14 */   public ArrayList<Gesture> getGestures(String entryName) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean hasChanged() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void save(OutputStream stream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void save(OutputStream stream, boolean closeStream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void load(InputStream stream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public void load(InputStream stream, boolean closeStream) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.gesture.GestureStore
 * JD-Core Version:    0.6.0
 */