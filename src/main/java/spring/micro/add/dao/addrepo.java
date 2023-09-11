package spring.micro.add.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.micro.add.entity.Addressentity;

public interface addrepo extends JpaRepository<Addressentity, Integer>{
	
	@Query(nativeQuery = true,value = "select e.id,a.addid,e.name,a.street,a.pincode,e.sal from address a join emp e on e.id=a.id "
			+ "where e.id=:empid")
	Addressentity findbyempid(@Param("empid") int empid);

}
