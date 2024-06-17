package tr.com.huseyinaydin.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tr.com.huseyinaydin.model.Personel;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Web MVC ve JPA Hibernate
*
*/

@Repository
public class PersonelDAOImpl implements PersonelDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public PersonelDAOImpl() {
	}

	public PersonelDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public Personel get(int id) {
		String hql = "from Personel where id =" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Personel> personelListe = (List<Personel>) query.list();
		if ((personelListe != null) && (!personelListe.isEmpty()) ) {
			return personelListe.get(0);
		}		
		return null;
	}

	@Override
	@Transactional
	public List<Personel> list() {
		@SuppressWarnings("unchecked")
		List<Personel> personelListe = (List<Personel>) sessionFactory.getCurrentSession()
				.createCriteria(Personel.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return personelListe;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Personel personel) {
		sessionFactory.getCurrentSession().saveOrUpdate(personel);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Personel personel = new Personel();
		personel.setId(id);
		sessionFactory.getCurrentSession().delete(personel);	
	}
}