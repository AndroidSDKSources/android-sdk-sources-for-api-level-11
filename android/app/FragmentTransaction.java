/*   */ package android.app;
/*   */ 
/*   */ public abstract class FragmentTransaction
/*   */ {
/*   */   public static final int TRANSIT_ENTER_MASK = 4096;
/*   */   public static final int TRANSIT_EXIT_MASK = 8192;
/*   */   public static final int TRANSIT_UNSET = -1;
/*   */   public static final int TRANSIT_NONE = 0;
/*   */   public static final int TRANSIT_FRAGMENT_OPEN = 4097;
/*   */   public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
/*   */   public static final int TRANSIT_FRAGMENT_FADE = 4099;
/*   */ 
/*   */   public FragmentTransaction()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract FragmentTransaction add(Fragment paramFragment, String paramString);
/*   */ 
/*   */   public abstract FragmentTransaction add(int paramInt, Fragment paramFragment);
/*   */ 
/*   */   public abstract FragmentTransaction add(int paramInt, Fragment paramFragment, String paramString);
/*   */ 
/*   */   public abstract FragmentTransaction replace(int paramInt, Fragment paramFragment);
/*   */ 
/*   */   public abstract FragmentTransaction replace(int paramInt, Fragment paramFragment, String paramString);
/*   */ 
/*   */   public abstract FragmentTransaction remove(Fragment paramFragment);
/*   */ 
/*   */   public abstract FragmentTransaction hide(Fragment paramFragment);
/*   */ 
/*   */   public abstract FragmentTransaction show(Fragment paramFragment);
/*   */ 
/*   */   public abstract boolean isEmpty();
/*   */ 
/*   */   public abstract FragmentTransaction setCustomAnimations(int paramInt1, int paramInt2);
/*   */ 
/*   */   public abstract FragmentTransaction setTransition(int paramInt);
/*   */ 
/*   */   public abstract FragmentTransaction setTransitionStyle(int paramInt);
/*   */ 
/*   */   public abstract FragmentTransaction addToBackStack(String paramString);
/*   */ 
/*   */   public abstract boolean isAddToBackStackAllowed();
/*   */ 
/*   */   public abstract FragmentTransaction disallowAddToBackStack();
/*   */ 
/*   */   public abstract FragmentTransaction setBreadCrumbTitle(int paramInt);
/*   */ 
/*   */   public abstract FragmentTransaction setBreadCrumbTitle(CharSequence paramCharSequence);
/*   */ 
/*   */   public abstract FragmentTransaction setBreadCrumbShortTitle(int paramInt);
/*   */ 
/*   */   public abstract FragmentTransaction setBreadCrumbShortTitle(CharSequence paramCharSequence);
/*   */ 
/*   */   public abstract int commit();
/*   */ 
/*   */   public abstract int commitAllowingStateLoss();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.FragmentTransaction
 * JD-Core Version:    0.6.0
 */