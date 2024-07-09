

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Random;
// --- <<IS-END-IMPORTS>> ---

public final class SecurityTabCheck

{
	// ---( internal utility methods )---

	final static SecurityTabCheck _instance = new SecurityTabCheck();

	static SecurityTabCheck _newInstance() { return new SecurityTabCheck(); }

	static SecurityTabCheck _cast(Object o) { return (SecurityTabCheck)o; }

	// ---( server methods )---




	public static final void JavaServ1 (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(JavaServ1)>> ---
		// @sigtype java 3.5
		Random rand = new Random();
		 int randomNum = rand.nextInt(10000);
		 String outRandomNum=""+randomNum;
		 
		// pipeline
		 IDataCursor pipelineCursor = pipeline.getCursor();
		 IDataUtil.put( pipelineCursor, "outRandomNum", outRandomNum);
		 pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

