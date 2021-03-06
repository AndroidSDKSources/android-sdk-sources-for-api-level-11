/*     */ package java.lang;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ public final class Character
/*     */   implements Serializable, Comparable<Character>
/*     */ {
/*     */   public static final char MIN_VALUE = '\000';
/*     */   public static final char MAX_VALUE = '￿';
/*     */   public static final int MIN_RADIX = 2;
/*     */   public static final int MAX_RADIX = 36;
/* 290 */   public static final Class<Character> TYPE = null;
/*     */   public static final byte UNASSIGNED = 0;
/*     */   public static final byte UPPERCASE_LETTER = 1;
/*     */   public static final byte LOWERCASE_LETTER = 2;
/*     */   public static final byte TITLECASE_LETTER = 3;
/*     */   public static final byte MODIFIER_LETTER = 4;
/*     */   public static final byte OTHER_LETTER = 5;
/*     */   public static final byte NON_SPACING_MARK = 6;
/*     */   public static final byte ENCLOSING_MARK = 7;
/*     */   public static final byte COMBINING_SPACING_MARK = 8;
/*     */   public static final byte DECIMAL_DIGIT_NUMBER = 9;
/*     */   public static final byte LETTER_NUMBER = 10;
/*     */   public static final byte OTHER_NUMBER = 11;
/*     */   public static final byte SPACE_SEPARATOR = 12;
/*     */   public static final byte LINE_SEPARATOR = 13;
/*     */   public static final byte PARAGRAPH_SEPARATOR = 14;
/*     */   public static final byte CONTROL = 15;
/*     */   public static final byte FORMAT = 16;
/*     */   public static final byte PRIVATE_USE = 18;
/*     */   public static final byte SURROGATE = 19;
/*     */   public static final byte DASH_PUNCTUATION = 20;
/*     */   public static final byte START_PUNCTUATION = 21;
/*     */   public static final byte END_PUNCTUATION = 22;
/*     */   public static final byte CONNECTOR_PUNCTUATION = 23;
/*     */   public static final byte OTHER_PUNCTUATION = 24;
/*     */   public static final byte MATH_SYMBOL = 25;
/*     */   public static final byte CURRENCY_SYMBOL = 26;
/*     */   public static final byte MODIFIER_SYMBOL = 27;
/*     */   public static final byte OTHER_SYMBOL = 28;
/*     */   public static final byte INITIAL_QUOTE_PUNCTUATION = 29;
/*     */   public static final byte FINAL_QUOTE_PUNCTUATION = 30;
/*     */   public static final byte DIRECTIONALITY_UNDEFINED = -1;
/*     */   public static final byte DIRECTIONALITY_LEFT_TO_RIGHT = 0;
/*     */   public static final byte DIRECTIONALITY_RIGHT_TO_LEFT = 1;
/*     */   public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC = 2;
/*     */   public static final byte DIRECTIONALITY_EUROPEAN_NUMBER = 3;
/*     */   public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR = 4;
/*     */   public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR = 5;
/*     */   public static final byte DIRECTIONALITY_ARABIC_NUMBER = 6;
/*     */   public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR = 7;
/*     */   public static final byte DIRECTIONALITY_NONSPACING_MARK = 8;
/*     */   public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL = 9;
/*     */   public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR = 10;
/*     */   public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR = 11;
/*     */   public static final byte DIRECTIONALITY_WHITESPACE = 12;
/*     */   public static final byte DIRECTIONALITY_OTHER_NEUTRALS = 13;
/*     */   public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING = 14;
/*     */   public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE = 15;
/*     */   public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING = 16;
/*     */   public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE = 17;
/*     */   public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT = 18;
/*     */   public static final char MIN_HIGH_SURROGATE = '���';
/*     */   public static final char MAX_HIGH_SURROGATE = '���';
/*     */   public static final char MIN_LOW_SURROGATE = '���';
/*     */   public static final char MAX_LOW_SURROGATE = '���';
/*     */   public static final char MIN_SURROGATE = '���';
/*     */   public static final char MAX_SURROGATE = '���';
/*     */   public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
/*     */   public static final int MIN_CODE_POINT = 0;
/*     */   public static final int MAX_CODE_POINT = 1114111;
/*     */   public static final int SIZE = 16;
/*     */ 
/*     */   public Character(char value)
/*     */   {
/* 147 */     throw new RuntimeException("Stub!"); } 
/* 148 */   public char charValue() { throw new RuntimeException("Stub!"); } 
/* 149 */   public int compareTo(Character c) { throw new RuntimeException("Stub!"); } 
/* 150 */   public static Character valueOf(char c) { throw new RuntimeException("Stub!"); } 
/* 151 */   public static boolean isValidCodePoint(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 152 */   public static boolean isSupplementaryCodePoint(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 153 */   public static boolean isHighSurrogate(char ch) { throw new RuntimeException("Stub!"); } 
/* 154 */   public static boolean isLowSurrogate(char ch) { throw new RuntimeException("Stub!"); } 
/* 155 */   public static boolean isSurrogatePair(char high, char low) { throw new RuntimeException("Stub!"); } 
/* 156 */   public static int charCount(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 157 */   public static int toCodePoint(char high, char low) { throw new RuntimeException("Stub!"); } 
/* 158 */   public static int codePointAt(CharSequence seq, int index) { throw new RuntimeException("Stub!"); } 
/* 159 */   public static int codePointAt(char[] seq, int index) { throw new RuntimeException("Stub!"); } 
/* 160 */   public static int codePointAt(char[] seq, int index, int limit) { throw new RuntimeException("Stub!"); } 
/* 161 */   public static int codePointBefore(CharSequence seq, int index) { throw new RuntimeException("Stub!"); } 
/* 162 */   public static int codePointBefore(char[] seq, int index) { throw new RuntimeException("Stub!"); } 
/* 163 */   public static int codePointBefore(char[] seq, int index, int start) { throw new RuntimeException("Stub!"); } 
/* 164 */   public static int toChars(int codePoint, char[] dst, int dstIndex) { throw new RuntimeException("Stub!"); } 
/* 165 */   public static char[] toChars(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 166 */   public static int codePointCount(CharSequence seq, int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); } 
/* 167 */   public static int codePointCount(char[] seq, int offset, int count) { throw new RuntimeException("Stub!"); } 
/* 168 */   public static int offsetByCodePoints(CharSequence seq, int index, int codePointOffset) { throw new RuntimeException("Stub!"); } 
/* 169 */   public static int offsetByCodePoints(char[] seq, int start, int count, int index, int codePointOffset) { throw new RuntimeException("Stub!"); } 
/* 170 */   public static int digit(char c, int radix) { throw new RuntimeException("Stub!"); } 
/* 171 */   public static int digit(int codePoint, int radix) { throw new RuntimeException("Stub!"); } 
/* 172 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 173 */   public static char forDigit(int digit, int radix) { throw new RuntimeException("Stub!"); } 
/* 174 */   public static int getNumericValue(char c) { throw new RuntimeException("Stub!"); } 
/* 175 */   public static int getNumericValue(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 176 */   public static int getType(char c) { throw new RuntimeException("Stub!"); } 
/* 177 */   public static int getType(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 178 */   public static byte getDirectionality(char c) { throw new RuntimeException("Stub!"); } 
/* 179 */   public static byte getDirectionality(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 180 */   public static boolean isMirrored(char c) { throw new RuntimeException("Stub!"); } 
/* 181 */   public static boolean isMirrored(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 182 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 183 */   public static boolean isDefined(char c) { throw new RuntimeException("Stub!"); } 
/* 184 */   public static boolean isDefined(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 185 */   public static boolean isDigit(char c) { throw new RuntimeException("Stub!"); } 
/* 186 */   public static boolean isDigit(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 187 */   public static boolean isIdentifierIgnorable(char c) { throw new RuntimeException("Stub!"); } 
/* 188 */   public static boolean isIdentifierIgnorable(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 189 */   public static boolean isISOControl(char c) { throw new RuntimeException("Stub!"); } 
/* 190 */   public static boolean isISOControl(int c) { throw new RuntimeException("Stub!"); } 
/* 191 */   public static boolean isJavaIdentifierPart(char c) { throw new RuntimeException("Stub!"); } 
/* 192 */   public static boolean isJavaIdentifierPart(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 193 */   public static boolean isJavaIdentifierStart(char c) { throw new RuntimeException("Stub!"); } 
/* 194 */   public static boolean isJavaIdentifierStart(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 195 */   public static boolean isJavaLetter(char c) { throw new RuntimeException("Stub!"); } 
/* 196 */   public static boolean isJavaLetterOrDigit(char c) { throw new RuntimeException("Stub!"); } 
/* 197 */   public static boolean isLetter(char c) { throw new RuntimeException("Stub!"); } 
/* 198 */   public static boolean isLetter(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 199 */   public static boolean isLetterOrDigit(char c) { throw new RuntimeException("Stub!"); } 
/* 200 */   public static boolean isLetterOrDigit(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 201 */   public static boolean isLowerCase(char c) { throw new RuntimeException("Stub!"); } 
/* 202 */   public static boolean isLowerCase(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 203 */   public static boolean isSpace(char c) { throw new RuntimeException("Stub!"); } 
/* 204 */   public static boolean isSpaceChar(char c) { throw new RuntimeException("Stub!"); } 
/* 205 */   public static boolean isSpaceChar(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 206 */   public static boolean isTitleCase(char c) { throw new RuntimeException("Stub!"); } 
/* 207 */   public static boolean isTitleCase(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 208 */   public static boolean isUnicodeIdentifierPart(char c) { throw new RuntimeException("Stub!"); } 
/* 209 */   public static boolean isUnicodeIdentifierPart(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 210 */   public static boolean isUnicodeIdentifierStart(char c) { throw new RuntimeException("Stub!"); } 
/* 211 */   public static boolean isUnicodeIdentifierStart(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 212 */   public static boolean isUpperCase(char c) { throw new RuntimeException("Stub!"); } 
/* 213 */   public static boolean isUpperCase(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 214 */   public static boolean isWhitespace(char c) { throw new RuntimeException("Stub!"); } 
/* 215 */   public static boolean isWhitespace(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 216 */   public static char reverseBytes(char c) { throw new RuntimeException("Stub!"); } 
/* 217 */   public static char toLowerCase(char c) { throw new RuntimeException("Stub!"); } 
/* 218 */   public static int toLowerCase(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 219 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 220 */   public static String toString(char value) { throw new RuntimeException("Stub!"); } 
/* 221 */   public static char toTitleCase(char c) { throw new RuntimeException("Stub!"); } 
/* 222 */   public static int toTitleCase(int codePoint) { throw new RuntimeException("Stub!"); } 
/* 223 */   public static char toUpperCase(char c) { throw new RuntimeException("Stub!"); } 
/* 224 */   public static int toUpperCase(int codePoint) { throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   public static final class UnicodeBlock extends Character.Subset
/*     */   {
/* 145 */     public static final UnicodeBlock SURROGATES_AREA = null; public static final UnicodeBlock BASIC_LATIN = null; public static final UnicodeBlock LATIN_1_SUPPLEMENT = null; public static final UnicodeBlock LATIN_EXTENDED_A = null; public static final UnicodeBlock LATIN_EXTENDED_B = null; public static final UnicodeBlock IPA_EXTENSIONS = null; public static final UnicodeBlock SPACING_MODIFIER_LETTERS = null; public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS = null; public static final UnicodeBlock GREEK = null; public static final UnicodeBlock CYRILLIC = null; public static final UnicodeBlock CYRILLIC_SUPPLEMENTARY = null; public static final UnicodeBlock ARMENIAN = null; public static final UnicodeBlock HEBREW = null; public static final UnicodeBlock ARABIC = null; public static final UnicodeBlock SYRIAC = null; public static final UnicodeBlock THAANA = null; public static final UnicodeBlock DEVANAGARI = null; public static final UnicodeBlock BENGALI = null; public static final UnicodeBlock GURMUKHI = null; public static final UnicodeBlock GUJARATI = null; public static final UnicodeBlock ORIYA = null; public static final UnicodeBlock TAMIL = null; public static final UnicodeBlock TELUGU = null; public static final UnicodeBlock KANNADA = null; public static final UnicodeBlock MALAYALAM = null; public static final UnicodeBlock SINHALA = null; public static final UnicodeBlock THAI = null; public static final UnicodeBlock LAO = null; public static final UnicodeBlock TIBETAN = null; public static final UnicodeBlock MYANMAR = null; public static final UnicodeBlock GEORGIAN = null; public static final UnicodeBlock HANGUL_JAMO = null; public static final UnicodeBlock ETHIOPIC = null; public static final UnicodeBlock CHEROKEE = null; public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null; public static final UnicodeBlock OGHAM = null; public static final UnicodeBlock RUNIC = null; public static final UnicodeBlock TAGALOG = null; public static final UnicodeBlock HANUNOO = null; public static final UnicodeBlock BUHID = null; public static final UnicodeBlock TAGBANWA = null; public static final UnicodeBlock KHMER = null; public static final UnicodeBlock MONGOLIAN = null; public static final UnicodeBlock LIMBU = null; public static final UnicodeBlock TAI_LE = null; public static final UnicodeBlock KHMER_SYMBOLS = null; public static final UnicodeBlock PHONETIC_EXTENSIONS = null; public static final UnicodeBlock LATIN_EXTENDED_ADDITIONAL = null; public static final UnicodeBlock GREEK_EXTENDED = null; public static final UnicodeBlock GENERAL_PUNCTUATION = null; public static final UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS = null; public static final UnicodeBlock CURRENCY_SYMBOLS = null; public static final UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS = null; public static final UnicodeBlock LETTERLIKE_SYMBOLS = null; public static final UnicodeBlock NUMBER_FORMS = null; public static final UnicodeBlock ARROWS = null; public static final UnicodeBlock MATHEMATICAL_OPERATORS = null; public static final UnicodeBlock MISCELLANEOUS_TECHNICAL = null; public static final UnicodeBlock CONTROL_PICTURES = null; public static final UnicodeBlock OPTICAL_CHARACTER_RECOGNITION = null; public static final UnicodeBlock ENCLOSED_ALPHANUMERICS = null; public static final UnicodeBlock BOX_DRAWING = null; public static final UnicodeBlock BLOCK_ELEMENTS = null; public static final UnicodeBlock GEOMETRIC_SHAPES = null; public static final UnicodeBlock MISCELLANEOUS_SYMBOLS = null; public static final UnicodeBlock DINGBATS = null; public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null; public static final UnicodeBlock SUPPLEMENTAL_ARROWS_A = null; public static final UnicodeBlock BRAILLE_PATTERNS = null; public static final UnicodeBlock SUPPLEMENTAL_ARROWS_B = null; public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null; public static final UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null; public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS = null; public static final UnicodeBlock CJK_RADICALS_SUPPLEMENT = null; public static final UnicodeBlock KANGXI_RADICALS = null; public static final UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null; public static final UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION = null; public static final UnicodeBlock HIRAGANA = null; public static final UnicodeBlock KATAKANA = null; public static final UnicodeBlock BOPOMOFO = null; public static final UnicodeBlock HANGUL_COMPATIBILITY_JAMO = null; public static final UnicodeBlock KANBUN = null; public static final UnicodeBlock BOPOMOFO_EXTENDED = null; public static final UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS = null; public static final UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS = null; public static final UnicodeBlock CJK_COMPATIBILITY = null; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null; public static final UnicodeBlock YIJING_HEXAGRAM_SYMBOLS = null; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS = null; public static final UnicodeBlock YI_SYLLABLES = null; public static final UnicodeBlock YI_RADICALS = null; public static final UnicodeBlock HANGUL_SYLLABLES = null; public static final UnicodeBlock HIGH_SURROGATES = null; public static final UnicodeBlock HIGH_PRIVATE_USE_SURROGATES = null; public static final UnicodeBlock LOW_SURROGATES = null; public static final UnicodeBlock PRIVATE_USE_AREA = null; public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS = null; public static final UnicodeBlock ALPHABETIC_PRESENTATION_FORMS = null; public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_A = null; public static final UnicodeBlock VARIATION_SELECTORS = null; public static final UnicodeBlock COMBINING_HALF_MARKS = null; public static final UnicodeBlock CJK_COMPATIBILITY_FORMS = null; public static final UnicodeBlock SMALL_FORM_VARIANTS = null; public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_B = null; public static final UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS = null; public static final UnicodeBlock SPECIALS = null; public static final UnicodeBlock LINEAR_B_SYLLABARY = null; public static final UnicodeBlock LINEAR_B_IDEOGRAMS = null; public static final UnicodeBlock AEGEAN_NUMBERS = null; public static final UnicodeBlock OLD_ITALIC = null; public static final UnicodeBlock GOTHIC = null; public static final UnicodeBlock UGARITIC = null; public static final UnicodeBlock DESERET = null; public static final UnicodeBlock SHAVIAN = null; public static final UnicodeBlock OSMANYA = null; public static final UnicodeBlock CYPRIOT_SYLLABARY = null; public static final UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS = null; public static final UnicodeBlock MUSICAL_SYMBOLS = null; public static final UnicodeBlock TAI_XUAN_JING_SYMBOLS = null; public static final UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null; public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null; public static final UnicodeBlock TAGS = null; public static final UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT = null; public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A = null; public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B = null;
/*     */ 
/*     */     UnicodeBlock()
/*     */     {
/*  15 */       super(); throw new RuntimeException("Stub!"); } 
/*  16 */     public static UnicodeBlock forName(String blockName) { throw new RuntimeException("Stub!"); } 
/*  17 */     public static UnicodeBlock of(char c) { throw new RuntimeException("Stub!"); } 
/*  18 */     public static UnicodeBlock of(int codePoint) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class Subset
/*     */   {
/*     */     protected Subset(String string)
/*     */     {
/*   7 */       throw new RuntimeException("Stub!"); } 
/*   8 */     public final boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/*   9 */     public final int hashCode() { throw new RuntimeException("Stub!"); } 
/*  10 */     public final String toString() { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Character
 * JD-Core Version:    0.6.0
 */