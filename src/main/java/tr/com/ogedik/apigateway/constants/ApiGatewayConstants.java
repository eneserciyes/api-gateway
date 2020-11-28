package tr.com.ogedik.apigateway.constants;

import lombok.experimental.UtilityClass;

/** @author orkun.gedik */
@UtilityClass
public class ApiGatewayConstants {

  public static class Paths {
    public static final String API = "/api";
    public static final String AUTHENTICATE = "/authentication/authenticate";
    public static final String REGISTRATION = "/authentication/users";
    public static final String JIRA_CONNECTION_TEST = "/integration/jira/connect";
    public static final String JIRA_CONNECTION_TEST_MAIL = "/integration/jira/connectMail";
    public static final String JIRA_CONFIG = "/configuration/jira";
    public static final String SETUP = "/configuration/setup";
    public static final String WORKLOGS = "/time-tracker/tracker/worklogs";
    public static final String TEAM_REPORTS_ISSUES_DATA = "/time-tracker/tracker/issues-in-sprint";
    public static final String BOARDS = "/time-tracker/tracker/boards";
    public static final String SPRINTS = "/time-tracker/tracker/sprints";
    public static final String ISSUES = "/time-tracker/tracker/issues";
    public static final String SEND_MAIL = "/notification/mail";
    public static final String INDIVIDUAL_REPORT = "/time-tracker/tracker/individual-report";
  }
}
