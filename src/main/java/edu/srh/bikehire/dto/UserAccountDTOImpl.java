package edu.srh.bikehire.dto;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.srh.bikehire.dtointerface.UserAccountDTO;
import edu.srh.bikehire.dtointerface.UserDTO;

@Entity
@Table(name = "UserAccount")
public class UserAccountDTOImpl implements UserAccountDTO{

	@Id
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID")
	private UserDTOImpl userDTO;
	@Column(name = "UserName")
	private String userName;
	@Column(name = "Role")
	private String role;
	@Column(name = "AccountStatus")
	private String accountStatus;
	@Column(name = "CreationTimeStamp")
	private Calendar creationTimeStamp;
	@Column(name = "LastModifiedTimeStamp")
	private Calendar lastModifiedTimeStamp;
	
	public String getId() {
		return userDTO.getId();
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public Calendar getCreationTimeStamp() {
		return creationTimeStamp;
	}
	public void setCreationTimeStamp(Calendar creationTimeStamp) {
		this.creationTimeStamp = creationTimeStamp;
	}
	public Calendar getLastModifiedTimeStamp() {
		return lastModifiedTimeStamp;
	}
	public void setLastModifiedTimeStamp(Calendar lastModifiedTimeStamp) {
		this.lastModifiedTimeStamp = lastModifiedTimeStamp;
	}
	public UserDTOImpl getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTOImpl userDTO) {
		this.userDTO = userDTO;
	}
	
	public void setUserDTO(UserDTO pUserDTO) {
		this.userDTO = (UserDTOImpl) pUserDTO;
	}
}
