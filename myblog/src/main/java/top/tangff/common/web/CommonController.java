package top.tangff.common.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import top.tangff.common.utils.FastDFSClient;
import top.tangff.common.utils.JsonUtils;

@Controller
public class CommonController {
	@Value("${PICTRUE_SERVER_URL}")
	private String PICTRUE_SERVER_URL;
	@RequestMapping("/uploadImage")
	@ResponseBody
	public String uploadFile(@RequestParam(value = "uploadFile")MultipartFile file){
		Map result = new HashMap<>();
		try {
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:conf/client.conf");
			//获得扩展名
			String originalFilename = file.getOriginalFilename();
			String extname = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
			String url = fastDFSClient.uploadFile(file.getBytes(), extname);
			url = PICTRUE_SERVER_URL + url;
			result.put("name", file.getOriginalFilename());// 新的文件名
			result.put("state", "SUCCESS");  
			result.put("url", url);  
			result.put("size", file.getSize());
			result.put("original", file.getOriginalFilename());
			result.put("imagePathFormat", url);
		} catch (Exception e) {
		}
		System.out.println(JsonUtils.objectToJson(result));
		return JsonUtils.objectToJson(result);
	}
}
