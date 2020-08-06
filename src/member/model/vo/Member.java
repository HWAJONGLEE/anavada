package member.model.vo;

import java.sql.Date;

public class Member implements java.io.Serializable {
	public Member() {}
	
	private static final long selectServiceUID = 1L;
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberOriginal;
	private String memberRename;
	private String memberEmail;
	private String emailAuth;
	private String memberPhone;
	private java.sql.Date joinDate;
	private java.sql.Date lastAccessDate;
	
	public Member(String memberId, String memberPwd, String memberName, String memberOriginal, String memberRename,
			String memberEmail, String emailAuth, String memberPhone, Date joinDate, Date lastAccessDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberOriginal = memberOriginal;
		this.memberRename = memberRename;
		this.memberEmail = memberEmail;
		this.emailAuth = emailAuth;
		this.memberPhone = memberPhone;
		this.joinDate = joinDate;
		this.lastAccessDate = lastAccessDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberOriginal() {
		return memberOriginal;
	}

	public void setMemberOriginal(String memberOriginal) {
		this.memberOriginal = memberOriginal;
	}

	public String getMemberRename() {
		return memberRename;
	}

	public void setMemberRename(String memberRename) {
		this.memberRename = memberRename;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getEmailAuth() {
		return emailAuth;
	}

	public void setEmailAuth(String emailAuth) {
		this.emailAuth = emailAuth;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public java.sql.Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(java.sql.Date joinDate) {
		this.joinDate = joinDate;
	}

	public java.sql.Date getLastAccessDate() {
		return lastAccessDate;
	}

	public void setLastAccessDate(java.sql.Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}

	public static long getSelectserviceuid() {
		return selectServiceUID;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberOriginal=" + memberOriginal + ", memberRename=" + memberRename + ", memberEmail="
				+ memberEmail + ", emailAuth=" + emailAuth + ", memberPhone=" + memberPhone + ", joinDate=" + joinDate
				+ ", lastAccessDate=" + lastAccessDate + "]";
	}

	

}
