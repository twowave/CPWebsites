package cp.CMS;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
/* 基于Velocity的CMS实现 */
public class CMSProvider implements ICMSProvider {

	 private VelocityEngine _vltEngine;
     private VelocityContext _vltContext;
	private static CMSProvider _instance=new CMSProvider();
	public static ICMSProvider GetInstance(){
		return _instance;
	}
	private CMSProvider(){ 
		 _vltEngine = new VelocityEngine();
         try {
			_vltEngine.init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         _vltContext = new VelocityContext();
	}
	//将标签和数据在Velocity中进行转换，输出模板转换后的内容
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

            try {
				_vltEngine.evaluate(_vltContext, vltWriter, null, template);
			} catch (ParseErrorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MethodInvocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ResourceNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        return vltWriter.toString();
	}
	
}
