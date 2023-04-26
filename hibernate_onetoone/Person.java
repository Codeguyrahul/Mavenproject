package rahul.onetoone;

import jakarta.persistence.*;
@Entity
@Table(name="person_infor1")
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="per_id")
private int id;
private String name;
private String address;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="adhaar_id")
private Adhaar adhar;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public Adhaar getAdhar() {
return adhar;
}
public void setAdhar(Adhaar adhar) {
this.adhar = adhar;
}
public Person(String name, String address) {
super();
this.name = name;
this.address = address;
}
public Person() {
}
}
