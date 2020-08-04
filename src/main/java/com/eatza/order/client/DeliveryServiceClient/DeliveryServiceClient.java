package com.eatza.order.client.DeliveryServiceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eatza.order.dto.DeliveryRequestDto;
@FeignClient("DELIVERY-SERVICE")
@RequestMapping("/deliver")
public interface DeliveryServiceClient {
	
	@PostMapping(value="/deliveryid")
	String getdeliveryItemById(@RequestBody DeliveryRequestDto order);

}
