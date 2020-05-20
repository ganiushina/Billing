import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

class Programm{
	public static void main(String[] args){

		List<ReportItem> items =  new ArrayList<>();
		items.add(new ReportItem("First", (float)5));
		items.add(new ReportItem("Second", (float)6));

		Report report = new Report(items);

		FileDataSource fileDataSource = null;
		try {
			fileDataSource = new FileDataSource(report.getItems().get(0).getDescription() + ".txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		BillingDecorator billingDecorator = new BillingDecorator(report, new ScreenReport());
		billingDecorator.displayReport();
		BillingDecorator billingDecorator1 = new BillingDecorator(report, new PrintReport());
		billingDecorator1.displayReport();

		fileDataSource.readData();


	}
}