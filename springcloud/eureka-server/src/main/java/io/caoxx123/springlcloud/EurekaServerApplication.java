package io.caoxx123.springlcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import cn.hutool.core.util.NetUtil;

@SpringBootApplication
@EnableEurekaServer // 注册中心 EurekaServer 本身就是个 Springboot 微服务, 所以它有 @SpringBootApplication 注解。
public class EurekaServerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 8761;
		if (!NetUtil.isUsableLocalPort(port)) {
			System.out.printf("端口%d被占用，无法启动%n", port);
			System.exit(1);
		}
		new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.port=" + port).run(args);
	}

}
