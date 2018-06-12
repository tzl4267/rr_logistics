/**
 * 
 */
package com.xyqhit.logistics.service;

import java.util.Set;

import com.xyqhit.logistics.pojo.Permission;
import com.xyqhit.logistics.pojo.User;


public interface UserService {

	
	User find(String uname);
	
	Set<String> findRoles(String uname);
	
	Set<Permission> findPermissions(String uname);
	
	Set<String> findPermissions(Set<Permission> pset);
	
	String hash(User u);
	
	Integer get();
}
