<h3 align=center>JUNIT4J</h3> 

#### Junit3-记录简单的官方demo
- TestCase
- TestSuite
---


#### Junit4-实践junit4的功能特性
- Base
  - Category | Rule | Suite | Assume | FixMethodOrder | Ignore | Parameterized | Theory
- Cucumber
- Mockito
- SpringMvcTest
- SpringBootTest
---


#### Junit5-学习junit5的新特性
- Allure
- Annotation
- Base
  - Assertion | Conditional | Dynamic | Hamcrest | Injection | Nested | Order | Platform | Repeated | Standard
- Extension
- Parameterized
- SpringBoot
  - RestTemplateTest | Mockito
---


#### [Effective](https://github.com/xlaser4j/junit4j/tree/master/junit-effective)-基于Effective Unit Testing,学习记录相关case
> 永不失败的测试没有价值,它可能没有测试任何东西;而另一个极端就是总是失败的测试也很烦人;其实我们需要的是一个过去曾经
失败的测试,证明它能够抓住与被测试代码的预期行为之间的偏差,并且我们改动被测试代码他就会再次失败

>测试的性质和宗旨是更注重可读性和清晰度,其次才是代码的重复度和性能;额外的冗长或许更有利于表现力,可读性和可维护性!

- 测试的目的
  - 保证代码质量稳态 | 以测试驱动设计稳态
- 测试替身的类型
  - Stub | Fake | Spy | Mock
- 测试替身的作用
  - 隔离被测试代码 | 加速执行测试 | 使执行变得确定 | 模拟特殊情况 | 暴露隐藏的信息
---

#### Case-记录其他单元测试相关用例
- Security
- ~~PowerMockito~~
---


#### Reference

* [Bonigarcia](https://github.com/bonigarcia/mastering-junit5)
* [Security](https://docs.spring.io/spring-security/site/docs/5.0.x/reference/html/test-method.html)
* Lasse Koskela: Effective Unit Testing (有效的单元测试)
         