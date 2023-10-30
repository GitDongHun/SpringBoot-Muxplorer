package com.food.exp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.exp.dao.RevDAO;
import com.food.exp.dto.RevDTO;

@Service
public class RevServiceImpl implements RevService {
	
	@Autowired
	RevDAO dao;

	@Override
	public void addReview(RevDTO review) {
		dao.addReview(review);
	}

	@Override
	public List<RevDTO> getReviewById(String user_email) {
		 return dao.getReviewById(user_email);
	}

	@Override
	public int updateReview(RevDTO review) {
		return dao.updateReview(review);
	}

	@Override
	public void deleteReview(int rev_no) {
		dao.deleteReview(rev_no);
	}

	@Override
	public RevDTO selectByRev_No(int rev_no) {
		return dao.selectByRev_No(rev_no);
	}

	@Override
	public List<RevDTO> revByRst(String rst_id) {
		return dao.revByRst(rst_id);
	}
	
}
