package com.tuyano.libro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@Configuration
public class SampleBeanConfig {

	@Bean
	public SampleBeanInterface SampleBeanConfig() {
		return new SampleBean("設定クラスで作成したインスタンｽ");
	}
}
