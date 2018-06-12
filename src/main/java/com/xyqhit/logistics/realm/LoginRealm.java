/**
 * 
 */
package com.xyqhit.logistics.realm;

import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.xyqhit.logistics.pojo.Permission;
import com.xyqhit.logistics.pojo.User;
import com.xyqhit.logistics.service.UserService;


public class LoginRealm extends AuthorizingRealm{

	
	@Resource
	private UserService us;
	
	/* (non-Javadoc)
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection primcipal) {
		String uname = (String) primcipal.getPrimaryPrincipal();
		Set<String> rset = us.findRoles(uname);
		Set<Permission> pset = us.findPermissions(uname);
		Set<String> set = us.findPermissions(pset);
		SimpleAuthorizationInfo authorInfo = new SimpleAuthorizationInfo();
		authorInfo.setRoles(rset);
		authorInfo.setStringPermissions(set);
		return authorInfo;
	}

	/* (non-Javadoc)
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	//身份认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
			String uname = (String) token.getPrincipal();
			User user = us.find(uname);
			if(user!=null){
				ByteSource salt=ByteSource.Util.bytes(uname);//盐值生成方式
				SimpleAuthenticationInfo authenInfo = new SimpleAuthenticationInfo(uname, user.getPass(),salt, getName());
				return authenInfo;
			}
			
		return null;
	}

}
