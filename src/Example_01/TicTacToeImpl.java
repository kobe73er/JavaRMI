package Example_01;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TicTacToeImpl extends UnicastRemoteObject implements
		TicTacToeInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TicTacToeImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicTacToeImpl(int port) throws RemoteException {
		super(port);
	}

	@Override
	public char connect(CallBack client) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void myMove(int row, int column, char token) throws RemoteException {
		// TODO Auto-generated method stub

	}

}
