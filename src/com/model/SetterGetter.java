package com.model;

public class SetterGetter {
	private int ID;
	private String Name;
	private String Skills;
	private int Skill_ID;
	private int Exp;
	
	
	
	public int getID(){
		return ID;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	
	
	public String getName(){
		return Name;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	
	
	
	public String getSkills(){
		return Skills;
	}
	
	public void setSkills(String Skills){
		this.Skills = Skills;
	}
	
	
	
	public int getSkillID(){
		return Skill_ID;
	}
	
	public void setSkillID(int Skill_ID){
		this.Skill_ID = Skill_ID;
	}
	
	public int getExp(){
		return Exp;
	}
	
	public void setExp(int Exp){
		this.Exp = Exp;
	}

}
