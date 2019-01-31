package com.txl.activewish.ActiveWish.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.txl.activewish.ActiveWish.model.ActiveWishFile;

public interface FileRepository extends JpaRepository<ActiveWishFile, Long>{
	@Transactional
	@Query("from ActiveWishFile activewishfile where activewishfile.id = ?1")
	public ActiveWishFile findById(String id);
	
	@Transactional
	@Query("from ActiveWishFile activewishfile where activewishfile.name like %?1% and activewishfile.name like %?2%")
	public List findByName(String workno,String chartno);
	
	@Transactional
	@Query("from ActiveWishFile activewishfile where activewishfile.pathname = ?1")
	public ActiveWishFile findByPathName(String pathName);
	
	@Transactional
	@Modifying
	@Query("delete from ActiveWishFile where id = ?1")
	public ActiveWishFile deleteById(String id);
}
