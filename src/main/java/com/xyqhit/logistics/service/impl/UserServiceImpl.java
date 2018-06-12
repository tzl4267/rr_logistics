/**
 * 
 */
package com.xyqhit.logistics.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyqhit.logistics.mapper.UserDao;
import com.xyqhit.logistics.pojo.Permission;
import com.xyqhit.logistics.pojo.User;
import com.xyqhit.logistics.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserDao ud;
	
	/* (non-Javadoc)
	 * @see com.shiro.service.UserService#find(java.lang.String)
	 */
	@Override
	public User find(String uname) {
		User user = ud.find(uname);
		return user;
	}

	/* (non-Javadoc)
	 * @see com.shiro.service.UserService#findRoles(java.lang.String)
	 */
	@Override
	public Set<String> findRoles(String uname) {
		Set<String> rset = ud.findRoles(uname);
		return rset;
	}

	/* (non-Javadoc)
	 * @see com.shiro.service.UserService#findPermissions(java.lang.String)
	 */
	@Override
	public Set<Permission> findPermissions(String uname) {
		Set<Permission> pset = ud.findPermissions(uname);
		return pset;
	}

	

	/* (non-Javadoc)
	 * @see com.shiro.service.UserService#hash(com.shiro.pojo.User)
	 */
	@Override
	public String hash(User u) {
		String pass = ud.hash(u);
		return pass;
	}

	@Override
	public Integer get() {
		Integer uid = ud.get();
		return uid;
	}

	@Override
	public Set<String> findPermissions(Set<Permission> pset) {
		Set<String> set = ud.findPermissions(pset);
		return set;
	}

}
