package com.slokam.controller;

import javax.swing.plaf.multi.MultiFileChooserUI;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.slokam.entity.product;
import com.slokam.repo.productrepo;

@RestController
public class productcontroller {
	@Autowired
	private productrepo productrepo;
	@PostMapping("saveproduct")
public ResponseEntity<product> savedata(@Valid @RequestBody product pro){
	productrepo.save(pro);
	System.out.println(pro);
	return ResponseEntity.ok(pro);
}

}
