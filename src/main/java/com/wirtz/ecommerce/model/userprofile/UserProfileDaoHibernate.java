package com.wirtz.ecommerce.model.userprofile;


import org.springframework.stereotype.Repository;

import com.wirtz.ecommerce.modelutil.dao.GenericDaoHibernate;
import com.wirtz.ecommerce.modelutil.exceptions.InstanceNotFoundException;

@Repository
public class UserProfileDaoHibernate extends
		GenericDaoHibernate<UserProfile, Long> implements UserProfileDao {

	public UserProfile findByLoginName(String loginName) throws InstanceNotFoundException {
		UserProfile userProfile = (UserProfile) getSession().createQuery(
				"SELECT u FROM UserProfile u WHERE u.loginName = :loginName")
				.setParameter("loginName", loginName)
				.uniqueResult();
		if (userProfile == null) {
			throw new InstanceNotFoundException(loginName, UserProfile.class.getName());
		} else {
			return userProfile;
		}
	}

}