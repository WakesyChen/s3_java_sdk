package aws.s3.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import utils.CommonUtils;
public class Test {
		public static Logger log= Logger.getLogger(ObjectOperation.class.getName());
		public Test() {
			System.out.println("construct");
		}
		
		public static void test() {
			String[] name_arr = {"Wakesy", "Coco", "LaoYang", "XiaoFan"};
			List<String> name_list = Arrays.asList(name_arr);
			System.out.println(Arrays.toString(name_arr));
			Object o = new Object(); 
			Map<String, String> map = new HashMap<>();
			map.put("name", "wakesy");
			map.put("name2", "wakesy2");

			
		}
	
		
		public static void main(String[] args) {
			CommonUtils.initLog4jConfig();
			test();
			new Test();
		}
}
