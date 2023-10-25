package com.electricals.assignment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class ElectricalController {
	@RequestMapping("hello")
	public String hello() {
		return "Hello World!!";
	}
	@Autowired
	private ElectricalService electricalService;

	@RequestMapping("/electricals")
	public List<Electrical> getElectricals() {
		return electricalService.getElectricals();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/electricals")
	public void addElectrical(@RequestBody Electrical electrical) {
		electricalService.addElectrical(electrical);
	}
	
	@RequestMapping("/electricals/{id}")
	public Optional<Electrical> getElectrical(@PathVariable String id){
		System.out.println("Inside getElectrical");
		return electricalService.getElectrical(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/electricals/{id}")
	public void updateElectrical(@RequestBody Electrical electrical, @PathVariable String id) {
		System.out.println("inside updateElectrical");
		electricalService.updateElectrical(id, electrical);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/electricals/{id}")
	public void deleteElectrical(@PathVariable String id){
		System.out.println("Inside deleteElectrical");
		electricalService.deleteElectrical(id);
	}
}