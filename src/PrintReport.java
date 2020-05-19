import java.util.*;
class PrintReport implements ReportOutput{

//	@Override
//	public void displayReport(List<ReportItem> items) {
//		System.out.println("Output to printer");
//		for(ReportItem item : items){
//			System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
//		}
//	}

	@Override
	public void displayReport() {
		System.out.println("Output to printer");
	}
}