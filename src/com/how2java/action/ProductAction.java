package com.how2java.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.how2java.bean.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport{
    private Product product;
    private List<Product> products;
    
    
    
    public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String show() {
    	
        product = new Product();
        product.setName("iphone7");
        return "show";
    }
    
    public String add(){
    	
    	Map m = ActionContext.getContext().getSession();
    	m.put("name", product.getName());
    	System.out.println("product.name:" + product.getName());
    	System.out.println("product.age:" + product.getAge());
    	return "show";
    }
    
    public String list(){
    	products = new ArrayList();
    	
    	Product p1 = new Product();
    	p1.setId(1);
    	p1.setName("product1");
    	
    	Product p2 = new Product();
    	p2.setId(2);
    	p2.setName("product2");
    	
    	Product p3 = new Product();
    	p3.setId(3);
    	p3.setName("product3");
    	
    	products.add(p1);
    	products.add(p2);
    	products.add(p3);
    	
    	return "list";
    }
 
    public Product getProduct() {
        return product;
    }
 
    public void setProduct(Product product) {
        this.product = product;
    }
}