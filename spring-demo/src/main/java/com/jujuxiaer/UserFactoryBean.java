package com.jujuxiaer;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Jujuxiaer
 * @since 2023-04-01 09:50
 */
public class UserFactoryBean implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		// 可能很复杂，帮助我们完成复杂对象的创建
		return new User("李老师", 26);
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
