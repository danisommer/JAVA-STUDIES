package danizs.io.myproject1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import danizs.io.myproject1.entity.User;
import danizs.io.myproject1.repository.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> 	 {

	@Autowired
	UserRepository userRepository; 
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		User user = new User();
	
		user.setEmail("danisommer@gmail.com");
		user.setName("Daniel");
		
		userRepository.save(user);
	}
	

}
