package in.SreyasDemo.SreyasDemo.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCatgegory",path="book-category")
public interface BookRepository extends JpaRepository<Book, Long>{

}
