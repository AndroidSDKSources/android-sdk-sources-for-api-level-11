/*    */ package java.lang;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class Enum<E extends Enum<E>>
/*    */   implements Serializable, Comparable<E>
/*    */ {
/*    */   protected Enum(String name, int ordinal)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final String name() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final int ordinal() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final int hashCode() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected final Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final int compareTo(E o) { throw new RuntimeException("Stub!"); } 
/* 13 */   public final Class<E> getDeclaringClass() { throw new RuntimeException("Stub!"); } 
/* 14 */   public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected final void finalize() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Enum
 * JD-Core Version:    0.6.0
 */