import java.util.*;
class PrintReport implements ReportOutput{

	@Override
	public void displayReport() {
		System.out.println("Output to printer");
	}
}