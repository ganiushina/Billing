import java.util.Iterator;
import java.util.List;

public class BillingDecorator implements ReportOutput {

    Report report;
    ReportOutput reportOutput;

    public BillingDecorator(Report report, ReportOutput reportOutput) {
        this.report = report;
        this.reportOutput = reportOutput;
    }

    @Override
    public void displayReport() {
        reportOutput.displayReport();
        List<ReportItem> reportItems = report.getItems();
        for(ReportItem item : reportItems){
          //  System.out.format("display %s - %f \n\r", item.getDescription(), item.getAmount());
            System.out.println(item.getDescription() + " " + item.getAmount());
        }
    }
}
