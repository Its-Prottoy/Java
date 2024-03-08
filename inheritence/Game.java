import java.lang.*;
public class Game{
	private String name;
	private String id;
	private double score;
	
	public Game(){
		System.out.println("Empty Constructor");
	}
	public Game(String nm,String id,double score){
		name=nm;
		this.id=id;
		this.score=score;
	}
	public void setnm(String nm){
		name=nm;
	}
	public void setid(String id){
		this.id=id;
	}
	public void setscore(double score){
		this.score=score;
	}
	public String getnm(){
		return name;
	}
	public String getid(){
		return id;
	}
	public double getscore(){
		return score;
	}
	
	public void details(){
		System.out.println("Name: "+name+"\n"+"ID: "+id+"\n"+"Score: "+score);
	}
}