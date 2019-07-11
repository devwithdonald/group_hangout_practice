package com.revature.pojos;

public class UserMessage extends Message {
	
	private String senderName;
	
	private String receiverName;

	public UserMessage() {
		super();
	}

	public UserMessage(Integer messageId, String message, String timeOfMessage) {
		super(messageId, message, timeOfMessage);
	}

	public UserMessage(String senderName, String receiverName) {
		super();
		this.senderName = senderName;
		this.receiverName = receiverName;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((receiverName == null) ? 0 : receiverName.hashCode());
		result = prime * result + ((senderName == null) ? 0 : senderName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserMessage other = (UserMessage) obj;
		if (receiverName == null) {
			if (other.receiverName != null)
				return false;
		} else if (!receiverName.equals(other.receiverName))
			return false;
		if (senderName == null) {
			if (other.senderName != null)
				return false;
		} else if (!senderName.equals(other.senderName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserMessage [senderName=" + senderName + ", receiverName=" + receiverName + "]";
	}
	
	

	
}
