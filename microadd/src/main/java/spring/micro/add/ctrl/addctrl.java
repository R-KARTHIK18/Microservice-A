package spring.micro.add.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import spring.micro.add.model.addressmod;
import spring.micro.add.service.addservice;

@RestController
public class addctrl {

	@Autowired
	private addservice addservice;
	
	@GetMapping("/add")
	
	public String getadd() {
		return "cbe";
	}
	
	
	@GetMapping("/addid/{empid}")
	
	public addressmod getaddbyid(@PathVariable("empid")int empid) {
		addressmod addres=addservice.getaddbyid(empid);
		return addres;
		
		
	}
}
