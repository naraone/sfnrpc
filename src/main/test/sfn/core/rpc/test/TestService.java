/*
 * Free software. Use at your own risk. Okay to modify and re-distribute.
 * Thank you
 * 
 */
package sfn.core.rpc.test;

public class TestService {
    private static TestService ts = new TestService();
    public static TestService getInstance(){
        return ts;
    }
    private TestService(){}
    public TestServerObject echo(TestClientObject testClientObject){
    	TestServerObject tso = new TestServerObject();
        tso.data = testClientObject.data+"#echoed back from server";
        return tso;
    }
}
