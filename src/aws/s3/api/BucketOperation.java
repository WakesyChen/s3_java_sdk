package aws.s3.api;

import java.util.List;
import aws.s3.api.BaseOperation;
import org.apache.log4j.Logger;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketPolicy;
import com.amazonaws.services.s3.model.SetBucketPolicyRequest;


public class BucketOperation extends BaseOperation {
	
//	public static AmazonS3 s3client ;
//	public static String bucket  ;
	public static Logger log= Logger.getLogger(BucketOperation.class.getName());
		
	
	/*list所有桶*/
	public static void listBuckets() {
		try {
			List<Bucket> buckets = s3client.listBuckets();
			buckets.forEach(bucket -> log.info(bucket.getName()));
		}catch (AmazonServiceException e) {
			e.printStackTrace();
		}
	}
	
	/*创建桶*/
	public static void createBucket(String bucket_name) {
		try {
			s3client.createBucket(bucket_name);
			log.info("create a bucket successfully, " + bucket_name);
		}catch (AmazonServiceException e) {
			e.printStackTrace();
		}
	}
	
	/*删除桶, 桶中对象必须为空*/
	public static void deleteBucket(String bucket_name) {
		try {
			s3client.deleteBucket(bucket_name);
			log.info("delete a bucket successfully, " + bucket_name);
		}catch (AmazonServiceException e) {
			e.printStackTrace();
		}
	}
	
	/*获取桶策略*/
	public static String  getBucketPolicy(String bucket_name) {
		String policy_text = "";
		try {
			BucketPolicy bucket_policy = s3client.getBucketPolicy(bucket_name);
	         policy_text = bucket_policy.getPolicyText();
			log.info("get bucket policy successfully, " + policy_text);
		}catch (AmazonServiceException e) {
			e.printStackTrace();
		}
		return policy_text;
	}
	
	/*设置桶策略,  but not work*/
	public static void setBucketPolicy(String bucket_name, String policy_text) {
		try {
			SetBucketPolicyRequest policy_request = new SetBucketPolicyRequest(bucket_name, policy_text);
			s3client.setBucketPolicy(policy_request);
			log.info("set bucket policy successfully, " + policy_text);
		}catch (AmazonServiceException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bucket_name = "wakesy2";
		BucketOperation bucket_operation = new BucketOperation();
//		listBuckets();
//		createBucket(bucket_name);
		deleteBucket(bucket_name);
//		getBucketPolicy(bucket_name);
	}

}
