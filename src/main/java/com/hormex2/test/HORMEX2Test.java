package com.hormex2.test;

import com.hormex2.dao.AddressDao;
import com.hormex2.dao.BranchDao;
import com.hormex2.entities.Address;
import com.hormex2.entities.Branch;
import com.hormex2.helper.SessionFactoryRegistry;

public class HORMEX2Test {

	public static void main(String[] args) {
		try {
		BranchDao branchDao = new BranchDao();
		Branch branch1 = branchDao.getBranch(1);
		Branch branch = branchDao.getBranch(2);
		
		System.out.println(branch1);
		System.out.println("=============================================================");
		System.out.println(branch);

		AddressDao addressDao = new AddressDao();
		Address address = addressDao.getAdres(1);
		System.out.println(address);
		}finally {
			SessionFactoryRegistry.CloseSessionFactory();
		}
	}

}
