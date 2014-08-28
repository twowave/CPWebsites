package cp.CMS;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class CMSProvider implements ICMSProvider {

	 private VelocityEngine _vltEngine;
     private VelocityContext _vltContext;
	private static CMSProvider _instance=new CMSProvider();
	public static ICMSProvider GetInstance(){
		return _instance;
	}
	private CMSProvider(){ 
		 _vltEngine = new VelocityEngine();
         _vltEngine.init();
         _vltContext = new VelocityContext();
	}
	public String ParseOutput(Map<String,String> contentData, String template){

		StringWriter vltWriter = new StringWriter();
        if (contentData != null)
        {
        	Iterator<Entry<String, String>> iter = contentData.entrySet().iterator();
        	while (iter.hasNext()) 
            {
        		Map.Entry<String,String> entry = (Map.Entry<String,String>) iter.next();
        		Object key = entry.getKey();
        		Object val = entry.getValue();
                _vltContext.put(key.toString(), val.toString());
            }

            _vltEngine.evaluate(_vltContext, vltWriter, null, template);
        }

        return vltWriter.toString();
	}
	
}
