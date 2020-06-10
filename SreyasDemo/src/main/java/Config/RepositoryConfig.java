package Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import in.SreyasDemo.SreyasDemo.Entity.Book;
import in.SreyasDemo.SreyasDemo.Entity.BookCategory;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		config.exposeIdsFor(Book.class);
		config.exposeIdsFor(BookCategory.class);
	}
	
	

	
	

}
