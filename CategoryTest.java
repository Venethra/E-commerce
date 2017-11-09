package com.CategoryTest;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.CategoryDao;
import com.DaoImpl.CategoryDaoImp;
import com.model.Category;

public class CategoryTest {
    
	static CategoryDaoImp categoryDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext configApplnContext = new AnnotationConfigApplicationContext();
	    configApplnContext.scan("com");
	    configApplnContext.refresh();
	    
	    //SessionFactory sessionFactory = (SessionFactory)configApplnContext.getBean("hibernateConfig.class");
	
	    categoryDAO=(CategoryDao)configApplnContext.getBean("CategoryDao");
	} 
    @Ignore
	@Test
	public void addCategoryTest() {
		Category category=new Category();
		category.setCid(1002);
		category.setCname("JMShirt");
		
		
		assertTrue(categoryDAO.addCategory(category));
	}
}
	
    @Test
    public void updateCategoryTest()
    {
    	Category category=new Category();
		category.setCid(1002);
		category.setCname("JMShirt");
		
        
		assertTrue(categoryDAO.updateCategory(category));
		
    
}
    @Test
    public void deleteCategoryTest()
    {
    	Category category =new Category();
    	category.setCid(1002);
    	
    	assertTrue(categoryDAO.deleteCategory(category));
    	
}
    @Test
    public void retrieveCategoryTest()
    {
    	List<Category> listCategory = categoryDAO.retrieveCategory();
    	assertNotNull("Problem in Retrieving:",listCategory);
    	}
    
    public void show()
    {
    	for(Category category:listCategory)
    		
    	{
    		System.out.println("Category ID:"+category.getCid());
    		System.out.println("Category Name:"+category.getCname());
    	}
}
    
    @Test
    public void getCategorytest()
    {
    	Category category = categoryDAO.getCategory(1002);
    	assertNotNull("Problem in Getting:",category);
    	System.out.println("Category ID:" +category.getCid());
    	System.out.println("Category Class::" +category.getClass());
    	
}  
}
