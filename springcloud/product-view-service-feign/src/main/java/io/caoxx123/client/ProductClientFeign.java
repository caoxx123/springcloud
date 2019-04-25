package io.caoxx123.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import io.caoxx123.pojo.Product;

@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
	@GetMapping("/products")
	public List<Product> listProducts();
}
