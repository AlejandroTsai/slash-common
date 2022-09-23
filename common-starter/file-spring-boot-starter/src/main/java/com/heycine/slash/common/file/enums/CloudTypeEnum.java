package com.heycine.slash.common.file.enums;

/**
 * 错误码枚举
 * @author zzj
 */
public enum CloudTypeEnum {
	/**
	 * 七牛云
	 */
	QINIU(1, "七牛云"),
	/**
	 * 阿里云
	 */
	ALIYUN(2, "阿里云"),
	/**
	 * 腾讯云
	 */
	QCLOUD(3, "腾讯云"),
	/**
	 * FASTDFS
	 */
	FASTDFS(4, "FASTDFS"),
	/**
	 * 本地
	 */
	LOCAL(5, "本地"),
	/**
	 * MinIO
	 */
	MINIO(6, "MinIO");

	;

	private final Integer code;
	private final String info;

	CloudTypeEnum(Integer code, String info) {
		this.code = code;
		this.info = info;
	}

	public Integer getCode() {
		return code;
	}

	public String getInfo() {
		return info;
	}
}
