package com.txl.activewish.ActiveWish.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaProducerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.put("bootstrap.servers", "192.168.100.40:9092");
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		Producer<String, String> producer = new KafkaProducer<>(props);
		for (int i = 0; i < 1000; i++) {
			producer.send(new ProducerRecord<String, String>("kafka-test1", "test" + i, "{"+ i +"/mnt/activewishfiles/包装资料共享平台/发货唛头和标牌/1908-999矿山建材产品/0708-1708/0808-999/0808-042D J493M新标牌（121+3福建）第2台.doc}"));
			System.out.println("kafka-test1" + i);
		}

		producer.close();
	}

}
