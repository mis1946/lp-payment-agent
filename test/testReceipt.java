
import org.rmj.appdriver.GProperty;
import org.rmj.appdriver.GRider;
import org.rmj.payment.agent.XMORMaster;

public class testReceipt {
    public static void main(String [] args){
        String lsProdctID = "gRider";
        String lsUserIDxx = "M001111122";
        GRider poGRider = new GRider(lsProdctID);
        GProperty loProp = new GProperty("GhostRiderXP");
        if (!poGRider.loadEnv(lsProdctID)) System.exit(0);
        if (!poGRider.logUser(lsProdctID, lsUserIDxx)) System.exit(0);
        
        XMORMaster instance = new XMORMaster(poGRider, poGRider.getBranchCode(), false);
        
        instance.newTransaction();
        instance.showReceipt();
        
        /*
        instance.setMaster("sORNumber", "1234");
        instance.setMaster("nVATSales", 1);
        instance.setMaster("nVATAmtxx", 2);
        instance.setMaster("nNonVATSl", 3);
        instance.setMaster("nZroVATSl", 4);
        instance.setMaster("nCWTAmtxx", 5);
        instance.setMaster("nAdvPaymx", 6);
        instance.setMaster("nCashAmtx", 7);
        instance.setMaster("sSourceCd", "SO");
        instance.setMaster("sSourceNo", "M00118000001");
        instance.saveUpdate();
        */
        
        /*
        instance.loadTransaction("M00118000002");
        System.out.println((String) instance.getMaster("sORNumber"));
        System.out.println(String.valueOf(instance.getMaster("nVATSales")));
        System.out.println(String.valueOf(instance.getMaster("nVATAmtxx")));
        System.out.println(String.valueOf(instance.getMaster("nNonVATSl")));
        System.out.println(String.valueOf(instance.getMaster("nZroVATSl")));
        System.out.println(String.valueOf(instance.getMaster("nCWTAmtxx")));
        System.out.println(String.valueOf(instance.getMaster("nAdvPaymx")));
        System.out.println(String.valueOf(instance.getMaster("nCashAmtx")));
        System.out.println((String) instance.getMaster("sSourceCd"));
        System.out.println((String) instance.getMaster("sSourceNo"));
        */
        
        /*
        instance.openRecord("M00118000001");
        instance.updateRecord();
        instance.setMaster("sORNumber", "1111");
        instance.setMaster("nVATSales", 2);
        instance.setMaster("nVATAmtxx", 4);
        instance.setMaster("nNonVATSl", 6);
        instance.setMaster("nZroVATSl", 8);
        instance.setMaster("nCWTAmtxx", 10);
        instance.setMaster("nAdvPaymx", 12);
        instance.setMaster("nCashAmtx", 14);
        instance.setMaster("sSourceCd", "SO");
        instance.setMaster("sSourceNo", "M00118000002");
        instance.saveRecord();
        */
    }
}
