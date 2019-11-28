#### JUnit5: Allure
allure是一个用来生成测试报告的简单易用工具,可以在浏览器中很方便查看测试执行的详情.
> Allure Framework is a flexible lightweight multi-language test report tool that shows a very 
> concise representation of what have been tested in a neat web report form.


#### Execute JUnit5 tests defined in the project and get the Allure reports.
mvn命令执行测试,生成报告.
> mvn clean test
> mvn test allure:serve

