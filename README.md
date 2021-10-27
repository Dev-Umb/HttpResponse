# HttpResponse
常用的HTTP返回，可复用

封装了常用的200OK、403Forbidden、404NotFound等常用Http响应格式


使用方法：

在Gradle或maven中引入：

**Gradle**:
```gradle

allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
	     implementation 'com.github.farewell12345:HttpResponse:2.0.2'
}
```

**Maven**:
```xml
<repositories>
	<repository>
		  <id>jitpack.io</id>
		  <url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
	   <groupId>com.github.farewell12345</groupId>
	   <artifactId>HttpResponse</artifactId>
	   <version>2.0.2</version>
</dependency>
```
使用示例：
```java
@GetMapping("/hello")
public Response<String> hello(){
    return ResponseFactoryImpl.build().success("Ok","hello!");
}
```

返回示例：
```json
{
    "success": true,
    "code": 200,
    "data": "hello!",
    "message": "Ok"
}
```
目前支持的状态码：

| 状态码      | 变量名 |
| ----------- | ----------- |
| 200      | SUCCESS       |
| 201   | CREATED        |
|202|ACCEPTED|
|204|NO_CONTENT|
|203|NON_AUTHORITATIVE|
|205|RESET_CONTENT|
|206|PARTIAL_CONTENT|
|300|MULTIPLE_CHOICES|
|301|MOVED_PERMANENTLY|
|302|REDIRECT|
|303|SEE_OTHER|
|304|NOT_MODIFIED|
|305|USE_PROXY|
|400|BAD_REQUEST|
|401|UNAUTHORIZED|
|403|FORBIDDEN|
|404|NOT_FOUND|
|405|METHOD_NOT_ALLOWED|
|500|INTERNAL_SERVER_ERROR|
|501|NOT_IMPLEMENTED|
|502|BAD_GATEWAY|
|504|GATEWAY_TIMEOUT|
|505|HTTP_VERSION_NOT_SUPPORTED|