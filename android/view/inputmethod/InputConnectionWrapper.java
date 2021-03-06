/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.view.KeyEvent;
/*    */ 
/*    */ public class InputConnectionWrapper
/*    */   implements InputConnection
/*    */ {
/*    */   public InputConnectionWrapper(InputConnection target, boolean mutable)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setTarget(InputConnection target) { throw new RuntimeException("Stub!"); } 
/*  7 */   public CharSequence getTextBeforeCursor(int n, int flags) { throw new RuntimeException("Stub!"); } 
/*  8 */   public CharSequence getTextAfterCursor(int n, int flags) { throw new RuntimeException("Stub!"); } 
/*  9 */   public CharSequence getSelectedText(int flags) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getCursorCapsMode(int reqModes) { throw new RuntimeException("Stub!"); } 
/* 11 */   public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean deleteSurroundingText(int leftLength, int rightLength) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean setComposingText(CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean setComposingRegion(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean finishComposingText() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean commitText(CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean commitCompletion(CompletionInfo text) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean commitCorrection(CorrectionInfo correctionInfo) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean setSelection(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean performEditorAction(int editorAction) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean performContextMenuAction(int id) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean beginBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean endBatchEdit() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean sendKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean clearMetaKeyStates(int states) { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean reportFullscreenMode(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean performPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.inputmethod.InputConnectionWrapper
 * JD-Core Version:    0.6.0
 */