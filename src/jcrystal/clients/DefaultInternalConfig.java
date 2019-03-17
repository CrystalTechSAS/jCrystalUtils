/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.clients;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public final class DefaultInternalConfig implements IInternalConfig, Serializable{
	private static final long serialVersionUID = -5447803111496332057L;
	
	private String id;
	private boolean embeddedResponse;
	
	private String baseURL;
	private Map<String, String> baseUrlConfigs = new TreeMap<>();
	
	private String SUCCESS_NAME = "success";
	private Class<?> SUCCESS_TYPE = int.class;
	private Object SUCCESS_DAFAULT_VALUE = 1;
	private String ERROR_MESSAGE_NAME = "mensaje";
	private String SUCCESS_CONDITION = "success == 1";
	private String ERROR_CONDITION = "success == 2";
	private String UNATHORIZED_CONDITION = "success == 3";
	
	
	@Override public String SUCCESS_NAME() {
		return SUCCESS_NAME;
	}
	@Override public Class<?> SUCCESS_TYPE() {
		return SUCCESS_TYPE;
	}
	@Override public Object SUCCESS_DAFAULT_VALUE() {
		return SUCCESS_DAFAULT_VALUE;
	}
	@Override public String ERROR_MESSAGE_NAME() {
		return ERROR_MESSAGE_NAME;
	}
	@Override public String SUCCESS_CONDITION() {
		return SUCCESS_CONDITION;
	}
	@Override public String ERROR_CONDITION() {
		return ERROR_CONDITION;
	}
	@Override public String UNATHORIZED_CONDITION() {
		return UNATHORIZED_CONDITION;
	}
	@Override public String BASE_URL(String platform) {
		if(platform != null && baseUrlConfigs != null) {
			String ret = baseUrlConfigs.get(platform);
			if(ret != null)
				return ret;
		}
		return baseURL;
	}
	@Override
	public boolean embeddedResponse() {
		return embeddedResponse;
	}
	@Override
	public String id() {
		return id;
	}
	public DefaultInternalConfig id(String id) {
		this.id = id;
		return this;
	}
	
	public DefaultInternalConfig embeddedResponse(boolean value) {
		embeddedResponse = value;
		return this;
	}
	public DefaultInternalConfig baseURL(String baseURL) {
		this.baseURL = baseURL;
		return this;
	}
	public DefaultInternalConfig addUrlConfig(String platform, String url) {
		baseUrlConfigs.put(platform, url);
		return this;
	}
	public DefaultInternalConfig SUCCESS_NAME(String sUCCESS_NAME) {
		SUCCESS_NAME = sUCCESS_NAME;
		return this;
	}
	public DefaultInternalConfig SUCCESS_TYPE(Class<?> sUCCESS_TYPE) {
		SUCCESS_TYPE = sUCCESS_TYPE;
		return this;
	}
	public DefaultInternalConfig SUCCESS_DAFAULT_VALUE(Object sUCCESS_DAFAULT_VALUE) {
		SUCCESS_DAFAULT_VALUE = sUCCESS_DAFAULT_VALUE;
		return this;
	}
	public DefaultInternalConfig ERROR_MESSAGE_NAME(String eRROR_MESSAGE_NAME) {
		ERROR_MESSAGE_NAME = eRROR_MESSAGE_NAME;
		return this;
	}
	public DefaultInternalConfig SUCCESS_CONDITION(String sUCCESS_CONDITION) {
		SUCCESS_CONDITION = sUCCESS_CONDITION;
		return this;
	}
	public DefaultInternalConfig ERROR_CONDITION(String eRROR_CONDITION) {
		ERROR_CONDITION = eRROR_CONDITION;
		return this;
	}
	public DefaultInternalConfig UNATHORIZED_CONDITION(String uNATHORIZED_CONDITION) {
		UNATHORIZED_CONDITION = uNATHORIZED_CONDITION;
		return this;
	}
	
	
}
