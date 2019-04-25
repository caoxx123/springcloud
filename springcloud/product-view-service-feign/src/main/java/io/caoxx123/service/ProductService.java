package io.caoxx123.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.caoxx123.client.ProductClientFeign;
import io.caoxx123.pojo.Product;

@Service
public class ProductService {
	@Autowired
	ProductClientFeign productClientFeign;

	public List<Product> listProducts() {
		return productClientFeign.listProducts();
	}
}
