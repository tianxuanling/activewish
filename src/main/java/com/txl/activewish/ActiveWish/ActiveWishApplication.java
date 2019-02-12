package com.txl.activewish.ActiveWish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.txl.activewish.ActiveWish.controller.AllFilesController;
import com.txl.activewish.ActiveWish.listener.FileListener;
import com.txl.activewish.ActiveWish.listener.FileMonitor;
import com.txl.activewish.ActiveWish.util.LogUtil;
import com.txl.activewish.ActiveWish.util.PropertiesUtil;

@SpringBootApplication
public class ActiveWishApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ActiveWishApplication.class, args);
		
		LogUtil.initLogContext().info("The ActiveMessage service is startup successfully!");
		PropertiesUtil.initPropertiesContext();
		LogUtil.initLogContext().info("关键配置文件加载成功!");

		// 启动文件监控
		FileMonitor m = new FileMonitor(5000);
		m.monitor(PropertiesUtil.AM_MONITOR_ROOT_DIRECTORY, new FileListener());
		m.start();
		
		// 启动全量文件检测
		//AllFilesController allFilesController = new AllFilesController();
		//allFilesController.launchAllFiles();
	}
	
	@Bean
    @Primary
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        // 1、需要先定义一个 convert 转换消息的对象;
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        // 2、添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat,
                SerializerFeature.DisableCircularReferenceDetect);
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
        // 3、在convert中添加配置信息.
        fastConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }
}