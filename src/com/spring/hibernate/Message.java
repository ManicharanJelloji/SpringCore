package com.spring.hibernate;

public class Message {
	private Long id;
	private String text;
	private Message nextMessage;
	
	public Message() {
		
	}
	public Message(String text) {
		this.text=text;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}
	public Long getId() {
		return id;
	}
	public String getText() {
		return text;
	}
	public Message getNextMessage() {
		return nextMessage;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + ", nextMessage=" + nextMessage + "]";
	}
	
}
