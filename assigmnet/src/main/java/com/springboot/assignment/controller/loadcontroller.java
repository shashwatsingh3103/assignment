package com.springboot.assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.assignment.model.Loading;
import com.springboot.assignment.repository.loadingrepository;

@RestController
public class loadcontroller {

	@Autowired
	private loadingrepository loadingrepository;
	
	@PostMapping("/load")
	public ResponseEntity<String> loaddetails(@RequestBody Loading l ){
		
		Loading nl= new Loading();
		nl.setComment(l.getComment());
		nl.setDate(l.getDate());
		nl.setLoadingPoint(l.getLoadingPoint());
		nl.setNoOfTrucks(l.getNoOfTrucks());
		nl.setProductType(l.getComment());
		nl.setShipperId(l.getShipperId());
		nl.setUnloadingPoint(l.getUnloadingPoint());
		nl.setWeight(l.getWeight());
		nl.setProductType(l.getProductType());
		
		loadingrepository.save(nl);
		
		return new ResponseEntity<String>("loads details added", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/load")
	public ResponseEntity <List<Loading>> getloaddetailsbyshipperid(@RequestParam String shipperId ){
		
		List<Loading> l=loadingrepository.findByShipperId(shipperId);
		return new ResponseEntity<List<Loading>>(l,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/load/{lid}")
	public ResponseEntity <Loading> getloaddetailsbyid(@PathVariable("id") long id ) throws Exception{
		
		Optional<Loading> l =loadingrepository.findById(id);
		
		if (l.isPresent()) {
			return new ResponseEntity<>(l.get(), HttpStatus.OK);
		}
		
		throw new Exception("load does not exist with id: "+id);
		
	}
	
	@PutMapping("/load/{lid}")
	public ResponseEntity <String> updateloaddetailsbyid(@PathVariable("id") long id , @RequestBody Loading l) throws Exception{
		
		Optional<Loading> ll =loadingrepository.findById(id);
		
		if (ll.isEmpty()) {
			throw new Exception("load does not exist with id: "+id);
		}
		Loading nl= ll.get();
		
		
		
		nl.setComment(l.getComment());
		nl.setDate(l.getDate());
		nl.setLoadingPoint(l.getLoadingPoint());
		nl.setNoOfTrucks(l.getNoOfTrucks());
		nl.setProductType(l.getComment());
		nl.setShipperId(l.getShipperId());
		nl.setUnloadingPoint(l.getUnloadingPoint());
		nl.setWeight(l.getWeight());
		nl.setProductType(l.getProductType());
		
		loadingrepository.save(nl);
		
		return new ResponseEntity<String>("loads details updated", HttpStatus.ACCEPTED);
		
		
	}
	
	
	@DeleteMapping("/load/{lid}")
	public ResponseEntity <String> deletyeloaddetailsbyid(@PathVariable("id") long id ) throws Exception{
		
		Optional<Loading> ll =loadingrepository.findById(id);
		
		if (ll.isEmpty()) {
			throw new Exception("load does not exist with id: "+id);
		}
		Loading nl= ll.get();
		loadingrepository.delete(nl);
		return new ResponseEntity<String>("loads details deleted", HttpStatus.OK);}
	
}
