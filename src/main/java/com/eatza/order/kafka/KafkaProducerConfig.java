package com.eatza.order.kafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.eatza.order.dto.DeliveryRequestDto;

@Configuration
public class KafkaProducerConfig {
	@Value("${kafka.bootstrap.servers}")
	private String kafkaBootstrapServers;
	
	@Bean
	   public ProducerFactory<String, DeliveryRequestDto> producerFactory() {
	      Map<String, Object> configProps = new HashMap<>();
	      //configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
	      configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
	      configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
	      
	      configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaBootstrapServers);
			
	      return new DefaultKafkaProducerFactory<>(configProps);
	   }
	   @Bean
	   public KafkaTemplate<String, DeliveryRequestDto> kafkaTemplate() {
	      return new KafkaTemplate<>(producerFactory());

}
}