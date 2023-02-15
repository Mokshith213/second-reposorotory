package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.secure.spi.IntegrationException;

import dao.Bikedao;
import dto.Bike;

public class Bikeservelet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=req.getParameter("name");
		String s2=req.getParameter("id");
		
		int idd=Integer.parseInt(s2);
		
		Bike bike=new Bike();
		bike.setName(s1);
		bike.setId(idd);
		
		Bikedao bikedao=new Bikedao();
		bikedao.insert(bike);
		
		
	}

	
}
