package com.gushaohua.study;

import java.util.Date;

public class InsistStudy extends BaseEntity {
	
	private boolean insist;
	
	private Date studyTime;
	
	private int insistNumber;

	
	
	
	public InsistStudy() {
		super();
	}

	public InsistStudy(boolean insist, Date studyTime, int insistNumber) {
		super();
		this.insist = insist;
		this.studyTime = studyTime;
		this.insistNumber = insistNumber;
	}

	@Override
	public String toString() {
		return "InsistStudy [insist=" + insist + ", studyTime=" + studyTime + ", insistNumber=" + insistNumber + "]";
	}

	/**
	 * @return the insist
	 */
	public boolean isInsist() {
		return insist;
	}

	/**
	 * @param insist the insist to set
	 */
	public void setInsist(boolean insist) {
		this.insist = insist;
	}

	/**
	 * @return the studyTime
	 */
	public Date getStudyTime() {
		return studyTime;
	}

	/**
	 * @param studyTime the studyTime to set
	 */
	public void setStudyTime(Date studyTime) {
		this.studyTime = studyTime;
	}

	/**
	 * @return the insistNumber
	 */
	public int getInsistNumber() {
		return insistNumber;
	}

	/**
	 * @param insistNumber the insistNumber to set
	 */
	public void setInsistNumber(int insistNumber) {
		this.insistNumber = insistNumber;
	}
	
	

}
