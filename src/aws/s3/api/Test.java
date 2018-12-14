package aws.s3.api;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.ObjectName;

import org.apache.log4j.Logger;

import aws.s3.utils.CommonUtils;
public class Test {
		public static Logger log= Logger.getLogger(ObjectOperation.class.getName());
		public Test() {
			System.out.println("construct");
		}
		
		
		public static <T> void test() {
//			AttributeList attributes = new AttributeList();
//			attributes.add(new Attribute("name","wakesy"));
//			attributes.add(new Attribute("name2","wakesy2"));
//	        List<Attribute> attrList = attributes.asList();
//	        
//	        List<Attribute> attrList2 =new ArrayList<Attribute>();
//	        for(Object attr : attributes) {
//	        	attrList2.add((Attribute) attr);
//	        }
	        
	        Queue<T> next = new ArrayDeque<T>();
		}
		
		
		public static void test2() {
			String[] name_arr = {"Wakesy", "Coco", "LaoYang", "XiaoFan"};
			List<String> name_list = Arrays.asList(name_arr);
			System.out.println(Arrays.toString(name_arr));
			Object o = new Object(); 
			Map<String, String> map = new HashMap<>();
			map.put("name", "wakesy");
			map.put("name2", "wakesy2");
			byte[] data = "This is a new world of java, aha~".getBytes();
			byte[] chunkData = Arrays.copyOf(data, 12);
			byte[] chunkData2 =new String(data).substring(0, 12).getBytes();
			System.out.println(new String(chunkData));
			System.out.println(new String(chunkData2));
//			String temp;
//			try {
//				temp = new String("杩欐槸涓�娈典腑鏂�".getBytes("UTF-8"), Charset.forName("UTF-8"));
//				System.out.println(temp);		
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
				
		}
	
		
		public static void main(String[] args) {
			CommonUtils.initLog4jConfig();
			test();
//			new Test();

			
		}
}
