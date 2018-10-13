package com.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {
	public String register(SetterGetter setget) throws SQLException {

		int ID = setget.getID();
		String Name = setget.getName();
		String Skills = setget.getSkills();
		int Skill_ID = setget.getSkillID();
		int Exp = setget.getExp();

		Connection con = null;
		Statement state = null;

		con = DataConnection.makeConnection();
		state = con.createStatement();

		con.setAutoCommit(false);
		try {
			int i = state
					.executeUpdate("insert into JobPortal(Candidate_ID,Candidate_Name,Candidate_SkillSet,Candidate_Experience)values('"
							+ ID
							+ "','"
							+ Name
							+ "','"
							+ Skills
							+ "','"
							+ Exp
							+ "')");
			int j = state
					.executeUpdate("insert into SkillSet(Skill_ID,Skill_Name,Candidate_Name,Candidate_ID)values('"
							+ Skill_ID + "','"

							+ Skills + "','" + Name + "','" + ID + "')");
			con.commit();
			return "Registered";
		} catch (SQLException e) {
			con.rollback();
			return "Not registered and rolled back";
		}

	}
}
