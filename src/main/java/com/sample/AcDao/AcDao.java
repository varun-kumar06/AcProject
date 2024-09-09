package com.sample.AcDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.sample.AcEntity;
import com.sample.AcRepository.AcRepository;

@Repository
public class AcDao {

	@Autowired
	AcRepository ar;
	
	public String getAllAc( List<AcEntity> a) {
		ar.saveAll(a);
		return "Created Successfully";
	}
	
	public List<AcEntity> findAllAc(){
		return ar.findAll();
	}
	
	public List<AcEntity> getByBrand(String b){
		return ar.getByBrand(b);
	}
	
	public List<Integer> getByPriceRange(int a, int b){
		return ar.getByPriceRange(a, b);
	}
	
	public List<Object> getByPriceAndBrand(int a,  int b){
		return ar.getByPriceAndBrand(a,b);
	}
	
	
	
	 public List<Object> getDescByPrice() { 
			return ar.getDescByPrice();
			}
	 
	 public List<Object> getMaxByObj(){
			return ar.getMaxByObj();
		}
	 
	 public List<AcEntity> getStartWith( char a){
			return ar.getStartWith(a);
		}
	 
		public List<AcEntity> getEndsWith(char b) {
			return ar.getEndsWith(b);
		}
		
		public List<Object> getGroupBrand(){
			return ar.getGroupBrand();
		}
		
		public List<AcEntity> getSecMax(){
			return ar.getSecMax();
		}
		
		public List<AcEntity> getBrandLenght(){
			return ar.getBrandLenght();
		}
		
		public List<AcEntity> getBrandName(String a){
			return ar.getBrandName(a);
		}
		
		public List<AcEntity> getByPrices(int a){
			return ar.getByPrices(a);
		}
		
		public AcEntity getById( int b){
			 return ar.findById(b).get();
			}

}
