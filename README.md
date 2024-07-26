# 工具类库 (univTool)
欢迎使用 **工具类库**！这是一个用于简化常见编程任务的 Java 工具类集合。该库提供了一系列实用的工具方法，旨在提高开发效率和代码可读性。
https://github.com/nimbleJay/univtool.git
## 特性
- **正则表达式验证**：提供多种正则表达式，可根据编码校验不同表达式。
- **字符串处理**：提供多种字符串操作方法，如反转、拼接、分割等。
- **日期时间工具**：简化日期和时间的格式化、解析和计算。

## 使用
### Maven
在您的 `pom.xml` 文件中添加以下依赖:
```
<dependency><br>
     <groupId>io.github.nimblejay</groupId><br>
     <artifactId>univTool</artifactId><br>
     <version>0.0.1-beta</version><br>
</dependency><br>
```
### java
import com.nimblejay.univtool.rule.Verify;<br>
Verify.getResultByCode(code,Str);(code码参照下方表格)

## 编码对照表
```markdown
| 正则表达式编码   | 描述                                        |
|-----------------|------------------                          |
| "0"             |火车车次                                     |
| "1"             |手机机身号                                   |
| "2"             |必须带端口的网址(或IP)                        |
| "3"             |网址(支持url,参数)                           |
| "4"             |社会统一信用代码                             |
| "5"             |迅雷连接                                     |
| "6"             |子网掩码                                    |
| "7"             |大于等于0，小于等于150，支持小数位出现5(用于考卷)|
| "8"             |md5格式                                      |
| "9"             |video连接地址                                 |
| "10"            |图片链接地址                                  |
| "11"            |24小时制时间(HH:mm:ss)                        |
| "12"            |12小时制时间(hh:mm:ss)                        |
| "13"            |base64格式                                   |
| "14"            |数字/货币金额(支持负数，千分位分隔符)           |
| "15"            |数字/货币金额(支持正数，不支持千分位分隔符)      |
| "16"            |银行卡号                                      |
| "17"            |中文名                                        |
| "18"            |英文名                                        |
| "19"            |车牌号(新能源)                                 |
| "20"            |车牌号(非新能源)                               |
| "21"            |车牌号(新能源+非新能源)                         |
| "22"            |手机号(严谨)                                  |
| "23"            |手机号(宽松)                                  |
| "24"            |手机号(最宽松)                                 |
| "25"            |日期                                          |
| "26"            |座机(国内)                                    |
| "27"            |身份证号(1代)                                 |
| "28"            |身份证号(2代)                                  |
| "29"            |身份证号(2代，18位数字)，最后一位为数字或者字符X  |
| "30"            |身份证号(1代,2代,支持15/18位数字)               |
| "31"            |护照                                           |
| "32"            |账号是否合法                                   |
| "33"            |中文/汉字                                      |
| "34"            |小数                                           |
| "35"            |数字                                           |
| "36"            |html标签(宽松匹配)                              |
| "37"            |qq号                                           |
| "38"            |数字和字母                                      |
| "39"            |英文字母                                        |
| "40"            |小写英文字母                                    |
| "41"            |大写英文字母                                    |
| "42"            |密码强度校验，最少6位包括大写字母，小写字母，数字，特殊字符|
| "43"            |用户名校验(4-16位，字母，数字，下划线，减号)     |
| "44"            |IP-V4                                         |
| "45"            |IP-V6                                         |
| "46"            |微信号                                         |
| "47"            |邮政编码                                        |
| "48"            |中文和数字                                     |
| "49"            |不能包含字母                                   |
| "50"            |java包名                                      |
```

## 反馈
目前该工具类还处于测试阶段如有任何问题或建议，请联系：

- **作者**: nimbleJay
- **邮箱**: 380492222@qq.com
- **GitHub**: [nimbleJay](https://github.com/nimbleJay)

感谢您使用 **univTool工具类库**！希望它能帮助您提高开发效率！



