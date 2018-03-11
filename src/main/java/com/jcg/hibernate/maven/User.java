
package com.jcg.hibernate.maven;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {
@Id
@Column(name = "user_id")
private int userid;
@Column(name = "user_name")
private String username;
 @Column(name = "created_by")
private String createdBy;
@Column(name = "created_date")
 private Date createdDate;
/**
 * @return the createdBy
 */
public String getCreatedBy() {
	return createdBy;
}
/**
 * @return the userid
 */
public int getUserid() {
	return userid;
}
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @return the createdDate
 */
public Date getCreatedDate() {
	return createdDate;
}
/**
 * @param createdDate the createdDate to set
 */
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @param userid the userid to set
 */
public void setUserid(int userid) {
	this.userid = userid;
}
/**
 * @param createdBy the createdBy to set
 */
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}

}
