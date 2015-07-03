/*    */ package java.nio.charset;
/*    */ 
/*    */ import java.nio.BufferOverflowException;
/*    */ import java.nio.BufferUnderflowException;
/*    */ 
/*    */ public class CoderResult
/*    */ {
/* 17 */   public static final CoderResult UNDERFLOW = null; public static final CoderResult OVERFLOW = null;
/*    */ 
/*    */   CoderResult()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static synchronized CoderResult malformedForLength(int length) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static synchronized CoderResult unmappableForLength(int length) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isUnderflow() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isError() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isMalformed() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isOverflow() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isUnmappable() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int length() throws UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void throwException() throws BufferUnderflowException, BufferOverflowException, UnmappableCharacterException, MalformedInputException, CharacterCodingException { throw new RuntimeException("Stub!"); } 
/* 14 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.charset.CoderResult
 * JD-Core Version:    0.6.0
 */