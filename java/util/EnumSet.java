/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E>
/*    */   implements Cloneable, Serializable
/*    */ {
/*    */   EnumSet()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static <E extends Enum<E>> EnumSet<E> copyOf(EnumSet<E> s) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static <E extends Enum<E>> EnumSet<E> complementOf(EnumSet<E> s) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static <E extends Enum<E>> EnumSet<E> of(E e) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4, E e5) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static <E extends Enum<E>> EnumSet<E> of(E start, E[] others) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static <E extends Enum<E>> EnumSet<E> range(E start, E end) { throw new RuntimeException("Stub!"); } 
/* 19 */   public EnumSet<E> clone() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.EnumSet
 * JD-Core Version:    0.6.0
 */