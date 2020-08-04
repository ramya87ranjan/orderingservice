package com.eatza.order.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class DeliveryRequestDto {
	
	private Long orderId;
	private Long restaurantId;
	
	public DeliveryRequestDto(Long orderId, Long restaurantId) {
		super();
		this.orderId = orderId;
		this.restaurantId = restaurantId;
	}
	
	


	
	
	
	

}
