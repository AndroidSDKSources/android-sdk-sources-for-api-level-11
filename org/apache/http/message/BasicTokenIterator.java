/*    */ package org.apache.http.message;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ import org.apache.http.HeaderIterator;
/*    */ import org.apache.http.ParseException;
/*    */ import org.apache.http.TokenIterator;
/*    */ 
/*    */ public class BasicTokenIterator
/*    */   implements TokenIterator
/*    */ {
/*    */   public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
/*    */   protected final HeaderIterator headerIt;
/*    */   protected String currentHeader;
/*    */   protected String currentToken;
/*    */   protected int searchPos;
/*    */ 
/*    */   public BasicTokenIterator(HeaderIterator headerIterator)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean hasNext() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String nextToken() throws NoSuchElementException, ParseException { throw new RuntimeException("Stub!"); } 
/*  8 */   public final Object next() throws NoSuchElementException, ParseException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final void remove() throws UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 10 */   protected int findNext(int from) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 11 */   protected String createToken(String value, int start, int end) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected int findTokenStart(int from) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected int findTokenSeparator(int from) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected int findTokenEnd(int from) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected boolean isTokenSeparator(char ch) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected boolean isWhitespace(char ch) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected boolean isTokenChar(char ch) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected boolean isHttpSeparator(char ch) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicTokenIterator
 * JD-Core Version:    0.6.0
 */