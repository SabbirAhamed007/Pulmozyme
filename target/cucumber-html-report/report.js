$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Copay_LAP.feature");
formatter.feature({
  "line": 1,
  "name": "Test Copay LAP enrollment feature",
  "description": "",
  "id": "test-copay-lap-enrollment-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "LAP Copay enrollment scenario",
  "description": "",
  "id": "test-copay-lap-enrollment-feature;lap-copay-enrollment-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open Pulmozyme site to enrolled",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "select apply now",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on LAP",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Choose not first time pulmozyme user",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I complete eligibility QN",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I fill up LAP info",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I fill up Patient info",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select USPS",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I fill up login info",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I fill up doctor info",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I confirm the info",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select the check box",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "Copay_LAPTest.i_open_Pulmozyme_site_to_enrolled()"
});
formatter.result({
  "duration": 11414448100,
  "status": "passed"
});
formatter.match({
  "location": "Copay_LAPTest.select_apply_now()"
});
formatter.result({
  "duration": 380911800,
  "status": "passed"
});
formatter.match({
  "location": "Copay_LAPTest.click_on_LAP()"
});
formatter.result({
  "duration": 336468700,
  "status": "passed"
});
formatter.match({
  "location": "Copay_LAPTest.choose_not_first_time_pulmozyme_user()"
});
formatter.result({
  "duration": 450700400,
  "status": "passed"
});
formatter.match({
  "location": "Copay_LAPTest.i_complete_eligibility_QN()"
});
formatter.result({
  "duration": 242021600,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cspan class\u003d\"checkmark\"\u003e\u003c/span\u003e is not clickable at point (522, 912). Other element would receive the click: \u003cdiv class\u003d\"onetrust-pc-dark-filter fade-in\" style\u003d\"z-index:2147483645\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d81.0.4044.138)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-C3UG4MO\u0027, ip: \u0027192.168.1.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\ubox0\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 81.0.4044.138, webStorageEnabled: true}\nSession ID: 50c5739b0e79a170b886ca2e4117b4bb\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sTEPDefinatioN.Copay_LAPTest.i_complete_eligibility_QN(Copay_LAPTest.java:75)\r\n\tat ✽.When I complete eligibility QN(Copay_LAP.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Copay_LAPTest.i_fill_up_LAP_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Copay_LAPTest.i_fill_up_Patient_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Copay_LAPTest.select_USPS()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Copay_LAPTest.i_fill_up_login_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Copay_LAPTest.i_fill_up_doctor_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Copay_LAPTest.i_confirm_the_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Copay_LAPTest.i_select_the_check_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Copay_LAPTest.click_on_confirm_button()"
});
formatter.result({
  "status": "skipped"
});
});