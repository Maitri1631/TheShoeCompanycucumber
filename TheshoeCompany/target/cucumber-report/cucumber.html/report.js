$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Search Product",
  "description": "",
  "id": "search-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7365382000,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "User should applying filter on product successfully",
  "description": "",
  "id": "search-product;user-should-applying-filter-on-product-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click on women Section",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I click on New Arrivals",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I filtering section",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I Click on clear Filter",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchProductSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 102149400,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductSteps.iClickOnWomenSection()"
});
formatter.result({
  "duration": 1126319400,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductSteps.iClickOnNewArrivals()"
});
formatter.result({
  "duration": 286078300,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductSteps.iFilteringSection()"
});
formatter.result({
  "duration": 2258551700,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductSteps.iClickOnClearFilter()"
});
formatter.result({
  "duration": 155930100,
  "status": "passed"
});
formatter.after({
  "duration": 716783900,
  "status": "passed"
});
});