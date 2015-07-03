/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class InputDevice
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int SOURCE_CLASS_MASK = 255;
/*    */   public static final int SOURCE_CLASS_BUTTON = 1;
/*    */   public static final int SOURCE_CLASS_POINTER = 2;
/*    */   public static final int SOURCE_CLASS_TRACKBALL = 4;
/*    */   public static final int SOURCE_CLASS_POSITION = 8;
/*    */   public static final int SOURCE_UNKNOWN = 0;
/*    */   public static final int SOURCE_KEYBOARD = 257;
/*    */   public static final int SOURCE_DPAD = 513;
/*    */   public static final int SOURCE_TOUCHSCREEN = 4098;
/*    */   public static final int SOURCE_MOUSE = 8194;
/*    */   public static final int SOURCE_TRACKBALL = 65540;
/*    */   public static final int SOURCE_TOUCHPAD = 1048584;
/*    */   public static final int SOURCE_ANY = -256;
/*    */   public static final int MOTION_RANGE_X = 0;
/*    */   public static final int MOTION_RANGE_Y = 1;
/*    */   public static final int MOTION_RANGE_PRESSURE = 2;
/*    */   public static final int MOTION_RANGE_SIZE = 3;
/*    */   public static final int MOTION_RANGE_TOUCH_MAJOR = 4;
/*    */   public static final int MOTION_RANGE_TOUCH_MINOR = 5;
/*    */   public static final int MOTION_RANGE_TOOL_MAJOR = 6;
/*    */   public static final int MOTION_RANGE_TOOL_MINOR = 7;
/*    */   public static final int MOTION_RANGE_ORIENTATION = 8;
/*    */   public static final int KEYBOARD_TYPE_NONE = 0;
/*    */   public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;
/*    */   public static final int KEYBOARD_TYPE_ALPHABETIC = 2;
/* 52 */   public static final Parcelable.Creator<InputDevice> CREATOR = null;
/*    */ 
/*    */   InputDevice()
/*    */   {
/* 14 */     throw new RuntimeException("Stub!"); } 
/* 15 */   public static InputDevice getDevice(int id) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static int[] getDeviceIds() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getId() { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getSources() { throw new RuntimeException("Stub!"); } 
/* 20 */   public int getKeyboardType() { throw new RuntimeException("Stub!"); } 
/* 21 */   public KeyCharacterMap getKeyCharacterMap() { throw new RuntimeException("Stub!"); } 
/* 22 */   public MotionRange getMotionRange(int rangeType) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 25 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class MotionRange
/*    */   {
/*    */     MotionRange()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public float getMin() { throw new RuntimeException("Stub!"); } 
/*  9 */     public float getMax() { throw new RuntimeException("Stub!"); } 
/* 10 */     public float getRange() { throw new RuntimeException("Stub!"); } 
/* 11 */     public float getFlat() { throw new RuntimeException("Stub!"); } 
/* 12 */     public float getFuzz() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.InputDevice
 * JD-Core Version:    0.6.0
 */