package cn.tmq.service.invoker.client.fallBackClass;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import cn.tmq.service.invoker.client.NoteClient;

@Component
public class NoteClientFallback implements NoteClient{

	private static final String ERROR_CODE = "777";
	
	@Override
	public Map<String, Object> notes(Map<String, String> paramMap) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", ERROR_CODE);
		resultMap.put("message", "调用服务信息：系统异常,获取笔记列表失败");
		return resultMap;
	}
	
	@Override
	public Map<String, Object> note(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", ERROR_CODE);
		resultMap.put("message", "调用服务信息：系统异常,新建笔记失败");
		return resultMap;
	}
	
	@Override
	public Map<String, Object> view(String id) {
		// TODO Auto-generated method stub
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", ERROR_CODE);
		resultMap.put("message", "调用服务信息：系统异常，获取id为【" + id + "】的笔记失败");
		return resultMap;
	}

	@Override
	public Map<String, Object> delete(String id) {
		// TODO Auto-generated method stub
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", ERROR_CODE);
		resultMap.put("message", "调用服务信息：系统异常，删除id为【" + id + "】的笔记失败");
		return resultMap;
	}

	@Override
	public Map<String, Object> update(Map<String, String> paramMap) {
		// TODO Auto-generated method stub
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", ERROR_CODE);
		resultMap.put("message", "调用服务信息：系统异常，修改id为【" + paramMap.get("id") + "】的笔记失败");
		return resultMap;
	}

	@Override
	public Map<String, Object> upload(MultipartFile file) {
		// TODO Auto-generated method stub
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", ERROR_CODE);
		resultMap.put("message", "调用服务信息：系统异常，图片上传失败");
		return resultMap;
	}
}
