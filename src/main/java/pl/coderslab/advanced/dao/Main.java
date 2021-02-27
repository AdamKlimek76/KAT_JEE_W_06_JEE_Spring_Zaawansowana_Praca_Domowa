package pl.coderslab.advanced.dao;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		// create group
		GroupDao groupDao = new GroupDao();
		Group g = new Group("sample name");
		Group group = new Group("second group");
		Group group1 = new Group("third group");
		//save group to database
		groupDao.save(g);
		//groupDao.save(group);
		//groupDao.save(group1);

		//get all groups
		List<Model> groups = groupDao.loadAll();
		for (Model model : groups) {
			Group group2 = (Group) model;
			System.out.println(group2.getName());
		}


		//update group
		g.setName("other name");
		groupDao.save(g);

		for (Model model : groups) {
			Group group2 = (Group) model;
			System.out.println(group2.getName());
		}
		
		//remove group
		Group firstElement = (Group) groupDao.loadById(1);
		if (firstElement != null) {
			groupDao.delete(firstElement);
		}


	}

}
