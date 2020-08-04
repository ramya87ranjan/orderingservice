package com.eatza.order.client.RetaurantServiceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eatza.order.dto.ItemFetchDto;
@FeignClient("RESTAURANT-SERVICE")
@RequestMapping("/item")
public interface RetaurantServiceClient {
	
	@GetMapping(value="/id/{itemId}")
	ItemFetchDto getMenuItemById(@PathVariable Long itemId);

}
