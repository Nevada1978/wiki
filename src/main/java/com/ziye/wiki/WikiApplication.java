package com.ziye.wiki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WikiApplication {

	private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WikiApplication.class);
		Environment env;

		// 应该先运行app，然后获取Environment对象
		ConfigurableApplicationContext context = app.run(args);
		env = context.getEnvironment();

		// 将日志记录移到环境变量访问之后，并且放在正确的代码块内
		LOG.info("启动成功");
		LOG.info("地址: http://127.0.0.1:{}/", env.getProperty("server.port"));

	}
}
