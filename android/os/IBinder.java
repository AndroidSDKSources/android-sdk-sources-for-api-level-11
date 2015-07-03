package android.os;

import java.io.FileDescriptor;

public abstract interface IBinder
{
  public static final int FIRST_CALL_TRANSACTION = 1;
  public static final int LAST_CALL_TRANSACTION = 16777215;
  public static final int PING_TRANSACTION = 1599098439;
  public static final int DUMP_TRANSACTION = 1598311760;
  public static final int INTERFACE_TRANSACTION = 1598968902;
  public static final int FLAG_ONEWAY = 1;

  public abstract String getInterfaceDescriptor()
    throws RemoteException;

  public abstract boolean pingBinder();

  public abstract boolean isBinderAlive();

  public abstract IInterface queryLocalInterface(String paramString);

  public abstract void dump(FileDescriptor paramFileDescriptor, String[] paramArrayOfString)
    throws RemoteException;

  public abstract boolean transact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException;

  public abstract void linkToDeath(DeathRecipient paramDeathRecipient, int paramInt)
    throws RemoteException;

  public abstract boolean unlinkToDeath(DeathRecipient paramDeathRecipient, int paramInt);

  public static abstract interface DeathRecipient
  {
    public abstract void binderDied();
  }
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.IBinder
 * JD-Core Version:    0.6.0
 */