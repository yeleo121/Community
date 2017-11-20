package com.community.dao;

import java.util.ArrayList;

import com.community.modals.Modal;

public interface ModalInterface {
	boolean add(Modal modal);
	boolean delete(int id);
	boolean update(Modal modal);
	Modal selectById(int id);
	ArrayList<Modal> selectAll();
}
