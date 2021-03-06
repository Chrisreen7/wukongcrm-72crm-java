package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminFleldStyle<M extends BaseAdminFleldStyle<M>> extends Model<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return getLong("id");
	}

	public void setStyle(Integer style) {
		set("style", style);
	}

	public Integer getStyle() {
		return getInt("style");
	}

	public void setType(Integer type) {
		set("type", type);
	}

	public Integer getType() {
		return getInt("type");
	}

	public void setFieldName(String fieldName) {
		set("field_name", fieldName);
	}

	public String getFieldName() {
		return getStr("field_name");
	}

	public void setUserId(Long userId) {
		set("user_id", userId);
	}

	public Long getUserId() {
		return getLong("user_id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}


}
