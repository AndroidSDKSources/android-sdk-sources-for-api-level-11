package javax.microedition.khronos.opengles;

import java.nio.IntBuffer;

public abstract interface GL10Ext extends GL
{
  public abstract int glQueryMatrixxOES(int[] paramArrayOfInt1, int paramInt1, int[] paramArrayOfInt2, int paramInt2);

  public abstract int glQueryMatrixxOES(IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.microedition.khronos.opengles.GL10Ext
 * JD-Core Version:    0.6.0
 */