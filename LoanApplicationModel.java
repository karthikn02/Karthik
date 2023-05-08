package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanApplicationModel {
	@Id
	private int loanid;
	private String loantype;
	private String applicantname;
	private String applicationaddress;
	private String applicationmobile;
	private String applicationemail;
	private String applicationaadhaar;
	private String applicationpan;
	private String applicationsalary;
	private String loanAmountRequired;
	private String loanRepaymentMonths;
	private int documentid;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantname() {
		return applicantname;
	}
	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}
	public String getApplicationaddress() {
		return applicationaddress;
	}
	public void setApplicationaddress(String applicationaddress) {
		this.applicationaddress = applicationaddress;
	}
	public String getApplicationmobile() {
		return applicationmobile;
	}
	public void setApplicationmobile(String applicationmobile) {
		this.applicationmobile = applicationmobile;
	}
	public String getApplicationemail() {
		return applicationemail;
	}
	public void setApplicationemail(String applicationemail) {
		this.applicationemail = applicationemail;
	}
	public String getApplicationaadhaar() {
		return applicationaadhaar;
	}
	public void setApplicationaadhaar(String applicationaadhaar) {
		this.applicationaadhaar = applicationaadhaar;
	}
	public String getApplicationpan() {
		return applicationpan;
	}
	public void setApplicationpan(String applicationpan) {
		this.applicationpan = applicationpan;
	}
	public String getApplicationsalary() {
		return applicationsalary;
	}
	public void setApplicationsalary(String applicationsalary) {
		this.applicationsalary = applicationsalary;
	}
	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	public int getDocumentid() {
		return documentid;
	}
	public void setDocumentid(int documentid) {
		this.documentid = documentid;
	}
	@Override
	public String toString() {
		return "LoanApplicationModel [loanid=" + loanid + ", loantype=" + loantype + ", applicantname=" + applicantname
				+ ", applicationaddress=" + applicationaddress + ", applicationmobile=" + applicationmobile
				+ ", applicationemail=" + applicationemail + ", applicationaadhaar=" + applicationaadhaar
				+ ", applicationpan=" + applicationpan + ", applicationsalary=" + applicationsalary
				+ ", loanAmountRequired=" + loanAmountRequired + ", loanRepaymentMonths=" + loanRepaymentMonths
				+ ", documentid=" + documentid + "]";
	}
	

}
