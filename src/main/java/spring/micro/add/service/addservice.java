package spring.micro.add.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.micro.add.dao.addrepo;
import spring.micro.add.entity.Addressentity;
import spring.micro.add.model.addressmod;

@Service
public class addservice {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private addrepo addrepo;
	public addressmod getaddbyid(int empid){
		
		//Addressentity addressentity=addrepo.findById(id).get();
		Addressentity addressentity=addrepo.findbyempid(empid);
		addressmod addmod=modelMapper.map(addressentity, addressmod.class);
		
		return addmod;
		
	}
}
