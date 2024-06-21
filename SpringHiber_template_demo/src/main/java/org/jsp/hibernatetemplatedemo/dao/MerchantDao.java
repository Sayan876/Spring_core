package org.jsp.hibernatetemplatedemo.dao;

import javax.transaction.Transactional;
import org.jsp.hibernatetemplatedemo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {
	@Autowired
   private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Merchant saveMerchant(Merchant merchant) {
		hibernateTemplate.save(merchant);
		return merchant;
		
	}
	
	public Merchant findbyId(int id) {
		return hibernateTemplate.get(Merchant.class, id);
	}
	
	@Transactional
	public Merchant updateMerchant(Merchant merchant) {
		Merchant dbmerchant = findbyId(merchant.getId());
		if(dbmerchant!=null) {
			dbmerchant.setId(merchant.getId());
			dbmerchant.setEmail(merchant.getEmail());
			dbmerchant.setGstNumber(merchant.getGstNumber());
			dbmerchant.setName(merchant.getName());
			dbmerchant.setPhoneno(merchant.getPhoneno());
			dbmerchant.setPassword(merchant.getPassword());
			return dbmerchant;
		}else {
			return null;
		}
	}
	
	@Transactional
	public Merchant deleteMer(int id) {
		Merchant dbmerchant = findbyId(id);
		if(dbmerchant!=null) {
			hibernateTemplate.delete(dbmerchant);
			
		}else {
			return null;
		}
		return dbmerchant;
	}
	
}
