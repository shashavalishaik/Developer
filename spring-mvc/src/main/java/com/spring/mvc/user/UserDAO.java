package com.spring.mvc.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {
	
	
	private static List<User> users=new ArrayList<>();
	private static int usersCount=0;
	
	static {
		users.add(new User(++usersCount,"Adam","13-07-1999"));
		users.add(new User(++usersCount,"harish","15-08-1979"));
		users.add(new User(++usersCount,"chandra","1-07-1945"));
	}
	
	public List<User>findAll()
	{
		return users;
	}
	
	public User save(User user)
	{
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id)
	{
		Predicate<? super User> predicate=user ->user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}

	
	
	public void deleteById(int id)
	{
		Predicate<? super User> predicate=user ->user.getId().equals(id);
		users.removeIf(predicate);
	}
}
