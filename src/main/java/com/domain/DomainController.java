/**
 * 
 */
package com.domain;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.domain.data.CartData;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * @author pdoma
 *
 */
@RestController
@Slf4j
public class DomainController {
	
	
	public ResponseEntity<Mono<CartData>> getCartDetails(String cartId){
		
		return ResponseEntity.ok( Mono.just( new CartData()) );
		
	}

}
