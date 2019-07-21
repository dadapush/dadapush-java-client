# dadapush-client

DaDaPush Public API
- API version: v1
  - Build date: 2019-07-10T21:57:17.209285+08:00[Asia/Shanghai]

DaDaPush: Real-time Notifications App

Send real-time notifications through our API without coding and maintaining your own app for iOS or Android devices.

  For more information, please visit [https://www.dadapush.com](https://www.dadapush.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.dadapush.client</groupId>
  <artifactId>dadapush-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.dadapush.client:dadapush-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/dadapush-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.dadapush.client.ApiClient;
import com.dadapush.client.ApiException;
import com.dadapush.client.Configuration;
import com.dadapush.client.models.*;
import com.dadapush.client.api.DaDaPushMessageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.dadapush.com");

    DaDaPushMessageApi apiInstance = new DaDaPushMessageApi(defaultClient);
    MessagePushRequest body = new MessagePushRequest(); // MessagePushRequest | body
    String xChannelToken = "xChannelToken_example"; // String | see: https://www.dadapush.com/channel/list
    try {
      ResultOfMessagePushResponse result = apiInstance.createMessage(body, xChannelToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DaDaPushMessageApi#createMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.dadapush.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DaDaPushMessageApi* | [**createMessage**](docs/DaDaPushMessageApi.md#createMessage) | **POST** /api/v1/message | push Message to a Channel
*DaDaPushMessageApi* | [**deleteMessage**](docs/DaDaPushMessageApi.md#deleteMessage) | **DELETE** /api/v1/message/{messageId} | delete a Channel Message
*DaDaPushMessageApi* | [**getMessage**](docs/DaDaPushMessageApi.md#getMessage) | **GET** /api/v1/message/{messageId} | get a Channel Message
*DaDaPushMessageApi* | [**getMessages**](docs/DaDaPushMessageApi.md#getMessages) | **GET** /api/v1/messages | get Message List


## Documentation for Models

 - [Action](docs/Action.md)
 - [MessageObject](docs/MessageObject.md)
 - [MessagePushRequest](docs/MessagePushRequest.md)
 - [MessagePushResponse](docs/MessagePushResponse.md)
 - [PageResponseOfMessageObject](docs/PageResponseOfMessageObject.md)
 - [Result](docs/Result.md)
 - [ResultOfMessageObject](docs/ResultOfMessageObject.md)
 - [ResultOfMessagePushResponse](docs/ResultOfMessagePushResponse.md)
 - [ResultOfPageResponseOfMessageObject](docs/ResultOfPageResponseOfMessageObject.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contacts@dadapush.com

