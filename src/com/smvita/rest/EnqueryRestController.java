package com.smvita.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smvita.hibernate.entity.Enquery;
import com.smvita.service.EnqueryService;

@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class EnqueryRestController {

	@Autowired
	private EnqueryService enqueryService;
	
	
	// for insert the data
		@PostMapping(value = "/enqueries", headers = "Accept=application/json")
		public void addEnquery(@RequestBody Enquery enquery) {
			enqueryService.addEnquery(enquery);
		}

		// retrieve all data
		@GetMapping(value = "/enqueries", headers = "Accept=application/json")
		public List<Enquery> showEnquerys() {
			return enqueryService.getEnqueries();
		}

		@DeleteMapping(value = "/enqueries/{eid}", headers = "Accept=application/json")
		public void removeEnquery(@PathVariable int eid) {
			enqueryService.delete(eid);
		}

		// getting specific data
		@GetMapping(value = "/enqueries/{eid}", headers = "Accept=application/json")
		public Enquery getEnquery(@PathVariable int eid) {
			Enquery enquery = enqueryService.getEnquery(eid);
			return enquery;
		}
}
