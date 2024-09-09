package com.sample.AcController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.AcEntity;
import com.sample.AcService.AcService; 

@RestController
@RequestMapping(value="/Ac")
public class AcController {
	
	@Autowired
	AcService as;

	@PostMapping(value="/getAll")
	public String getAllAc(@RequestBody List<AcEntity> a){
		return as.getAllAc(a); 
	}
	
	@GetMapping(value="/findAllAc")
	public List<AcEntity> findAllAc(){
		return as.findAllAc();
	}
	
	@GetMapping(value="/getByBrand/{b}")
	public List<AcEntity> getByBrand(@PathVariable String b){
		return as.getByBrand(b);
	}
	
	@GetMapping(value="/getByPriceRange/{a}/{b}")
	public List<Integer> getByPriceRange(@PathVariable int a, @PathVariable int b){
		return as.getByPriceRange(a,b);
	}
	
	@GetMapping(value="/getByPriceAndBrand/{a}/{b}")
	 public List<Object> getByPriceAndBrand(@PathVariable int a, @PathVariable int b){
		return as.getByPriceAndBrand(a,b);
	}
		
	@GetMapping(value="/getDescByPrice")
   public List<Object> getDescByPrice() { 
	return as.getDescByPrice();
	}
	
	@GetMapping(value="/getMaxByObj")
	public List<Object> getMaxByObj(){
		return as.getMaxByObj();
	}
	
	
	@GetMapping(value="/getGroupBrand")
	public List<Object> getGroupBrand(){
		return as.getGroupBrand();
	}
	
	@GetMapping(value = "/getStartWith/{a}")
	public List<AcEntity> getStartWith(@PathVariable char a){
		return as.getStartWith(a);
	}
	
	@GetMapping(value = "/getEndsWith/{b}")
	public List<AcEntity> getEndsWith(@PathVariable char b){
		return as.getEndsWith(b);
	}
	
	@GetMapping(value = "/getSecMax")
	public List<AcEntity> getSecMax(){
		return as.getSecMax();
	}
	
	@GetMapping(value="/getBrandLenght")
	public List<AcEntity> getBrandLenght(){
		return as.getBrandLenght();
	}
	
	@GetMapping(value="/getBrandName/{a}")
	public List<AcEntity> getBrandName(@PathVariable String a){
		return as.getBrandName(a);
	}
	
	@GetMapping(value="/getByPrices/{a}")
	public List<AcEntity> getByPrices(@PathVariable int a){
		return as.getByPrices(a);
	}
	
	@GetMapping(value="/getById/{b}")
	public AcEntity getById(@PathVariable int b){
		return as.getById(b);
	}
}
