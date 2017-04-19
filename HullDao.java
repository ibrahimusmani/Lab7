package dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import softcons.lab7.model.Hull;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
public class HullDao {
	public Session currSession = null;
	public HullDao(){
		HibernateUtil.createSessionFactory();
		currSession=HibernateUtil.getSessionFactory().openSession();  
	}
	public void finalize(){
		currSession.close();
	}
        public void save(ArrayList<Hull> newHullList){
		Transaction t=currSession.beginTransaction();  
      		for(int i=0;i<newHullList.size();i++){
			currSession.persist((Hull)newHullList.get(i));
		}
      		t.commit(); 
 	}
//	public void printEmployees(){
//		Query query=currSession.createQuery("from Hull");  
//    		List<Hull> list=query.list();  
//      
//   		Iterator<Hull> itr=list.iterator();  
//		while(itr.hasNext()){  
//			Hull hull=itr.next();  
//			System.out.println("Hull Id: "+hull.getId());  
//    		}  
//	}
}

