package com.xlaser.junit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/25 14:12
 * @description: 计算器加减乘除计算
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class CalculatorSteps {
    private Calculator calculator;

    /**
     * 场景开始
     */
    @Given("Turn on calculator!")
    public void setup() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void add(int arg1, int arg2) {
        calculator.push(arg1);
        calculator.push(arg2);
        calculator.push("+");
    }

    @When("I subtract {int} to {int}")
    public void subtract(int arg1, int arg2) {
        calculator.push(arg1);
        calculator.push(arg2);
        calculator.push("-");
    }

    @When("I multiply {int} to {int}")
    public void multiply(int arg1, int arg2) {
        calculator.push(arg1);
        calculator.push(arg2);
        calculator.push("*");
    }

    @When("I divide {int} to {int}")
    public void divide(int arg1, int arg2) {
        calculator.push(arg1);
        calculator.push(arg2);
        calculator.push("/");
    }

    /**
     * 校验期望值
     *
     * @param expected
     */
    @Then("the result is {int}")
    public void assertResult(double expected) {
        assertEquals(expected, calculator.value());
    }
}
