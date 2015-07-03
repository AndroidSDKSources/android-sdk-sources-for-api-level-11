/*    */ package java.nio.charset;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.CharBuffer;
/*    */ 
/*    */ public abstract class CharsetEncoder
/*    */ {
/*    */   protected CharsetEncoder(Charset cs, float averageBytesPerChar, float maxBytesPerChar)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   protected CharsetEncoder(Charset cs, float averageBytesPerChar, float maxBytesPerChar, byte[] replacement) { throw new RuntimeException("Stub!"); } 
/*  6 */   public final float averageBytesPerChar() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean canEncode(char c) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean canEncode(CharSequence sequence) { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Charset charset() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final ByteBuffer encode(CharBuffer in) throws CharacterCodingException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final CoderResult encode(CharBuffer in, ByteBuffer out, boolean endOfInput) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract CoderResult encodeLoop(CharBuffer paramCharBuffer, ByteBuffer paramByteBuffer);
/*    */ 
/* 13 */   public final CoderResult flush(ByteBuffer out) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected CoderResult implFlush(ByteBuffer out) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void implOnMalformedInput(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void implOnUnmappableCharacter(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected void implReplaceWith(byte[] newReplacement) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void implReset() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isLegalReplacement(byte[] replacement) { throw new RuntimeException("Stub!"); } 
/* 20 */   public CodingErrorAction malformedInputAction() { throw new RuntimeException("Stub!"); } 
/* 21 */   public final float maxBytesPerChar() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final CharsetEncoder onMalformedInput(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); } 
/* 23 */   public final CharsetEncoder onUnmappableCharacter(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); } 
/* 24 */   public final byte[] replacement() { throw new RuntimeException("Stub!"); } 
/* 25 */   public final CharsetEncoder replaceWith(byte[] replacement) { throw new RuntimeException("Stub!"); } 
/* 26 */   public final CharsetEncoder reset() { throw new RuntimeException("Stub!"); } 
/* 27 */   public CodingErrorAction unmappableCharacterAction() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.charset.CharsetEncoder
 * JD-Core Version:    0.6.0
 */