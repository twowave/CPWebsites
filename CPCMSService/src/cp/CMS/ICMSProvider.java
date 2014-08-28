package cp.CMS;

import java.util.Map;

public interface ICMSProvider {
	String ParseOutput(Map<String,String> contentData, String template);
	
}