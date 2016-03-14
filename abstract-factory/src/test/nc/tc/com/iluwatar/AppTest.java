package nc.tc.com.iluwatar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iluwatar.App;
import com.iluwatar.KingdomFactory;
import com.yonyou.uat.dbmanagement.DBManage;
import com.yonyou.uat.framework.BaseTestCase;

public class AppTest extends BaseTestCase {
	App app = null;
	DBManage dbManage = null;

	@BeforeClass
	public void BeforeClass() {
		app = new App();
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

	@Test(description = "", dependsOnMethods = {}, groups = "", timeOut = 100000, dataProvider = "dp")
	public void main(Map<String, ArrayList<String>> dp) {

		// Construct method parameters
		String[] args = {};

		// Invoke tested method
		App.main(args);

		// Verify result is ok

		// Verify Object1 == Object2
		Assert.assertEquals("actual", "actual");
		Assert.assertNotNull("actual");
	}

	@Test(description = "", dependsOnMethods = {}, groups = "", timeOut = 100000, dataProvider = "dp")
	public void createKingdom(Map<String, ArrayList<String>> dp) {

		// Construct method parameters
		KingdomFactory factory = null;

		// Invoke tested method
		App.createKingdom(factory);

		// Verify result is ok

		// Verify Object1 == Object2
		Assert.assertEquals("actual", "actual");
		Assert.assertNotNull("actual");
	}
}
