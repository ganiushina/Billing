import java.util.*;
class Report {

	private List<ReportItem> items;	// Отчетные данные

	public Report(List<ReportItem> items) {
		this.items = items;
	}

	public List<ReportItem> getItems() {
		return items;
	}

}