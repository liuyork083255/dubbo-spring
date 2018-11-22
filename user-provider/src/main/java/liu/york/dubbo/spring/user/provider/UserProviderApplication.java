package liu.york.dubbo.spring.user.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
/**
 * 由于采用xml配置方式调用服务，所以这里必须指明加载文件
 */
@ImportResource("classpath:provider.xml")
public class UserProviderApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(UserProviderApplication.class, args);
		TimeUnit.DAYS.sleep(1);
	}
}
