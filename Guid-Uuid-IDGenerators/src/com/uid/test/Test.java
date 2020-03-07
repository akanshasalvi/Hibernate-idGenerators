package com.uid.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.uid.entities.Merchant;
import com.uid.utility.SessionFactoryRegistry;


public class Test {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory = null;
		Session session = null;
		Transaction transaction = null;
		Merchant merchant = null;
		Boolean flag = false;
		try {
			sessionfactory = SessionFactoryRegistry.getSessionfactory();
			session = sessionfactory.openSession();
			transaction = session.beginTransaction();
			merchant = new Merchant();
			merchant.setMerchant_registrated_date(new Date());
			merchant.setContact_no("456321");
			merchant.setEmail_address("flip@contact");
			merchant.setProduct_Name("Jeans");
			
			Object id = session.save(merchant);
			System.out.println(id);

			flag = true;
		}finally {
			if(transaction != null)
			{
				if(flag)
				{
					transaction.commit();
				}else
				{
					transaction.rollback();
				}
			}
			

		}
		

	}

}
