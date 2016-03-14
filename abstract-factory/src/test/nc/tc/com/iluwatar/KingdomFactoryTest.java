package nc.tc.com.iluwatar;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.yonyou.uat.dbmanagement.DBManage;
import com.yonyou.uat.framework.BaseTestCase;

public class KingdomFactoryTest extends BaseTestCase {
	Class<?> kingdomFactory = null;
	DBManage dbManage = null;

	@BeforeClass
	public void BeforeClass() {
		try {
			kingdomFactory = Class.forName("com.iluwatar.KingdomFactory");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void AfterClass() {
	}

	@BeforeMethod
	public void BeforeMethod() {
		List<String> tableList = new ArrayList<String>();
		tableList.add("pub_wfexptlog");
		dbManage = new DBManage();
		dbManage.setTableList(tableList);
		dbManage.tableExport();
	}

	@AfterMethod
	public void AfterMethod() {
		dbManage.tableRollBack();
	}
}
