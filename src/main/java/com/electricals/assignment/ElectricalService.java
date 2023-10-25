package com.electricals.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricalService {
	@Autowired
	private ElectricalDAORepository electricalDAORepository;
	
	public List<Electrical> getElectricals(){
		List<Electrical> electricalList = new ArrayList<Electrical>();
		electricalDAORepository.findAll().forEach(electricalList::add);
		return electricalList;
	}
	
	public Optional<Electrical> getElectrical(String id) {
		return electricalDAORepository.findById(id);
	}
	
	public void updateElectrical(String id, Electrical electrical) {
		electricalDAORepository.save(electrical);
	}

	public void deleteElectrical(String id) {
		electricalDAORepository.deleteById(id);
	}

	public void addElectrical(Electrical electrical) {
		electricalDAORepository.save(electrical);
	}

}
