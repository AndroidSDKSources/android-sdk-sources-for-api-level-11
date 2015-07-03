/*    */ package android.view;
/*    */ 
/*    */ import android.util.AndroidRuntimeException;
/*    */ 
/*    */ public class KeyCharacterMap
/*    */ {
/*    */   public static final int BUILT_IN_KEYBOARD = 0;
/*    */   public static final int VIRTUAL_KEYBOARD = -1;
/*    */   public static final int NUMERIC = 1;
/*    */   public static final int PREDICTIVE = 2;
/*    */   public static final int ALPHA = 3;
/*    */   public static final int FULL = 4;
/*    */   public static final int SPECIAL_FUNCTION = 5;
/*    */   public static final char HEX_INPUT = '';
/*    */   public static final char PICKER_DIALOG_INPUT = '';
/*    */   public static final int MODIFIER_BEHAVIOR_CHORDED = 0;
/*    */   public static final int MODIFIER_BEHAVIOR_CHORDED_OR_TOGGLED = 1;
/*    */   public static final int COMBINING_ACCENT = -2147483648;
/*    */   public static final int COMBINING_ACCENT_MASK = 2147483647;
/*    */ 
/*    */   KeyCharacterMap()
/*    */   {
/* 18 */     throw new RuntimeException("Stub!"); } 
/* 19 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 20 */   public static KeyCharacterMap load(int deviceId) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int get(int keyCode, int metaState) { throw new RuntimeException("Stub!"); } 
/* 22 */   public char getNumber(int keyCode) { throw new RuntimeException("Stub!"); } 
/* 23 */   public char getMatch(int keyCode, char[] chars) { throw new RuntimeException("Stub!"); } 
/* 24 */   public char getMatch(int keyCode, char[] chars, int metaState) { throw new RuntimeException("Stub!"); } 
/* 25 */   public char getDisplayLabel(int keyCode) { throw new RuntimeException("Stub!"); } 
/* 26 */   public static int getDeadChar(int accent, int c) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean getKeyData(int keyCode, KeyData results) { throw new RuntimeException("Stub!"); } 
/* 28 */   public KeyEvent[] getEvents(char[] chars) { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean isPrintingKey(int keyCode) { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getKeyboardType() { throw new RuntimeException("Stub!"); } 
/* 31 */   public int getModifierBehavior() { throw new RuntimeException("Stub!"); } 
/* 32 */   public static boolean deviceHasKey(int keyCode) { throw new RuntimeException("Stub!"); } 
/* 33 */   public static boolean[] deviceHasKeys(int[] keyCodes) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class UnavailableException extends AndroidRuntimeException
/*    */   {
/*    */     public UnavailableException(String msg)
/*    */     {
/* 16 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   @Deprecated
/*    */   public static class KeyData
/*    */   {
/*    */     public static final int META_LENGTH = 4;
/*    */     public char displayLabel;
/*    */     public char number;
/* 11 */     public char[] meta = null;
/*    */ 
/*    */     public KeyData()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.KeyCharacterMap
 * JD-Core Version:    0.6.0
 */