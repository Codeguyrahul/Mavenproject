package rahul.onetoone;

import jakarta.persistence.*;
@Entity
@Table(name="adharr_infor")
public class Adhaar {
@Id
@Column(name="adhaar_id")
private int id;
private int adhaarNum;
public int getAdhaarNum() {
return adhaarNum;
}
public void setAdhaarNum(int adhaarNum) {
this.adhaarNum = adhaarNum;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}

public Adhaar( int adhaarNum) {
	super();
	this.adhaarNum = adhaarNum;// TODO Auto-generated constructor stub
}
}