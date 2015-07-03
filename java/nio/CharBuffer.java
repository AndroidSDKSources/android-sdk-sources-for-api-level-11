/*    */ package java.nio;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ public abstract class CharBuffer extends Buffer
/*    */   implements Comparable<CharBuffer>, CharSequence, Appendable, Readable
/*    */ {
/*    */   CharBuffer()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static CharBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static CharBuffer wrap(char[] array) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static CharBuffer wrap(char[] array, int start, int charCount) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static CharBuffer wrap(CharSequence chseq) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static CharBuffer wrap(CharSequence cs, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final char[] array() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract CharBuffer asReadOnlyBuffer();
/*    */ 
/* 15 */   public final char charAt(int index) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract CharBuffer compact();
/*    */ 
/* 17 */   public int compareTo(CharBuffer otherBuffer) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract CharBuffer duplicate();
/*    */ 
/* 19 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract char get();
/*    */ 
/* 21 */   public CharBuffer get(char[] dst) { throw new RuntimeException("Stub!"); } 
/* 22 */   public CharBuffer get(char[] dst, int dstOffset, int charCount) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract char get(int paramInt);
/*    */ 
/* 24 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); } 
/* 25 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isDirect();
/*    */ 
/* 27 */   public final int length() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract ByteOrder order();
/*    */ 
/*    */   public abstract CharBuffer put(char paramChar);
/*    */ 
/* 30 */   public final CharBuffer put(char[] src) { throw new RuntimeException("Stub!"); } 
/* 31 */   public CharBuffer put(char[] src, int srcOffset, int charCount) { throw new RuntimeException("Stub!"); } 
/* 32 */   public CharBuffer put(CharBuffer src) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract CharBuffer put(int paramInt, char paramChar);
/*    */ 
/* 34 */   public final CharBuffer put(String str) { throw new RuntimeException("Stub!"); } 
/* 35 */   public CharBuffer put(String str, int start, int end) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract CharBuffer slice();
/*    */ 
/*    */   public abstract CharSequence subSequence(int paramInt1, int paramInt2);
/*    */ 
/* 38 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 39 */   public CharBuffer append(char c) { throw new RuntimeException("Stub!"); } 
/* 40 */   public CharBuffer append(CharSequence csq) { throw new RuntimeException("Stub!"); } 
/* 41 */   public CharBuffer append(CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 42 */   public int read(CharBuffer target) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.CharBuffer
 * JD-Core Version:    0.6.0
 */