package com.au.service;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.au.model.User;
@Repository("UserDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	/*
	 * gets the User having specified User id
	 * @see com.accolite.pizzeria.dao.UserDao#findById(int)
	 * 
	 * @param UserId
	 * 
	 * @return User object
	 */
	public User findById(int id) {
		return getByKey(id);
	}

	/*
	 * saves the User object in database
	 * @see com.accolite.pizzeria.dao.UserDao#saveUser(com.accolite.pizzeria.model.User)
	 * 
	 * @param User object
	 */
	public void saveUser(User user) {
		persist(user);
	}
	
	/*
	 * delete User  from database having specified user name 
	 * @see com.accolite.pizzeria.dao.UserDao#deleteUserByUsername(java.lang.String)
	 * 
	 * @param UserUsername
	 */
	public void deleteUser(int userId) {
		Query query = getSession().createSQLQuery("delete from User where userId = :userId");
		query.setInteger("userId", userId);
		query.executeUpdate();
	}

	/*
	 * gets all the Users' data from database
	 * @see com.accolite.pizzeria.dao.UserDao#findAllUsers()
	 * 
	 * @return List of Users
	 */
	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

	/*
	 * gets the User having specified username
	 * @see com.accolite.pizzeria.dao.UserDao#findUserByUsername(java.lang.String)
	 * 
	 * @param UserUsername
	 * 
	 * @return User object
	 */
	public User findUserByUsername(String UserName) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("custUserName", UserName));
		return (User) criteria.uniqueResult();
	}

	public void updateUser(User user) {
		persist(user);		
	}

	public void deleteUser(Integer UserId) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * gets all coupons of User
	 * @see com.accolite.pizzeria.dao.UserDao#getAllCoupons(com.accolite.pizzeria.model.User)
	 * 
	 * @param User object
	 * 
	 * @return List of coupons
	 */
}