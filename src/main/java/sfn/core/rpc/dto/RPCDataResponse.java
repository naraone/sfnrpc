/*
 * Free software. Use at your own risk. Okay to modify and re-distribute.
 * Thank you
 * 
 */
package sfn.core.rpc.dto;

import java.io.Serializable;

public class RPCDataResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Object object;
	public long serialNumber=-1L;
	public String toString(){
		return this.serialNumber+"";
	}
}
