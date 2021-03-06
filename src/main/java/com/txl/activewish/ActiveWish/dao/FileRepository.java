package com.txl.activewish.ActiveWish.dao;

import java.util.List;

import javax.persistence.Access;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.txl.activewish.ActiveWish.model.ActiveWishFile;

public interface FileRepository extends JpaRepository<ActiveWishFile, Long> {
	@Transactional
	@Query("from ActiveWishFile t where t.id = ?1")
	public ActiveWishFile findById(String id);

	@Transactional
	@Query("from ActiveWishFile t where t.name like %?1% and t.name like %?2%")
	public List findByName(String workno, String chartno);

	@Transactional
	@Query("from ActiveWishFile t where t.pathname = ?1")
	public ActiveWishFile findByPathName(String pathName);

	@Transactional
	@Modifying
	@Query("delete from ActiveWishFile t where t.id = ?1")
	public ActiveWishFile deleteById(String id);

	@Transactional
	@Query("from ActiveWishFile t where t.name like %?1% and t.name like %?2% and t.pathname like %?3%")
	public List findBoxListByWorknoOrChartno(String workno, String chartno, String key);

	@Transactional
	@Query("from ActiveWishFile t where t.name like %?1% and t.name like %?2% and t.pathname like %?3%")
	public List queryMarkListByWorknoOrChartno(String workno, String chartno, String key);

	@Transactional
	@Query(value = "select * from am_monitor_currentfile t where t.name like %?1% and t.name like %?2% and t.pathname like %?4% order by t.updatetime desc limit ?3", nativeQuery = true)
	public List<ActiveWishFile> queryBoxListByLimit(String workno, String chartno, int limit, String key);

	@Transactional
	@Query(value = "select * from am_monitor_currentfile t where t.name like %?1% and t.name like %?2% and t.pathname like %?4% order by t.updatetime desc limit ?3", nativeQuery = true)
	public List<ActiveWishFile> queryProcessListByLimit(String workno, String chartno, int limit, String aM_MONITOR_ROOT2_DIRECTORY);
}
