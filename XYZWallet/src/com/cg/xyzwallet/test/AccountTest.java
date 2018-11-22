package com.cg.xyzwallet.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.xyzwallet.bean.AccountBean;
import com.cg.xyzwallet.bean.CustomerBean;
import com.cg.xyzwallet.exception.CustomerException;
import com.cg.xyzwallet.service.AccountServiceImpl;
import com.cg.xyzwallet.service.IAccountService;

public class AccountTest {

	private static IAccountService service = null;
	
	
@BeforeClass 
public static void createInstance() {
    service = new AccountServiceImpl();
}


@Test
public void testCustomerFirstNamePositive() throws Exception {
    CustomerBean bean = new CustomerBean();
    bean.setFirstName("santhoshi");
    bean.setLastName("sunaina");
    bean.setEmailId("santhu16@gmail.com");
    bean.setPhoneNo("9246332899");
    bean.setPanNum("HJYTREDSI8");
    bean.setAddress("Chennai");
    AccountBean accountBean = new AccountBean();
 
    accountBean.setBalance(20000);
    accountBean.setDateOfOpening(new Date());
    accountBean.setInitialDeposit(2000);
    accountBean.setCustomerBean(bean);
    boolean result=service.createAccount(accountBean);
    assertTrue(result);
}



@Test(expected = CustomerException.class)
public void testCustomerFirstNameLength() throws Exception {
    CustomerBean bean = new CustomerBean();
    bean.setFirstName("sa");
    bean.setLastName("sunaina");
    bean.setEmailId("santhu@gmail.com");
    bean.setPhoneNo("9505815715");
    bean.setPanNum("JUIKHFTRE8");
    bean.setAddress("Chennai");
    AccountBean accountBean = new AccountBean();
    accountBean.setBalance(5000);
    accountBean.setDateOfOpening(new Date());
    accountBean.setInitialDeposit(1000);
    accountBean.setCustomerBean(bean);
    boolean result=service.createAccount(accountBean);
    assertFalse(result);
    
}
@Test(expected = CustomerException.class)
public void testCustomerFirstNameNotNull() throws Exception {
    CustomerBean bean = new CustomerBean();
    bean.setFirstName("");
    bean.setLastName("sunaina");
    bean.setEmailId("santhu@gmail.com");
    bean.setPhoneNo("9505815715");
    bean.setPanNum("JUIKHFTRE8");
    bean.setAddress("Chennai");
    AccountBean accountBean = new AccountBean();

    accountBean.setBalance(5000);
    accountBean.setDateOfOpening(new Date());
    accountBean.setInitialDeposit(1000);
    accountBean.setCustomerBean(bean);
    boolean result=service.createAccount(accountBean);
    assertFalse(result);
    
}

@Test(expected = CustomerException.class)
public void testCutomerFirstNameNumbers() throws Exception {
    CustomerBean bean = new CustomerBean();
    bean.setFirstName("62342");
    bean.setLastName("syamala");
    bean.setEmailId("lucky@gmail.com");
    bean.setPhoneNo("6789544345");
    bean.setPanNum("KIYTGFRDET");
    bean.setAddress("CHENNAI");
    AccountBean accountBean = new AccountBean();
 
    accountBean.setBalance(8000);
    accountBean.setDateOfOpening(new Date());
    accountBean.setInitialDeposit(1000);
    accountBean.setCustomerBean(bean);
    boolean result=service.createAccount(accountBean);
    assertFalse(result);
}

@Test
public void testCustomerLastNamePositive() throws Exception {
    CustomerBean bean = new CustomerBean();
    bean.setFirstName("santhoshi");
    bean.setLastName("sunaina");
    bean.setEmailId("santhu16@gmail.com");
    bean.setPhoneNo("9246332899");
    bean.setPanNum("HJYTREDSI8");
    bean.setAddress("Chennai");
    AccountBean accountBean = new AccountBean();

    accountBean.setBalance(20000);
    accountBean.setDateOfOpening(new Date());
    accountBean.setInitialDeposit(2000);
    accountBean.setCustomerBean(bean);
    boolean result=service.createAccount(accountBean);
    assertTrue(result);
}

@Test(expected = CustomerException.class)
public void testCustomerLastNameLength() throws Exception {
    CustomerBean bean = new CustomerBean();
    bean.setFirstName("sanju");
    bean.setLastName("su");
    bean.setEmailId("sanju@gmail.com");
    bean.setPhoneNo("9246332899");
    bean.setPanNum("JUIKHFTRE8");
    bean.setAddress("Hyderabad");
    AccountBean accountBean = new AccountBean();

    accountBean.setBalance(6000);
    accountBean.setDateOfOpening(new Date());
    accountBean.setInitialDeposit(1000);
    accountBean.setCustomerBean(bean);
    boolean result=service.createAccount(accountBean);
    assertFalse(result);

}

@Test(expected = CustomerException.class)
public void testCustomerLastNameNotNull() throws Exception {
    CustomerBean bean = new CustomerBean();
    bean.setFirstName("santhu");
    bean.setLastName(" ");
    bean.setEmailId("santhu@gmail.com");
    bean.setPhoneNo("9505815715");
    bean.setPanNum("JUIKHFTRE8");
    bean.setAddress("Chennai");
    AccountBean accountBean = new AccountBean();

    accountBean.setBalance(5000);
    accountBean.setDateOfOpening(new Date());
    accountBean.setInitialDeposit(1000);
    accountBean.setCustomerBean(bean);
    boolean result=service.createAccount(accountBean);
    assertFalse(result);
    
}

@Test(expected = CustomerException.class)
public void testCutomerLastNameNumbers() throws Exception {
    CustomerBean bean = new CustomerBean();
    bean.setFirstName("Lucky");
    bean.setLastName("6767");
    bean.setEmailId("lucky@gmail.com");
    bean.setPhoneNo("6789544345");
    bean.setPanNum("KIYTGFRDET");
    bean.setAddress("CHENNAI");
    AccountBean accountBean = new AccountBean();

    accountBean.setBalance(8000);
    accountBean.setDateOfOpening(new Date());
    accountBean.setInitialDeposit(1000);
    accountBean.setCustomerBean(bean);
    boolean result=service.createAccount(accountBean);
    assertFalse(result);
}

@Test
public void testCustomerPhoneNumberPositive() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("Santhoshi");
	bean.setLastName("Sunaina");
	bean.setPhoneNo("9246332899");
	bean.setPanNum("IOKHGYTRFT");
	bean.setAddress("kakinada");
	bean.setEmailId("santhu@gmail.com");
	AccountBean accountBean = new AccountBean();
 
    accountBean.setBalance(5000);
	accountBean.setInitialDeposit(500);
	accountBean.setCustomerBean(bean);
	accountBean.setDateOfOpening(new Date());
	boolean result=service.createAccount(accountBean);
    assertTrue(result);
}

@Test(expected = CustomerException.class)
public void testCustomerPhoneNoLength() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("Santhoshi");
	bean.setLastName("Sunaina");
	bean.setPhoneNo("9955662288897");
	bean.setPanNum("IOKHGYTRFT");
	bean.setAddress("kakinada");
	bean.setEmailId("santhu@gmail.com");
	AccountBean accountBean = new AccountBean();

    accountBean.setBalance(5000);
	accountBean.setInitialDeposit(500);
	accountBean.setCustomerBean(bean);
	accountBean.setDateOfOpening(new Date());
	boolean result=service.createAccount(accountBean);
    assertFalse(result);
}

@Test(expected = CustomerException.class)
public void testCustomerForPhonenNumberInvalid() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("santhoshi");
	bean.setLastName("pothula");
	bean.setPhoneNo("32678654356");
	bean.setPanNum("JUIKHOY6UH");
	bean.setAddress("hyderabad");
	bean.setEmailId("santhu@gmail.com");
	AccountBean accountBean = new AccountBean();
  
    accountBean.setBalance(5000);
    accountBean.setInitialDeposit(500);
    accountBean.setCustomerBean(bean);
    accountBean.setDateOfOpening(new Date());
    boolean result=service.createAccount(accountBean);
    assertFalse(result);
}


@Test
public void testCustomerForPanNumberPositive() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("Santhu");
	bean.setLastName("naidu");
	bean.setPhoneNo("9055849874");
	bean.setPanNum("JUYTFRGDTY");
	bean.setAddress("vijayawada");
	bean.setEmailId("naidu@gmail.com");
	AccountBean accountBean = new AccountBean();

	accountBean.setBalance(5000);
	accountBean.setInitialDeposit(500);
	accountBean.setCustomerBean(bean);
	accountBean.setDateOfOpening(new Date());
	boolean result=service.createAccount(accountBean);
    assertTrue(result);
}
@Test(expected = CustomerException.class)
public void testCustomerForPanNumberLength() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("Santhu");
	bean.setLastName("naidu");
	bean.setPhoneNo("9055849874");
	bean.setPanNum("AHUKKJ5T");
	bean.setAddress("vijayawada");
	bean.setEmailId("naidu@gmail.com");
	AccountBean accountBean = new AccountBean();

	accountBean.setBalance(5000);
	accountBean.setInitialDeposit(500);
	accountBean.setCustomerBean(bean);
	accountBean.setDateOfOpening(new Date());
	boolean result=service.createAccount(accountBean);
    assertFalse(result);
}

@Test(expected = CustomerException.class)
public void testCustomerForAddress() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("Santhu");
	bean.setLastName("naidu");
	bean.setPhoneNo("9055849874");
	bean.setPanNum("AHUKKJ5T");
	bean.setAddress("s");
	bean.setEmailId("naidu@gmail.com");
	AccountBean accountBean = new AccountBean();

	accountBean.setBalance(5000);
	accountBean.setInitialDeposit(500);
	accountBean.setCustomerBean(bean);
	accountBean.setDateOfOpening(new Date());
	boolean result=service.createAccount(accountBean);
    assertFalse(result);
}

@Test(expected = CustomerException.class)
public void testCustomerForAddressForNull() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("Santhu");
	bean.setLastName("naidu");
	bean.setPhoneNo("9055849874");
	bean.setPanNum("AHUKKJ5THY");
	bean.setAddress("");
	bean.setEmailId("santhu565@gmail.com");
	AccountBean accountBean = new AccountBean();

	accountBean.setBalance(5000);
	accountBean.setInitialDeposit(500);
	accountBean.setCustomerBean(bean);
	accountBean.setDateOfOpening(new Date());
	boolean result=service.createAccount(accountBean);
    assertFalse(result);
}

@Test
public void testCustomerForEmail() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("Santhu");
	bean.setLastName("naidu");
	bean.setPhoneNo("9055849874");
	bean.setPanNum("AHUKKJ5THY");
	bean.setAddress("kakinada");
	bean.setEmailId("santhu565@gmail.com");
	AccountBean accountBean = new AccountBean();

	accountBean.setBalance(5000);
	accountBean.setInitialDeposit(500);
	accountBean.setCustomerBean(bean);
	accountBean.setDateOfOpening(new Date());
	boolean result=service.createAccount(accountBean);
    assertTrue(result);
}

@Test(expected = CustomerException.class)
public void testCustomerForEmailForNull() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("Santhu");
	bean.setLastName("naidu");
	bean.setPhoneNo("9055849874");
	bean.setPanNum("AHUKKJ5THY");
	bean.setAddress("kakinada");
	bean.setEmailId("");
	AccountBean accountBean = new AccountBean();

	accountBean.setBalance(5000);
	accountBean.setInitialDeposit(500);
	accountBean.setCustomerBean(bean);
	accountBean.setDateOfOpening(new Date());
	boolean result=service.createAccount(accountBean);
    assertFalse(result);
}

@Test(expected = CustomerException.class)
public void testCreateAccountForEmailcom() throws Exception {
	CustomerBean bean = new CustomerBean();
	bean.setFirstName("Santhu");
	bean.setLastName("naidu");
	bean.setPhoneNo("9055849874");
	bean.setPanNum("AHUKKJ5THY");
	bean.setAddress("kakinada");
	bean.setEmailId("santhu@gmail");
	AccountBean accountBean = new AccountBean();

	accountBean.setBalance(5000);
	accountBean.setInitialDeposit(500);
	accountBean.setCustomerBean(bean);
	accountBean.setDateOfOpening(new Date());
	boolean result=service.createAccount(accountBean);
    assertFalse(result);
}






}

