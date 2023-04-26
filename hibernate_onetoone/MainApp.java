package rahul.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class MainApp {
public static void main(String[] args) {
Person p = new Person("deepak kumar","Delhi");
Adhaar a= new Adhaar(1234555);
p.setAdhar(a);
Transaction txn;
try(Session session=HibernateUtil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(p );
txn.commit();
}
}
}