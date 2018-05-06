package com.bhanu.rest.myrest;


public class Greeting {

private final long id;
private final String content;
private String unused;
public Greeting(long id, String content) {

this.id =id;
this.content =content;
}

public long getId()
{ return id; }

public String getContent()
{ return content;
}
}
