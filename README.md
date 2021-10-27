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
