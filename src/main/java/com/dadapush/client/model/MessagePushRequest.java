/*
 * DaDaPush Public API
 * DaDaPush: Real-time Notifications App Send real-time notifications through our API without coding and maintaining your own app for iOS or Android devices.
 *
 * The version of the OpenAPI document: v1
 * Contact: contacts@dadapush.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dadapush.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.dadapush.client.model.Action;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MessagePushRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-10T10:11:56.286885+08:00[Asia/Shanghai]")
public class MessagePushRequest {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<Action> actions = new ArrayList<Action>();

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_NEED_PUSH = "needPush";
  @SerializedName(SERIALIZED_NAME_NEED_PUSH)
  private Boolean needPush;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public MessagePushRequest actions(List<Action> actions) {
    this.actions = actions;
    return this;
  }

  public MessagePushRequest addActionsItem(Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<Action>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * action size range is 0,3
   * @return actions
  **/
  @ApiModelProperty(value = "action size range is 0,3")
  public List<Action> getActions() {
    return actions;
  }

  public void setActions(List<Action> actions) {
    this.actions = actions;
  }

  public MessagePushRequest content(String content) {
    this.content = content;
    return this;
  }

   /**
   * message content
   * @return content
  **/
  @ApiModelProperty(example = "Good News! DaDaPush releasing new version", required = true, value = "message content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MessagePushRequest needPush(Boolean needPush) {
    this.needPush = needPush;
    return this;
  }

   /**
   * when value is false, will not send client push
   * @return needPush
  **/
  @ApiModelProperty(example = "true", required = true, value = "when value is false, will not send client push")
  public Boolean getNeedPush() {
    return needPush;
  }

  public void setNeedPush(Boolean needPush) {
    this.needPush = needPush;
  }

  public MessagePushRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * message title
   * @return title
  **/
  @ApiModelProperty(example = "Good News!", required = true, value = "message title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePushRequest messagePushRequest = (MessagePushRequest) o;
    return Objects.equals(this.actions, messagePushRequest.actions) &&
        Objects.equals(this.content, messagePushRequest.content) &&
        Objects.equals(this.needPush, messagePushRequest.needPush) &&
        Objects.equals(this.title, messagePushRequest.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, content, needPush, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePushRequest {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    needPush: ").append(toIndentedString(needPush)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

