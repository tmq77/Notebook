package cn.tmq.service.notebook.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tmq.service.notebook.entity.MNotes;
import cn.tmq.service.notebook.mapper.MNotesMapper;

@Service
public class ViewNoteService {

	@Autowired
	private MNotesMapper mapper;
	
	/**
	 * 获取笔记
	 * @param id
	 * @return
	 */
	public MNotes selectNotesById(String id) {
		if (id == null || !Pattern.matches("^[2-9][0-9]{17,}$", id)) {
			// id合法性验证：纯数字并且大于等于18位并且开头为2(包含)以上
			return null;
		}
		return this.mapper.selectByPrimaryKey(id);
	} 
}
