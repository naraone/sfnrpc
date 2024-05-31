/*
 * Free software. Use at your own risk. Okay to modify and re-distribute.
 * Thank you
 * 
 */
package sfn.core.rpc.server;

public class RPCServerTooBusyException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RPCServerTooBusyException(String message){
		super(message);
	}
}
