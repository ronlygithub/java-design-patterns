package nc.tc.com.iluwatar;
import org.testng.*;
import java.util.ArrayList;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import jxl.read.biff.BiffException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.yonyou.uat.util.ExcelDataProvider;
import com.yonyou.uat.util.DBDataProvider;
import com.yonyou.uat.dbmanagement.DBManage;
import com.yonyou.uat.dbmanagement.QueryInfoVO;
import com.iluwatar.OrcKingdomFactory;
import com.yonyou.uat.framework.BaseTestCase;
import com.iluwatar.Castle;
import com.iluwatar.King;
import com.iluwatar.Army;
public class OrcKingdomFactoryTest extends BaseTestCase {
  OrcKingdomFactory orcKingdomFactory=null;
  DBManage dbManage=null;
  
  @BeforeClass 
  public void BeforeClass(){
    orcKingdomFactory=new OrcKingdomFactory();
  }
  
  @AfterClass 
  public void AfterClass(){
  }
  
  @BeforeMethod 
  public void BeforeMethod(){
    List<String> tableList=new ArrayList<String>();
    tableList.add("pub_wfexptlog");
    dbManage=new DBManage();
    dbManage.setTableList(tableList);
    dbManage.tableExport();
  }
  
  @AfterMethod 
  public void AfterMethod(){
    dbManage.tableRollBack();
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void createCastle(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    Castle retObj=null;
    retObj=orcKingdomFactory.createCastle();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void createKing(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    King retObj=null;
    retObj=orcKingdomFactory.createKing();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
  }
  
  @Test(description="",dependsOnMethods={},groups="",timeOut=100000,dataProvider="dp") 
  public void createArmy(  Map<String,ArrayList<String>> dp){
    
    //Construct method parameters
    
    //Invoke tested method
    Army retObj=null;
    retObj=orcKingdomFactory.createArmy();
    
    //Verify result is ok
    
    //Verify Object1 == Object2
    Assert.assertNotNull(retObj);
  }
}
