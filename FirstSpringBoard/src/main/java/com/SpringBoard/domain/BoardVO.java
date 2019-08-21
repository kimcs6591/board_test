package com.SpringBoard.domain;

import java.awt.List;
import java.util.ArrayList;

public class BoardVO {
	private String CD_COMPANY;
	private String NO_EMP;
	private String NM_KOR;
	private String NM_ENG;
//	private ArrayList<String> boardList;
	
	public String getCD_COMPANY() {
		return CD_COMPANY;
	}
	public void setCD_COMPANY(String cD_COMPANY) {
		CD_COMPANY = cD_COMPANY;
	}
	public String getNO_EMP() {
		return NO_EMP;
	}
	public void setNO_EMP(String nO_EMP) {
		NO_EMP = nO_EMP;
	}
	public String getNM_KOR() {
		return NM_KOR;
	}
	public void setNM_KOR(String nM_KOR) {
		NM_KOR = nM_KOR;
	}
	public String getNM_ENG() {
		return NM_ENG;
	}
	public void setNM_ENG(String nM_ENG) {
		NM_ENG = nM_ENG;
	}
	
	@Override
	public String toString() {
		return "BoardVO [CD_COMPANY=" + CD_COMPANY + ", NO_EMP=" + NO_EMP + ", NM_KOR=" + NM_KOR + ", NM_ENG=" + NM_ENG
				+ "]";
	}
	
	
	
	

	

}
