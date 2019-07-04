package com.txl.activewish.ActiveWish.kafka;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ThreadPoolTask implements Runnable{
	private int i = 0;
    private AtomicLong along;

    ThreadPoolTask(int i, AtomicLong along) {
        this.i = i;
        this.along = along;
    }
    
    @Override
    public void run() {
        try {
            // 模拟业务逻辑
        	doProducer();
            along.addAndGet(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "  " + i);
    }
    
    public void doProducer() {
    	Properties props = new Properties();
		props.put("bootstrap.servers", "192.168.10.199:9092");
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		Producer<String, String> producer = new KafkaProducer<>(props);
		for (int i = 0; i < 10; i++) {
			producer.send(new ProducerRecord<String, String>("kafka-test1", "test" + i, "{"+ i +"/mnt/activewishfiles/包装资料共享平台/发货唛头和标牌/1908-999矿山建材产品/0708-1708/0808-999/0808-042D J493M新标牌（121+3福建）第2台.doc}"));
			System.out.println("kafka-test1" + i);
		}

		producer.close();
    }
}
