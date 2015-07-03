package android.speech;

import android.os.Bundle;

public abstract interface RecognitionListener
{
  public abstract void onReadyForSpeech(Bundle paramBundle);

  public abstract void onBeginningOfSpeech();

  public abstract void onRmsChanged(float paramFloat);

  public abstract void onBufferReceived(byte[] paramArrayOfByte);

  public abstract void onEndOfSpeech();

  public abstract void onError(int paramInt);

  public abstract void onResults(Bundle paramBundle);

  public abstract void onPartialResults(Bundle paramBundle);

  public abstract void onEvent(int paramInt, Bundle paramBundle);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.speech.RecognitionListener
 * JD-Core Version:    0.6.0
 */