package Example_01;

import java.rmi.Remote;
import java.rmi.RemoteException;

//這裏定義服務器端要調用的方法
public interface CallBack extends Remote {

	public void takeTurn(boolean turn) throws RemoteException;

	public void notify(java.lang.String message) throws RemoteException;

	public void mark(int row, int column, char token) throws RemoteException;

}
