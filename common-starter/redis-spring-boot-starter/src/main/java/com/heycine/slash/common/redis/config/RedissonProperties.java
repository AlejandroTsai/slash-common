package com.heycine.slash.common.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * ::优雅编程，此刻做起！
 * ::Elegant programming, start now!
 *
 * @author zhiji.zhou
 * @date 2022/9/23 下午2:58
 */
@ConfigurationProperties(prefix = "heycine.redisson")
public class RedissonProperties {
	private String host = "localhost";

	private int port = 6379;

	private int timeour;

	private boolean ssl;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getTimeour() {
		return timeour;
	}

	public void setTimeour(int timeour) {
		this.timeour = timeour;
	}

	public boolean isSsl() {
		return ssl;
	}

	public void setSsl(boolean ssl) {
		this.ssl = ssl;
	}
}
