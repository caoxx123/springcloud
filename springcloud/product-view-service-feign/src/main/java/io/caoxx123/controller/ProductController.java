package io.caoxx123.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.caoxx123.pojo.Product;
import io.caoxx123.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@Value("${version}")
	String version;
	@RequestMapping("products")
	public Object products(Model m) {
		List<Product> ps = productService.listProducts();
		m.addAttribute("version", version);
		m.addAttribute("ps", ps);
		return "products";
	}
}
