/*    */ package java.nio.charset;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.CharBuffer;
/*    */ 
/*    */ public abstract class CharsetDecoder
/*    */ {
/*    */   protected CharsetDecoder(Charset charset, float averageCharsPerByte, float maxCharsPerByte)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final float averageCharsPerByte() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final Charset charset() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final CharBuffer decode(ByteBuffer in) throws CharacterCodingException { throw new RuntimeException("Stub!"); } 
/*  8 */   public final CoderResult decode(ByteBuffer in, CharBuffer out, boolean endOfInput) { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract CoderResult decodeLoop(ByteBuffer paramByteBuffer, CharBuffer paramCharBuffer);
/*    */ 
/* 10 */   public Charset detectedCharset() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final CoderResult flush(CharBuffer out) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected CoderResult implFlush(CharBuffer out) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void implOnMalformedInput(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void implOnUnmappableCharacter(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void implReplaceWith(String newReplacement) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void implReset() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isAutoDetecting() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isCharsetDetected() { throw new RuntimeException("Stub!"); } 
/* 19 */   public CodingErrorAction malformedInputAction() { throw new RuntimeException("Stub!"); } 
/* 20 */   public final float maxCharsPerByte() { throw new RuntimeException("Stub!"); } 
/* 21 */   public final CharsetDecoder onMalformedInput(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); } 
/* 22 */   public final CharsetDecoder onUnmappableCharacter(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); } 
/* 23 */   public final String replacement() { throw new RuntimeException("Stub!"); } 
/* 24 */   public final CharsetDecoder replaceWith(String newReplacement) { throw new RuntimeException("Stub!"); } 
/* 25 */   public final CharsetDecoder reset() { throw new RuntimeException("Stub!"); } 
/* 26 */   public CodingErrorAction unmappableCharacterAction() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.charset.CharsetDecoder
 * JD-Core Version:    0.6.0
 */