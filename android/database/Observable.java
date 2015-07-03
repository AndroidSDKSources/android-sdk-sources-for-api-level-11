/*   */ package android.database;
/*   */ 
/*   */ import java.util.ArrayList;
/*   */ 
/*   */ public abstract class Observable<T>
/*   */ {
/*   */   protected final ArrayList<T> mObservers;
/*   */ 
/*   */   public Observable()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void registerObserver(T observer) { throw new RuntimeException("Stub!"); } 
/* 6 */   public void unregisterObserver(T observer) { throw new RuntimeException("Stub!"); } 
/* 7 */   public void unregisterAll() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.Observable
 * JD-Core Version:    0.6.0
 */