package com.spring.Sp_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.servlet.ModelAndView;

import com.spring.Sp_project.Model.Product;
import com.spring.Sp_project.Service.Pservice;

@RestController
@RequestMapping("/api")
public class Pcontroller {
	
	private Product prod;
	
	private Pservice ser;
	
	@Autowired
	public Pcontroller(Pservice ser) {
		this.ser = ser;
	}
	
	@RequestMapping("/")
	public String Val() {
		return "its is working";
	}
	
	@GetMapping("/Product")
	public List<Product> getProduct(){
		return ser.getProduct();
		
	}
	@PostMapping("/Product")
	public void addProduct(@RequestBody Product prod) { // Requestbody used to match the request with the product.
		ser.addProduct(prod);
	}
	
	@PutMapping("/Product")
	public void updateProduct(Product prod) {
		ser.updateProduct(prod);
	}
	
	@GetMapping("/form")
    public ModelAndView showForm() {
		
		ModelAndView a = new ModelAndView();
		a.setViewName("form.html");
        return a; // The HTML form template
    }

	
	 @PostMapping("/submit")
	    public String handleFormSubmit(@RequestParam("name") String name,
	                                    @RequestParam("price") long price,
	                                    @RequestParam("out_date") String outDate,
	                                    Model model) {
	        // Create a new Product object with user inputs
	        Product product = new Product();
	        product.setName(name);
	        product.setPrice(price);
	        product.setOut_date(java.sql.Date.valueOf(outDate)); // Convert String to Date

	        // Save the product using your service
	        ser.addProduct(product);

	        // Add a success message to the model to be displayed on the page
	        model.addAttribute("message", "Product added successfully!");

	        return "result"; // You can redirect to another page to display success
	    }


}
