package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Feedmodel;
import com.example.demo.Service.Feedservice;

@CrossOrigin
@RestController

public class Feedcontroller {

	@Autowired

	Feedservice s;

	@GetMapping("/g")

	public List<Feedmodel> showDetails() {

		return s.getDetails();

	}

	@PostMapping("/p")

	public String addDetails(@RequestBody Feedmodel m) {

		s.add(m);

		return "Added " ;

	}

	@PutMapping("/u")

	public Feedmodel updateInfo(@RequestBody Feedmodel st) {

		return s.updateDetails(st);

	}

	@DeleteMapping("/d/{empid}")

	public String deleteInfo(@PathVariable("empid") int empid) {

		s.deleteDetails(empid);
		return "Deleted Details";

	}

	@GetMapping("/sort/{field}")

	public List<Feedmodel> getWithSort(@PathVariable String field) {

		return s.getSorted(field);

	}

	@GetMapping("/pag/{offset}/{pageSize}")

	public List<Feedmodel> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {

		return s.getWithPagination(offset, pageSize);

	}

}