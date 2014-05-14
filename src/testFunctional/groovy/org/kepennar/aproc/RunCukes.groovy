package org.kepennar.aproc

import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration

import cucumber.api.junit.Cucumber

@RunWith(Cucumber)
@cucumber.api.CucumberOptions(
    format=["pretty", "html:build/reports/cucumber"],
    strict=true,
    features=["src/testFunctional/cucumber"],
    glue=["src/testFunctional/groovy/org/kepennar/aproc/steps"],
    tags = ["~@ignore"]
)
class RunCukes {}