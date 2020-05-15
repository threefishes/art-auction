package cn.threefishes;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 3600)
//排除冲突依赖-上传文件使用
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
@MapperScan("cn.threefishes.cloudrepository.dao")
//开启定时任务
@EnableScheduling
public class CloudMainServiceEntranceApplication {
	private final static Logger logger = LoggerFactory.getLogger(CloudMainServiceEntranceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudMainServiceEntranceApplication.class, args);
	}

}
