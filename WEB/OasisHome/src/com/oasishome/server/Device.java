package com.oasishome.server;

import java.io.Serializable;

public class Device implements Serializable {
	private static final long serialVersionUID = 2L;

	private long id = -1;
	private Long userId;
	private String name;
	private String nickname;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	private boolean status = false;
	private boolean active = false;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	private String micAddr;

	public String getMicAddr() {
		return micAddr;
	}

	public void setMicAddr(String micAddr) {
		this.micAddr = micAddr;
	}

	private long priority = 0;
	private long mod_date;

	private boolean isdeleted = false;

	// static constants used in code
	public static final int PRIORITY_NORMAL = 0;
	public static final int PRIORITY_HIGH = 2;
	public static final int PRIORITY_LOW = 1;
	public static final int TASK_COMPLETE = 1;
	public static final int TASK_PENDING = 0;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	// Will be used by the ArrayAdapter in the ListView
	@Override
	public String toString() {
		return name;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPriority() {
		return priority;
	}

	public void setPriority(long priority) {
		this.priority = priority;
	}

	public long getMod_date() {
		return mod_date;
	}

	public void setMod_date(long mod_date) {
		this.mod_date = mod_date;
	}

	

	public boolean isIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

}
