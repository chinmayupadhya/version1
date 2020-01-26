package com.smvita.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smvita.helper.BatchHelper;
import com.smvita.hibernate.entity.Batch;
import com.smvita.service.BatchService;


@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class BatchRestController {
	
	@Autowired
	private BatchService batchService;
	
	
	@GetMapping("/batches")
	public List<Batch> getBatch(){
		
		return batchService.getBatch();
	}
	
	@GetMapping("/batches/{bId}")
	public Batch getBatch(@PathVariable int bId) {
		
		Batch batch = batchService.getBatch(bId);
		return batch;
	}
	
	@PostMapping("/batches")
	public void saveBatch(@RequestBody BatchHelper batch) {
		batch.getBatch().setBatchId(0);
		batchService.saveBatch(batch);
	}
	
	@PutMapping("/batches")
	public Batch updateBatch(@RequestBody BatchHelper batch) {
		
		batchService.saveBatch(batch);
		return batch.getBatch();
	}
	
	@DeleteMapping("/batches/{bId}")
	public String deleteBatch(@PathVariable int bId) {
		
		batchService.deleteBatch(bId);
		return "Deleted RecruiterId"+ bId;
	}
	
}
