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

import com.smvita.helper.AlbumHelper;
import com.smvita.helper.PhotoHelper;
import com.smvita.hibernate.entity.Album;
import com.smvita.hibernate.entity.Photo;
import com.smvita.service.AlbumService;

@RestController
@CrossOrigin(origins = "http://192.168.43.192:4200",allowedHeaders = "*")
@RequestMapping("/api")
public class AlbumRestController {

	@Autowired
	private AlbumService service;

	@GetMapping("/albums")
	public List<Album> getAlbum() {

		return service.getAlbum();
	}

	@GetMapping("/photos/{albumId}")
	public List<Photo> getPhotos(int albumId) {

		return service.getPhoto(albumId);
	}

	@GetMapping("/albums/{aId}")
	public Album getAlbum(@PathVariable int aId) {

		Album album = service.getAlbum(aId);
		return album;
	}

	@PostMapping("/albums")
	public void saveAlbum(@RequestBody AlbumHelper albumHelper) {
		albumHelper.getAlbum().setaId(0);
		service.addAlbum(albumHelper);
	}

	@PostMapping("/photos")
	public void savePhoto(@RequestBody PhotoHelper helper) {
		helper.getPhoto().setpId(0);
		service.addPhoto(helper);
	}

	@PutMapping("/albums")
	public Album updateAlbum(@RequestBody AlbumHelper albumHelper) {

		service.addAlbum(albumHelper);
		return albumHelper.getAlbum();
	}

	@DeleteMapping("/albums/{aId}")
	public void deleteStudent(@PathVariable int aId) {

		service.remove(aId);

	}

}
