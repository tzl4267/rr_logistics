/**
 * 
 */
package com.xyqhit.logistics.mapper;

import java.util.Map;
import java.util.Set;

import com.xyqhit.logistics.pojo.Permission;
import com.xyqhit.logistics.pojo.User;


public interface UserDao {

	User find(String uname);
	
	Set<String> findRoles(String uname);
	
	Set<Permission> findPermissions(String uname);
	
	
	Set<String> findPermissions(Set<Permission> pset);
	
	
	void add(User u);
	
	String hash(User u);
	
	Integer get();
	
	Map<String, Permission> rp(String uname);
}
