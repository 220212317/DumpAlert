package za.ac.cput.factory;
import za.ac.cput.domain.Report;
import java.util.Date;

public class ReportFactory {

    public static Report createReport(int reportID,
                                      String reportType,
                                      Date startDate,
                                      Date endDate) {

        if (reportType == null || reportType.isEmpty()) {
            return null;
        }

        return new Report.Builder()
                .setReportID(reportID)
                .setReportType(reportType)
                .setGeneratedDate(new Date())
                .setStartDate(startDate)
                .setEndDate(endDate)
                .build();
    }
}

