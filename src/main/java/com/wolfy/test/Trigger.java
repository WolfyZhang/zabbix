package com.wolfy.test;

import java.sql.Timestamp;

public class Trigger {

    private String triggerid;

    private String description;

    private String expression;

    private String comments;

    private String error;

    private Integer flags;

    private Integer lastchange;

    private Integer priority;

    private Integer state;

    private Integer status;

    private String templateid;

    private Integer type;

    private String url;

    private Integer value;

    private String functions;

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }

    public String getTriggerid() {
        return triggerid;
    }

    public void setTriggerid(String triggerid) {
        this.triggerid = triggerid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Integer getLastchange() {
        return lastchange;
    }

    public void setLastchange(Integer lastchange) {
        this.lastchange = lastchange;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Trigger{" +
                "triggerid='" + triggerid + '\'' +
                ", description='" + description + '\'' +
                ", expression='" + expression + '\'' +
                ", comments='" + comments + '\'' +
                ", error='" + error + '\'' +
                ", flags=" + flags +
                ", lastchange=" + lastchange +
                ", priority=" + priority +
                ", state=" + state +
                ", status=" + status +
                ", templateid='" + templateid + '\'' +
                ", type=" + type +
                ", url='" + url + '\'' +
                ", value=" + value +
                '}';
    }
}
