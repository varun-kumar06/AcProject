package com.sample.AcService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.sample.AcEntity;
import com.sample.AcDao.AcDao;

@Service
public class AcService {
	
	@Autowired
	AcDao ad;
	
	public String getAllAc( List<AcEntity> e) {
		return ad.getAllAc(e);
	}
	
	public List<AcEntity> findAllAc(){
		return ad.findAllAc();
	}
	
	public List<AcEntity> getByBrand(String b){
		return ad.getByBrand(b);
	}
	
	public List<Integer> getByPriceRange(int a, int b){
		return ad.getByPriceRange(a,b);
	}
	
	public List<Object> getByPriceAndBrand(int a,  int b){
		return ad.getByPriceAndBrand(a,b);
	}

	 public  List<Object> getDescByPrice() { 
			return ad.getDescByPrice();
			}
	 
	 public List<Object> getMaxByObj(){
			return ad.getMaxByObj();
		}
	 
	 public List<AcEntity> getStartWith( char a){
			return ad.getStartWith(a);
		}
	 
	 public List<AcEntity> getEndsWith(char b){
			return ad.getEndsWith(b);
		}
	 
	 public List<Object> getGroupBrand(){
			return ad.getGroupBrand();
		}
	 
	 public List<AcEntity> getSecMax(){
			return ad.getSecMax();
		}
	 
	 public List<AcEntity> getBrandLenght(){
			return ad.getBrandLenght();
		}
	 
	 public List<AcEntity> getBrandName(String a){
			return ad.getBrandName(a);
		}
	 
	 public List<AcEntity> getByPrices(int a){
			return ad.getByPrices(a);
		}
	 
	 public AcEntity getById( int b){
			return ad.getById(b);
		}
}
