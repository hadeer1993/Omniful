package selenium.Omniful;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import org.json.*;

public class InsertPOSTransactions extends TestBases {
	@Test(priority=1)
	public void insertOfflineOrder(){
		var transactionsObj = new JSONObject();
		transactionsObj.put("pos_id", 5);
		transactionsObj.put("sku", "24-MB01");
		transactionsObj.put("transaction_date", 1615904223);
		transactionsObj.put("transaction_id", 4000);
		transactionsObj.put("quantity", -5);
		transactionsObj.put("return_pos_id", 5);
		transactionsObj.put("terminal_id", 119);
		transactionsObj.put("net_amount", 500);
		transactionsObj.put("vat", 10);
		transactionsObj.put("tax_amount", 50);
		transactionsObj.put("price", 20);
		transactionsObj.put("return_transaction_id", 2);
		var transactionsArray = new JSONArray();
		transactionsArray.put(transactionsObj);
		var body = "{\"transactions\":"+transactionsArray.toString()+"}";
		given()
		.accept("application/json")
		.contentType("application/json")
		.header("API-KEY", "2f330c42-79b9-48cc-82b5-c7bbfdab7d0e")
		.body(body)
		.when()
		.post(base_url+"/api/v1/client/pos")
		.then()
		.log()
        .body();
	}
}
