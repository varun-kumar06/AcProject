package com.sample.AcRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sample.AcEntity;


public interface AcRepository extends JpaRepository<AcEntity,Integer> {
	
	@Query(value="select* from Ac_table where brand =?", nativeQuery=true)
	public List<AcEntity> getByBrand(String b);
	
	@Query(value="select price from Ac_table where price>? and price<? order by price",nativeQuery=true)
    public List<Integer> getByPriceRange(int a, int b);
	
	@Query(value="select price,brand from Ac_table where price>? and price<? order by price",nativeQuery=true)
    public List<Object> getByPriceAndBrand(int a, int b);
	
	@Query(value="select* from Ac_table order by price desc",nativeQuery=true)  
	public List<Object> getDescByPrice();
	 
	@Query(value="select* from Ac_table where price=(Select max(price) from Ac_table)",nativeQuery=true)
	public List<Object> getMaxByObj();
	
	@Query(value = "select* from Ac_table where brand like ?% ", nativeQuery = true)
	public List<AcEntity> getStartWith(char a);
	
	@Query(value = "select* from Ac_table where brand like %?", nativeQuery=true)
	public List<AcEntity> getEndsWith(char b);     
	
	@Query(value = "select brand, count(brand) from Ac_table group by brand", nativeQuery=true)
	public List<Object> getGroupBrand();
	   
	//SecMax    
	@Query(value= "select* from Ac_table order by price desc limit 1,1", nativeQuery= true)
	public List<AcEntity> getSecMax();   
	
	//SecMax- another Syntax  
	//@Query(value= "select * from Ac_table where price=(select max(price)from Ac_table where price< (select max(price) from Ac_table));")
	
	@Query(value="select* from Ac_table where length(brand)>5", nativeQuery= true)
	public List<AcEntity> getBrandLenght();
	
	@Query(value="select count (brand) from Ac_table where brand = ?", nativeQuery= true)
	public List<AcEntity> getBrandName(String a);
	
	//J-Query
	@Query(value = "select x from AcEntity x where x.price > :p")
	public List<AcEntity> getByPrices(@Param("p") int a);
	
	
	@Query(value= "select x from AcEntity x where x.price=(select max(x.price)from AcEntity x)")
	public AcEntity getByPrice();
	
	
	
}
