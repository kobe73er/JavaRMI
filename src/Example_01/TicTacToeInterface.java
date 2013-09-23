package Example_01;

import java.rmi.Remote;
import java.rmi.RemoteException;

//這裏配置的是客戶端發送的信息
public interface TicTacToeInterface extends Remote {
	public char connect(CallBack client) throws RemoteException;
	
	public void myMove(int row,int column,char token) throws RemoteException;

}
