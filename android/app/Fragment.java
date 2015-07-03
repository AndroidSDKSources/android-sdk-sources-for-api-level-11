/*    */ package android.app;
/*    */ 
/*    */ import android.animation.Animator;
/*    */ import android.content.ComponentCallbacks;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.res.Configuration;
/*    */ import android.content.res.Resources;
/*    */ import android.os.Bundle;
/*    */ import android.util.AndroidRuntimeException;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ContextMenu;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
/*    */ import android.view.LayoutInflater;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuInflater;
/*    */ import android.view.MenuItem;
/*    */ import android.view.View;
/*    */ import android.view.View.OnCreateContextMenuListener;
/*    */ import android.view.ViewGroup;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class Fragment
/*    */   implements ComponentCallbacks, View.OnCreateContextMenuListener
/*    */ {
/*    */   public Fragment()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public static Fragment instantiate(Context context, String fname) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static Fragment instantiate(Context context, String fname, Bundle args) { throw new RuntimeException("Stub!"); } 
/* 13 */   public final boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final int hashCode() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final int getId() { throw new RuntimeException("Stub!"); } 
/* 17 */   public final String getTag() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setArguments(Bundle args) { throw new RuntimeException("Stub!"); } 
/* 19 */   public final Bundle getArguments() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setTargetFragment(Fragment fragment, int requestCode) { throw new RuntimeException("Stub!"); } 
/* 21 */   public final Fragment getTargetFragment() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final int getTargetRequestCode() { throw new RuntimeException("Stub!"); } 
/* 23 */   public final Activity getActivity() { throw new RuntimeException("Stub!"); } 
/* 24 */   public final Resources getResources() { throw new RuntimeException("Stub!"); } 
/* 25 */   public final CharSequence getText(int resId) { throw new RuntimeException("Stub!"); } 
/* 26 */   public final String getString(int resId) { throw new RuntimeException("Stub!"); } 
/* 27 */   public final String getString(int resId, Object[] formatArgs) { throw new RuntimeException("Stub!"); } 
/* 28 */   public final FragmentManager getFragmentManager() { throw new RuntimeException("Stub!"); } 
/* 29 */   public final boolean isAdded() { throw new RuntimeException("Stub!"); } 
/* 30 */   public final boolean isRemoving() { throw new RuntimeException("Stub!"); } 
/* 31 */   public final boolean isInLayout() { throw new RuntimeException("Stub!"); } 
/* 32 */   public final boolean isResumed() { throw new RuntimeException("Stub!"); } 
/* 33 */   public final boolean isVisible() { throw new RuntimeException("Stub!"); } 
/* 34 */   public final boolean isHidden() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void onHiddenChanged(boolean hidden) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setRetainInstance(boolean retain) { throw new RuntimeException("Stub!"); } 
/* 37 */   public final boolean getRetainInstance() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setHasOptionsMenu(boolean hasMenu) { throw new RuntimeException("Stub!"); } 
/* 39 */   public LoaderManager getLoaderManager() { throw new RuntimeException("Stub!"); } 
/* 40 */   public void startActivity(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void startActivityForResult(Intent intent, int requestCode) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void onInflate(AttributeSet attrs, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void onAttach(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 45 */   public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 47 */   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 48 */   public View getView() { throw new RuntimeException("Stub!"); } 
/* 49 */   public void onActivityCreated(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 50 */   public void onStart() { throw new RuntimeException("Stub!"); } 
/* 51 */   public void onResume() { throw new RuntimeException("Stub!"); } 
/* 52 */   public void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 54 */   public void onPause() { throw new RuntimeException("Stub!"); } 
/* 55 */   public void onStop() { throw new RuntimeException("Stub!"); } 
/* 56 */   public void onLowMemory() { throw new RuntimeException("Stub!"); } 
/* 57 */   public void onDestroyView() { throw new RuntimeException("Stub!"); } 
/* 58 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 59 */   public void onDetach() { throw new RuntimeException("Stub!"); } 
/* 60 */   public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) { throw new RuntimeException("Stub!"); } 
/* 61 */   public void onPrepareOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); } 
/* 62 */   public void onDestroyOptionsMenu() { throw new RuntimeException("Stub!"); } 
/* 63 */   public boolean onOptionsItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void onOptionsMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); } 
/* 65 */   public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void registerForContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/* 67 */   public void unregisterForContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/* 68 */   public boolean onContextItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); } 
/* 69 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class InstantiationException extends AndroidRuntimeException
/*    */   {
/*    */     public InstantiationException(String msg, Exception cause)
/*    */     {
/*  8 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.Fragment
 * JD-Core Version:    0.6.0
 */