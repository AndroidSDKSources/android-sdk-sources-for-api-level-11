/*    */ package android.widget;
/*    */ 
/*    */ import android.app.SearchableInfo;
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View.OnClickListener;
/*    */ import android.view.View.OnFocusChangeListener;
/*    */ 
/*    */ public class SearchView extends LinearLayout
/*    */ {
/*    */   public SearchView(Context context)
/*    */   {
/* 19 */     super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 20 */   public SearchView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0); throw new RuntimeException("Stub!"); } 
/* 21 */   public void setSearchableInfo(SearchableInfo searchable) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setOnQueryTextListener(OnQueryTextListener listener) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setOnCloseListener(OnCloseListener listener) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener listener) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setOnSuggestionListener(OnSuggestionListener listener) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setOnSearchClickListener(View.OnClickListener listener) { throw new RuntimeException("Stub!"); } 
/* 27 */   public CharSequence getQuery() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setQuery(CharSequence query, boolean submit) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setQueryHint(CharSequence hint) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setIconifiedByDefault(boolean iconified) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean isIconfiedByDefault() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setIconified(boolean iconify) { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean isIconified() { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setSubmitButtonEnabled(boolean enabled) { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean isSubmitButtonEnabled() { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setQueryRefinementEnabled(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean isQueryRefinementEnabled() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setSuggestionsAdapter(CursorAdapter adapter) { throw new RuntimeException("Stub!"); } 
/* 39 */   public CursorAdapter getSuggestionsAdapter() { throw new RuntimeException("Stub!"); } 
/* 40 */   public void setMaxWidth(int maxpixels) { throw new RuntimeException("Stub!"); } 
/* 41 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); } 
/* 42 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnSuggestionListener
/*    */   {
/*    */     public abstract boolean onSuggestionSelect(int paramInt);
/*    */ 
/*    */     public abstract boolean onSuggestionClick(int paramInt);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnCloseListener
/*    */   {
/*    */     public abstract boolean onClose();
/*    */   }
/*    */ 
/*    */   public static abstract interface OnQueryTextListener
/*    */   {
/*    */     public abstract boolean onQueryTextSubmit(String paramString);
/*    */ 
/*    */     public abstract boolean onQueryTextChange(String paramString);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.SearchView
 * JD-Core Version:    0.6.0
 */