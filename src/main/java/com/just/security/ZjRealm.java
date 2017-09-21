package com.just.security;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

public class ZjRealm implements Realm {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = authenticationToken.getPrincipal().toString();//获取用户名
        String password = new String((char[]) authenticationToken.getCredentials()); //得到密码
        if (!"wu".equals(username)) {
            throw new UnknownAccountException();
        }
        if (!"123".equals(password)) {
            throw new IncorrectCredentialsException();//密码错误
        }
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
