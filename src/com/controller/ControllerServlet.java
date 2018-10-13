package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Queries;
import com.model.SetterGetter;



/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerServlet() {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int ID = Integer.parseInt(request.getParameter("ID"));
		String Name = request.getParameter("name");
		String Skills = request.getParameter("skills");
		int Skill_ID = Integer.parseInt(request.getParameter("skill_ID"));
		int Exp = Integer.parseInt(request.getParameter("exp"));

		SetterGetter setget = new SetterGetter();

		setget.setID(ID);
		setget.setName(Name);
		setget.setSkills(Skills);
		setget.setSkillID(Skill_ID);
		setget.setExp(Exp);

		Queries query = new Queries();

		String check = "";
		try {
			check = query.register(setget);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (check.equals("Registered")) {
			request.getRequestDispatcher("/Successful.jsp").forward(request,
					response);
		}
		else if (check.equals("Not registered and rolled back")){
			request.getRequestDispatcher("/view.jsp").forward(request,
					response);
		}

	}

}