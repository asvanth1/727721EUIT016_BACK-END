package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Feedmodel;
import com.example.demo.Repository.FeedRepo;

@Service

public class Feedservice {

	@Autowired

	FeedRepo r;

	public String add(Feedmodel m) {

		r.save(m);

		return "Added";

	}

	public List<Feedmodel> getDetails() {

		return r.findAll();

	}

	public Feedmodel updateDetails(Feedmodel e1) {

		return r.saveAndFlush(e1);

	}

	public void deleteDetails(int empid) {

		r.deleteById(empid);

	}

	public List<Feedmodel> getSorted(String field) {

		return r.findAll(Sort.by(Sort.Direction.ASC, field));

	}

	public List<Feedmodel> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {

		Page<Feedmodel> page = r.findAll(PageRequest.of(offset, pageSize));

		return page.getContent();

	}

}