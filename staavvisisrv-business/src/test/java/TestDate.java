import java.util.Date;

import it.csi.stacore.staavvisisrv.util.DateUtil;

public class TestDate {




	public static void main(String[] args) {

		try {
			String dataStr = "202201";
			
			System.out.println("dataStr"  + dataStr);


			Date d = DateUtil.parse(dataStr, DateUtil.YEAR_MONTH_NO_SEPARATOR);
			
			System.out.println("date "  + d);

		}catch(Exception e) {
			
			System.out.println("Exception "  + e);

		}
	}
}
