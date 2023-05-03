package com.spring.hibernate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Category implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	

	private String name;
	private Category parentCategory;
	private Set<Category> childCategories=new HashSet<>();
	
	private Set<Item> item=new HashSet<>();	
	
	public Category() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Set<Category> getChildCategories() {
		return childCategories;
	}

	private void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}
	
	
	
	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}

	
	public void addChildCategory(Category childCategory) {
		if(childCategory==null)
			throw new IllegalArgumentException("Null child category");
		if(childCategory.getParentCategory()!=null)
			childCategory.getParentCategory().getChildCategories().remove(childCategory);
		childCategory.setParentCategory(this);
		childCategories.add(childCategory);
	}
	
	
	public static void main(String[] args) {
		Category child=new Category();
		Category parent=new Category();
		child.setParentCategory(parent);
		parent.getChildCategories().add(parent);
		
		
	}
	
	
	
}
