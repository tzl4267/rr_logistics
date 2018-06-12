package com.xyqhit.logistics.mapper.impl;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.xyqhit.logistics.mapper.UserDao;
import com.xyqhit.logistics.pojo.Permission;
import com.xyqhit.logistics.pojo.User;
@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public User find(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> findRoles(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Permission> findPermissions(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> findPermissions(Set<Permission> pset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String hash(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Permission> rp(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

}
