package org.ssh.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.ssh.pojo.Emp;

@Repository
public class EmpDaoI extends HibernateDaoSupport{
 
	/*@Resource
	 private SessionFactory sf;
*/
	
	 



	@Resource
	public void setSf(SessionFactory sf) {
		super.setSessionFactory(sf);
	}







	public List<Emp> selectAll() {
		/*Session session = sf.openSession();
        Query q = session.createQuery("from Emp");	   
        List<Emp> el = q.list();*/
		HibernateTemplate ht = this.getHibernateTemplate();
		DetachedCriteria criteria = DetachedCriteria.forClass(Emp.class);
		List<Emp> el = (List<Emp>) ht.findByCriteria(criteria);
		return el;
	}
	
	
	
	
}
